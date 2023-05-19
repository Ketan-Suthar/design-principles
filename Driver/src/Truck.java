public class Truck implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("accelerating truck");
    }

    @Override
    public void brake() {
        System.out.println("slowing down truck");
    }

    @Override
    public void drive() {
        System.out.println("driving truck");
        this.accelerate();
        this.brake();
    }
}
