import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ScholarRecordManager {
    private static final String URL = "jdbc:mysql://localhost:3306/schooldb";
    private static final String USER = "root";
    private static final String PASS = "yourpassword";

    public void addStudent(int studentId, String fullName) {
        String insertSql = "INSERT INTO students (student_id, full_name) VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(insertSql)) {

            pstmt.setInt(1, studentId);
            pstmt.setString(2, fullName);
            int rows = pstmt.executeUpdate();
            System.out.println("Rows inserted: " + rows);

        } catch (Exception e) {
            System.err.println("Insertion error: " + e.getMessage());
        }
    }

    public void updateStudentName(int studentId, String newName) {
        String updateSql = "UPDATE students SET full_name = ? WHERE student_id = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(updateSql)) {

            pstmt.setString(1, newName);
            pstmt.setInt(2, studentId);
            int rows = pstmt.executeUpdate();
            System.out.println("Rows updated: " + rows);

        } catch (Exception e) {
            System.err.println("Update error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ScholarRecordManager manager = new ScholarRecordManager();
        manager.addStudent(101, "Jessica Pearson");
        manager.updateStudentName(101, "Jessica P.");
    }
}
