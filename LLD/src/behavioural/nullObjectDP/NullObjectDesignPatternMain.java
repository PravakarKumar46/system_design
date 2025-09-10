package behavioural.nullObjectDP;

public class NullObjectDesignPatternMain {
    public static void main(String[] args) {

        Vehicle vehicle1 = VehicleFactory.getObjectName("car");
        Vehicle vehicle2 = VehicleFactory.getObjectName("bike");
        System.out.println("car price :" + vehicle1.price());
        System.out.println("NULL Object DP: " + vehicle2.price());

    }
}
