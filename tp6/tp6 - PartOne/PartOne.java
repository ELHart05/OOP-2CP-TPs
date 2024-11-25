import java.util.ArrayList;

public class PartOne {

    public static void loadWheels(ArrayList<Wheel> wheelArray, int numberOfWheels, Wheel Wheel) {
        while (numberOfWheels > 0) {
            wheelArray.add(Wheel);
            numberOfWheels--;
        }
    }

    public static void main(String[] args) {

        Wheel CarWheel = new Wheel(20);
        Wheel TruckWheel = new Wheel(40);
        Wheel BikeWheel = new Wheel(5);

        ArrayList<Wheel> CarWheels = new ArrayList<>(4);
        ArrayList<Wheel> TruckWheels = new ArrayList<>(4);
        ArrayList<Wheel> BikeWheels = new ArrayList<>(2);

        loadWheels(CarWheels, 4, CarWheel);
        loadWheels(BikeWheels, 10, TruckWheel);
        loadWheels(BikeWheels, 2, BikeWheel);

        Car Renault = new Car(1520, 180, "Symbol", "A10", CarWheels);
        Truck Volvo = new Truck(1594520, 2400, 3, 560, TruckWheels);
        Bike Between = new Bike(1520, "Mini", "T-45", BikeWheels);

        Renault.goBackward();
        Renault.showWheels();
        Volvo.start();
        Between.goForward();
    }

}

class Wheel {
    private double wheelSize;

    public Wheel(double wheelSize) {
        this.wheelSize = wheelSize;
    }

    public void printWheelInfo() {
        System.out.println("the is a wheel with the size of: " + wheelSize);
    }

    public void printWheelState() {
        System.out.println("Wheels are turning");
    }
}

class Vehicule {
    protected int Matricule;

    public Vehicule(int Matricule) {
        this.Matricule = Matricule;
    }

    public int getMatricule() {
        return Matricule;
    }

    public void setMatricule(int matricule) {
        Matricule = matricule;
    }

    public void goBackward() {
        System.out.println("going backward...");
    }

    public void goForward() {
        System.out.println("going forward...");
    }

    public void start() {
        System.out.println("starting...");
    }

    public void stop() {
        System.out.println("stoping...");
    }
}

class Car extends Vehicule {

    private double weight;
    private String name;
    private String type;
    private ArrayList<Wheel> wheels;

    public Car(int Matricule, double weight, String name, String type, ArrayList<Wheel> wheels) {
        super(Matricule);
        this.weight = weight;
        this.name = name;
        this.type = type;
        this.wheels = wheels;
    }

    public void addWheels() {

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public ArrayList<Wheel> getWheels() {
        return wheels;
    }

    public void showWheels() {
        for (Wheel wheel : wheels) {
            wheel.printWheelInfo();
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setWheels(ArrayList<Wheel> wheels) {
        this.wheels = wheels;
    }

    public void printCarInfo() {
        System.out.println(
                "this is a a car with the name: " + name + " of type: " + type + " with the weight: " + weight
                        + " kg");
    }
}

class Truck extends Vehicule {

    private double loadCapacity;
    private int numberReserveWheels;
    private double weight;
    private ArrayList<Wheel> wheels;

    public Truck(int Matricule, double loadCapacity, int numberReserveWheels, double weight, ArrayList<Wheel> wheels) {
        super(Matricule);
        this.loadCapacity = loadCapacity;
        this.numberReserveWheels = numberReserveWheels;
        this.weight = weight;
        this.wheels = wheels;

    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public int getNumberReserveWheels() {
        return numberReserveWheels;
    }

    public double getWeight() {
        return weight;
    }

    public ArrayList<Wheel> getWheels() {
        return wheels;
    }

    public void showWheels() {
        for (Wheel wheel : wheels) {
            wheel.printWheelInfo();
        }
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void setNumberReserveWheels(int numberReserveWheels) {
        this.numberReserveWheels = numberReserveWheels;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setWheels(ArrayList<Wheel> wheels) {
        this.wheels = wheels;
    }

    public void printTruckInfo() {
        System.out.println(
                "this is a a truck with a load capacity of: " + loadCapacity + " and a number of reserveWheels: "
                        + numberReserveWheels + " with the weight: "
                        + weight + " kg");
    }
}

class Bike extends Vehicule {

    private String name;
    private String model;
    private ArrayList<Wheel> wheels;

    public Bike(int Matricule, String name, String model, ArrayList<Wheel> wheels) {
        super(Matricule);
        this.name = name;
        this.model = model;
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public ArrayList<Wheel> getWheels() {
        return wheels;
    }

    public void showWheels() {
        for (Wheel wheel : wheels) {
            wheel.printWheelInfo();
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWheels(ArrayList<Wheel> wheels) {
        this.wheels = wheels;
    }

    public void printTruckInfo() {
        System.out.println(
                "this is a a bike with the name: " + name + " a model of: "
                        + model);
    }
}
