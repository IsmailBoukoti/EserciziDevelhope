public class Tester {
    public static void main(String[] args) {
        Car car = new Car(4,4,17900,"Car");
        Boat boat = new Boat(20,385,"Boat");

        car.showVehicleDetails();
        car.doVehicleSound();

        boat.showVehicleDetails();
        boat.doVehicleSound();

        System.out.println(boat.getBoatWeightAndSpeed());

    }
}
