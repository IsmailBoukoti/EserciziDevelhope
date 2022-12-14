import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {

    Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","root","password");

        Statement statement = connection.createStatement();

        String createTable = "CREATE TABLE IF NOT EXISTS `newdb`.`students` (\n" +
                "  `student_id` INT NOT NULL AUTO_INCREMENT,\n" +
                "  `last_name` VARCHAR(30) NULL,\n" +
                "  `first_name` VARCHAR(30) NULL,\n" +
                "  PRIMARY KEY (`student_id`));";

        statement.executeUpdate(createTable);

        statement.executeUpdate("insert into students (last_name,first_name) value (\"Rossi\",\"Mario\");");
        statement.executeUpdate("insert into students (last_name,first_name) value (\"Verdi\",\"Luigi\");");
        statement.executeUpdate("insert into students (last_name,first_name) value (\"Bianchi\",\"Lucia\");");
        statement.executeUpdate("insert into students (last_name,first_name) value (\"Gialli\",\"Maria\");");

    }
}
