package product;

public class Car extends Vehicle {
    private String vehicleId;

    public Car(String vehicleId, int weightLoad, int maxProducts) {
        super(weightLoad, maxProducts);
        this.vehicleId = vehicleId;
    }

    @Override
    public void displayVehicleInfo() {
        System.out.println("Car ID: " + vehicleId);
        System.out.println("Weight Load: " + weightLoad);
    }
}