public class Vehicle {
    String id;
    String name;
    String model;

    public  Vehicle(){}

    public  Vehicle(String id, String name, String model) {
        this.id = id;
        this.name = name;
        this.model = model;
    }

    public void display() {
        System.out.println("Vehicle ID: " + id);
        System.out.println("Vehicle Name: " + name);
        System.out.println("Vehicle Model: " + model);
    }
}
