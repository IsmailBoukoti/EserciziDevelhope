public class Car extends Vehicle {
    int numberOfDoors;
    double carPrice;
    @Override
    public void showVehicleDetails(){
        super.showVehicleDetails();
        System.out.println("The car has " + numberOfDoors + " doors");
    }
    @Override
    public void doVehicleSound(){
        super.doVehicleSound();
        System.out.println("Vroooooooom");
    }
    public Car(int wheels, int numberOfDoors, double carPrice,String type){
        this.numberOfWheels = wheels;
        this.numberOfDoors =  numberOfDoors;
        this.carPrice = carPrice;
        this.type = type;
    }
}
