package product;
import java.util.ArrayList;
import java.util.List;

class Vehicle {
    private String vehicleId;
    private double weightedLoad;
    private String vehicleType;
    private List<Physical> transportedProducts;

    public Vehicle(String vehicleId, double weightedLoad) {
        this.vehicleId = vehicleId;
        this.weightedLoad = weightedLoad;

        this.transportedProducts = new ArrayList<>();
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void addProduct(Physical product) throws Exception {
        if (getTotalWeight() + product.getProductWeight() <= weightedLoad) {
            transportedProducts.add(product);
        } else {
            throw new Exception("Vehicle can't carry more weight than " + weightedLoad);
        }
    }

    public double getTotalWeight() {
        double totalWeight = 0;
        for (Physical product : transportedProducts) {
            totalWeight += product.getProductWeight();
        }
        return totalWeight;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Physical product : transportedProducts) {
            totalPrice += product.getProductPrice();
        }
        return totalPrice;
    }

    public int getNumberOfProducts() {
        return transportedProducts.size();
    }

    public List<String> getMarketNames() {
        List<String> marketNames = new ArrayList<>();
        for (Physical product : transportedProducts) {
            marketNames.add(product.getProductMarketName());
        }
        return marketNames;
    }
}
