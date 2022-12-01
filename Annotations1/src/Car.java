public class Car {
    public String modelName;
    public String mileage;

    public Car(String modelName,String mileage){
        this.modelName = modelName;
        this.mileage = mileage;
    }

    @SuppressWarnings("DeprecatedIsStillUsed")
    @Deprecated
    public void printCarDetails(){
        System.out.println(this.modelName+" "+this.mileage);
    }
    public void GetCarDetails(){
        System.out.println(this.modelName);
        System.out.println(this.mileage);
    }
}
