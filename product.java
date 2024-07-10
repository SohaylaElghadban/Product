package product;

import java.io.*;
import java.util.*;

public class Main {
    private static List<Vehicle> vehicles = new ArrayList<>();
    private static List<Physical> products = new ArrayList<>();

    public static void readVehiclesFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String vehicleId = parts[0];

            double vehicleLoad = Double.parseDouble(parts[1]);
            vehicles.add(new Vehicle(vehicleId, vehicleLoad));
        }
        reader.close();
    }

    public static void readProductsFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String productId = parts[0];
            String productType = parts[1];
            String productMarketName = parts[2];
            double productPrice = Double.parseDouble(parts[3]);
            if (productType.equals("digital")) {
                products.add(new digitalproduct(productPrice));
            } else if (productType.equals("physical")) {
                double productWeight = Double.parseDouble(parts[4]);
                products.add(new Physical((int) productWeight, productPrice,productMarketName));
            }
        }
        reader.close();
    }

    public static void readProductLoadsFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String vehicleId = parts[0];
            String productId = parts[1];
            Vehicle vehicle = findVehicleById(vehicleId);
            //Physical product = findProductById(productId);
            try {
                vehicle.addProduct(product);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        reader.close();
    }

    public static Vehicle findVehicleById(String vehicleId) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId().equals(vehicleId)) {
                return vehicle;
            }
        }
        return null;
    }

    public static String findProductById(String productId) {
        for (Physical product : products) {

            if (product.getproductId().contains( productId)) {
                return productId;
            }
        }
        return null;
    }

    public static void writeOutputFile(String filename) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        for (Vehicle vehicle : vehicles) {
            double totalWeight = vehicle.getTotalWeight();
            boolean exceedsWeightLimit = totalWeight > vehicle.getTotalWeight();
            double totalPrice = exceedsWeightLimit ? 0 : vehicle.getTotalPrice();
            List<String> marketNames = exceedsWeightLimit ? Collections.singletonList("N/A") : vehicle.getMarketNames();
            writer.write(String.format("%s,%b,%.2f,%.2f,%s\n",
                    vehicle.getVehicleId(),
                    exceedsWeightLimit,
                    exceedsWeightLimit ? 0 : totalWeight,
                    exceedsWeightLimit ? 0 : totalPrice,
                    String.join(",", marketNames)));
        }
        writer.close();
    }

    public static void main(String[] args) {
        try {
            readVehiclesFile("vehicles.txt");
            readProductsFile("products.txt");
            readProductLoadsFile("product_loads.txt");
            writeOutputFile("output.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
