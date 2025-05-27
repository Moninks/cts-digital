import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScholarDBConnector {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/schooldb";
        String userName = "root";
        String password = "yourpassword";

        try (Connection conn = DriverManager.getConnection(jdbcUrl, userName, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT student_id, full_name FROM students")) {

            while (rs.next()) {
                int id = rs.getInt("student_id");
                String name = rs.getString("full_name");
                System.out.println("Student #" + id + ": " + name);
            }

        } catch (Exception e) {
            System.err.println("Error connecting or querying DB: " + e.getMessage());
        }
    }
}
