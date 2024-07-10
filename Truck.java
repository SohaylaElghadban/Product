package product;
public class Truck extends Vehicle {
    private String vehicleId;

    public Truck(String vehicleId, int weightLoad, int maxProducts) {
        super(weightLoad, maxProducts);
        this.vehicleId = vehicleId;
    }

    @Override
    public void displayVehicleInfo() {
        System.out.println("Truck ID: " + vehicleId);
        System.out.println("Weight Load: " + weightLoad);
    }
}