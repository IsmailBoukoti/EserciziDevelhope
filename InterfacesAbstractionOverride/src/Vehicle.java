public abstract class Vehicle {
    String type;
    int numberOfWheels;

    public void showVehicleDetails(){
        System.out.println("Vehicle is a " + type + " " + "and it has " + numberOfWheels + " Wheels");
    }
    void doVehicleSound(){}
}
