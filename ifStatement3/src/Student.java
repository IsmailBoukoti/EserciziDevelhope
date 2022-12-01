import java.util.Random;

public class Student {
    public String name;
    public int age;

    public Student(String studentName, int studentAge){
        this.name = studentName;
        this.age = studentAge;
    }
     public void guessingAge(){
        Random random = new Random();
        int nextRandom = random.nextInt(35);
        System.out.println("I generated the random number " + nextRandom + " for student " + name);
        if(nextRandom>age) {
            System.out.println("Guessed number is higher than student's age, try again!");
        }else if(nextRandom < age) {
            System.out.println("Guessed number is lower than student's age, try again!");
        }else {
            System.out.println("You guessed the student's age!");
        }
    }
}
