import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {

        List<Double> individualMarksListLisa = new ArrayList<>(2);
        individualMarksListLisa.add(5.5);
        individualMarksListLisa.add(7.5);
        List<Integer> projectMarksListJeremy = new ArrayList<>(2);
        projectMarksListJeremy.add(6);
        projectMarksListJeremy.add(5);

        double lisaAvg = Student.getAverageMark(individualMarksListLisa);
        double jeremyAvg = Student.getAverageMark(projectMarksListJeremy);
        System.out.println(lisaAvg);
        System.out.println(jeremyAvg);

        List<Student> listOfStudents = new ArrayList<>();

        listOfStudents.add(new Student("Lisa", "Stuart", lisaAvg));
        listOfStudents.add(new Student("Jeremy", "Green", jeremyAvg));

        System.out.println(listOfStudents.get(0));
        System.out.println(listOfStudents.get(1));
    }
}
