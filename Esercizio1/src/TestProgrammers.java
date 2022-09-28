public class TestProgrammers {
    public static void main(String[] args) {

Programmer programmer = new Programmer();
programmer.name = "Ismail";
programmer.age = 29;
programmer.wearsGlasses = false;

programmer.drinkCoffe();
    System.out.println(programmer.printDetails());

Programmer programmer1 = new Programmer();
programmer1.name = "Lorenzo";
programmer1.age = 30;
programmer1.wearsGlasses = true;

programmer1.printDetails();
        System.out.println(programmer1.hasGlasses());


    }
}
