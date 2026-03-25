package Factory;

public class VehicleFactoryDemo {
    public static void main(String[] args) {
        Vehicle v1 = VehicleFactory.getVehicle("car");
        Vehicle v2 = VehicleFactory.getVehicle("bike");
//        Vehicle v3 = VehicleFactory.getVehicle("Bus");

        v1.start();
        v2.start();

    }
}
