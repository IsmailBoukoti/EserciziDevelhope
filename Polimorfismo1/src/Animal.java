public class Animal {

    public String animalName;


    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public void animalSound() {
    }

    public void animalSound(String intensity) {
        switch (intensity) {
            case "High" -> System.out.println("Roarrrrrrrrrrrrrrr!");
            case "Low" -> System.out.println("Roar");
            default -> System.out.println("Cannot reproduce it properly");
        }
    }
}

