import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BankTransactionSimulator {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/bankdb";
    private static final String USER = "root";
    private static final String PASS = "yourpassword";

    public void transferFunds(int fromAcct, int toAcct, double amount) {
        String debitSQL = "UPDATE accounts SET balance = balance - ? WHERE account_id = ?";
        String creditSQL = "UPDATE accounts SET balance = balance + ? WHERE account_id = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            conn.setAutoCommit(false);

            try (PreparedStatement debitStmt = conn.prepareStatement(debitSQL);
                 PreparedStatement creditStmt = conn.prepareStatement(creditSQL)) {

                debitStmt.setDouble(1, amount);
                debitStmt.setInt(2, fromAcct);
                debitStmt.executeUpdate();

                creditStmt.setDouble(1, amount);
                creditStmt.setInt(2, toAcct);
                creditStmt.executeUpdate();

                conn.commit();
                System.out.println("Transfer completed successfully.");

            } catch (SQLException ex) {
                conn.rollback();
                System.err.println("Transfer failed, transaction rolled back: " + ex.getMessage());
            }
        } catch (SQLException e) {
            System.err.println("Database connection error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        BankTransactionSimulator simulator = new BankTransactionSimulator();
        simulator.transferFunds(1001, 1002, 500.0);
    }
}
