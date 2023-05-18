

class Computer {
    IDisplayModule displayModule;

    public void setDisplayModule(final IDisplayModule displayModule) {
        this.displayModule = displayModule;
    }

    public void display() {
        displayModule.display();
    }
}

public class app {
    public static void main(String[] args) {

        Computer computer = new Computer();
        Projector projector = new Projector();
        Monitor monitor = new Monitor();
        Tablet tablet = new Tablet();

        computer.setDisplayModule(projector);
        computer.display();

        computer.setDisplayModule(monitor);
        computer.display();

        computer.setDisplayModule(tablet);
        computer.display();
    }
}