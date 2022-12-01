public class Tester {
    public static void main(String[] args) {
        SmartphonePrice producer1 = new SmartphonePrice("Producer", 500);
        SmartphonePrice producer2 = new SmartphonePrice("Producer", 650);

        SmartphonePrice retail1 = new SmartphonePrice("Retail", 750);
        SmartphonePrice retail2 = new SmartphonePrice("Retail", 900);

        Smartphone smartphone1 = new Smartphone("Samsung","Galaxy",
                450, producer1, retail1);
        Smartphone smartphone2 = new Smartphone("Apple", "Iphone 10",
                500, producer2, retail2);

        System.out.println("Product 1 details : " + smartphone1);
        System.out.println("Product 2 details : " + smartphone2);

        boolean test = smartphone1.equals(smartphone2);
        System.out.println("Is the first smartphone equal to the second one? " + test);

    try{
        Smartphone clonedSmartPhone = (Smartphone)smartphone2.clone();
        boolean test2 = smartphone2.equals(clonedSmartPhone);
        System.out.println("Is the second smartphone equal to the cloned one? " + test2);
    } catch (Exception e) {
        e.printStackTrace();
        System.out.println("Error!");
    }

  }

}
