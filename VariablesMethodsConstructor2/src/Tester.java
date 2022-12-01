public class Tester {
    public static void main(String[] args) {

        Student student1;
        Student student2;

        Teacher teacher;

        teacher = new Teacher("Mario");

        student1 = new Student("Giovanni", 6 );
        student2 = new Student("Luca", 7);

        teacher.assignGrade(student1, 8 );
        teacher.assignGrade(student2, 7);

        student1.getStudentDetails();
        student2.getStudentDetails();
    }
}
