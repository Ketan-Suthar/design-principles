public class App {
    public static void main(String[] args) {
        Vehicle truck = new Truck();
        Vehicle car = new Car();
        Driver driver = new Driver();

        driver.setVehicle(truck);
        driver.drive();

        driver.setVehicle(car);
        driver.drive();
    }
}