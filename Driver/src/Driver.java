public class Driver {
    private Vehicle vehicle;

    void setVehicle(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    void drive() {
        vehicle.drive();
    }
}
