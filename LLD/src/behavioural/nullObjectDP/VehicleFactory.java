package behavioural.nullObjectDP;

public class VehicleFactory {

    public static Vehicle getObjectName(String type) {
        if ("car".equalsIgnoreCase(type)) {
            return new Car();
        }
        return new NullObjectVehicle(); // Return Null Object instead of null
    }
}
