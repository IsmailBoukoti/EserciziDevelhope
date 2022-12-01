public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animale");
        Lion lion = new Lion("Leo");
        Cow cow = new Cow("Mucca");

        animal.animalSound();
        lion.animalSound();
        cow.animalSound();
    }
}
