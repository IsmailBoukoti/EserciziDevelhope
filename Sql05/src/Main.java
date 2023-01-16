import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "Passworld@0");
        Statement stmt = connection.createStatement();


        String varname1 = "CREATE VIEW italian_students AS\n" +
                "SELECT last_name, first_name\n" +
                "FROM students\n" +
                "WHERE Country = \"Italy\";";

        String varname2 = "CREATE VIEW german_students AS\n" +
                "SELECT last_name, first_name\n" +
                "FROM students\n" +
                "WHERE Country = \"Germany\";";

      //  stmt.executeUpdate(varname1);
      //  stmt.executeUpdate(varname2);

        ArrayList<Student> italianStudents = new ArrayList<>();
        ArrayList<Student> germanStudents = new ArrayList<>();

        ResultSet rs1 = stmt.executeQuery("SELECT first_name, last_name FROM italian_students");

        while (rs1.next()){
            italianStudents.add(new Student(rs1.getString("first_name"), rs1.getString("last_name")));
        }

        ResultSet rs2 = stmt.executeQuery("SELECT first_name, last_name FROM german_students");

        while (rs2.next()){
            germanStudents.add(new Student(rs2.getString("first_name"), rs2.getString("last_name")));
        }

        for(Student student : italianStudents){
            System.out.println(student.getName() + " " + student.getSurname());}

        for(Student student : germanStudents){
            System.out.println(student.getName() + " " + student.getSurname());

        connection.close();
        }
    }
}
