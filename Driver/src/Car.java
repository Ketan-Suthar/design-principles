public class Car implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("accelerating car");
    }

    @Override
    public void brake() {
        System.out.println("slowing down car");
    }

    @Override
    public void drive() {
        System.out.println("driving car");
        this.accelerate();
        this.brake();
    }
}
