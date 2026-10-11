public class Car extends Vehicle {
    int seats;
    String fuelType;

    public Car(){
        super();// kế thừa hàm khởi tạo ko tham số của class cha
    }

    public Car(String id, String name, String model, int seats, String fuelType) {
        super(id, name, model);
        this.seats = seats;
        this.fuelType = fuelType;
    }

    public void display(){
        super.display();
        System.out.println("Seats: " + seats);
        System.out.println("Fuel Type: " + fuelType);
    }
}
