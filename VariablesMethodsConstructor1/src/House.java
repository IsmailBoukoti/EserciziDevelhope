public class House {

    String address;
    int numberOfFloors;
    int numberOfRooms;

    public House(String address, int numberOfFloors, int numberOfRooms){
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        this.numberOfRooms = numberOfRooms;
        System.out.println( "A new house has been created");
    }
}
