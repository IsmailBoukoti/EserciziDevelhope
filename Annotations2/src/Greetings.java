public class Greetings {

    @DevAnnotation(devName = "John", devSurname = "Walker")
    public void sayWelcome() {
        System.out.println("Welcome");
    }
    @DevAnnotation(devName = "Mark",devSurname = "Mark Brown")
    public void sayGoodbye(){
        System.out.println("Goodbye");
    }
}
