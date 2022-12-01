public class Boat extends Vehicle {
    double maxKnotSpeed;
    int boatKilosWeight;

    @Override
    public void doVehicleSound(){
        super.doVehicleSound();
        System.out.println("Brrrrrrrr");
    }
    public Boat(double maxKnotSpeed, int boatKilosWeight, String type){
        this.maxKnotSpeed = maxKnotSpeed;
        this.boatKilosWeight = boatKilosWeight;
        this.type = type;
    }
    public String getBoatWeightAndSpeed(){
        return "Boat travels at " + maxKnotSpeed +" knots " + "and it weights " + boatKilosWeight + " kilos";
    }
}
