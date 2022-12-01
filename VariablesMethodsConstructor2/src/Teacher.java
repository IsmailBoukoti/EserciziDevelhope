public class Teacher {
    
    String teacherName;

    public Teacher(String name){
        this.teacherName = name;
        System.out.println("Creating a new teacher ");
    }
    public void assignGrade(Student alum, int finalGrade){
       alum.grade = finalGrade;
    }

}
