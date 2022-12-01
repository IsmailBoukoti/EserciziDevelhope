public class Student {

    String name;
    int grade;

    public Student(String name, int grade){
        System.out.println("Creating a new student");
        this.name = name;

    }

    public void getStudentDetails(){
        System.out.println(this.name + " " + this.grade);
    }

}
