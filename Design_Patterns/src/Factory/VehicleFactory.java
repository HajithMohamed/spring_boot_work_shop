package Factory;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicle){
        if(vehicle.equalsIgnoreCase("car"))return new Car();
        else if (vehicle.equalsIgnoreCase("bike")) return new Bike();
        throw  new IllegalArgumentException("Invalid vehicle");
    }
}
