public class Vehicle {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car("Toyota", "Camry", 2020, 4);
        vehicles[1] = new Car("BMW", "X5", 2012, 4);
        vehicles[2] = new Motorcycle("Kawasaki", "Ninja", 2018, "Sport");
        vehicles[3] = new Motorcycle("Harley Davidson", "King", 2005, "Cruiser");

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
            System.out.println();
        }

    }

    protected String brand;
    protected String model;
    protected int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Vehicle Info:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public String toString() {
        return "Vehicle Info:" + "\n" +
                "Brand: " + brand + "\n" +
                "Model: " + model + "\n" +
                "Year: " + year+"\n";
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }
    public String toString(){
        return super.toString()+ "Number of doors: " + numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println();
    }
}

class Motorcycle extends Vehicle {
    String typeOfHandlebar;

    public Motorcycle(String brand, String model, int year, String typeOfHandlebar) {
        super(brand, model, year);
        this.typeOfHandlebar = typeOfHandlebar;
    }
    public String toString(){
        return  super.toString()+ "Type of Handlebar: " + typeOfHandlebar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type of Handlebar: " + typeOfHandlebar);
        System.out.println();
    }
}