import java.util.ArrayList;
import java.util.List;

public class Student {
    String studentName;
    String studentSurname;
    double marksAverage;

public Student (String name,String surname, double marksAverage){
    this.studentName = name;
    this.studentSurname = surname;
    this.marksAverage = marksAverage;
    }

    public static double getAverageMark(List<? extends Number> listOfMarks){
        return (listOfMarks.get(0).doubleValue() +  listOfMarks.get(1).doubleValue()) / 2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName = '" + studentName + '\'' +
                ", studentSurname = '" + studentSurname + '\'' +
                ", marksAverage = " + marksAverage +
                '}';
    }
}
