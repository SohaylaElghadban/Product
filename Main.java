package product;

import java.util.Scanner;

/*public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the type of product (normal, digital):");
        String productType = scanner.nextLine();

        Nproduct p;

        if (productType.equalsIgnoreCase("normal")) {
            System.out.println("Enter the weight of the product:");
            double weight = scanner.nextDouble();
            System.out.println("Enter the price of the product:");
            double price = scanner.nextDouble();
            scanner.nextLine();  // Consume newline
            System.out.println("Enter the market name of the product:");
            String marketName = scanner.nextLine();

            p= new Nproduct((int)weight, price, marketName);
        } else if (productType.equalsIgnoreCase("digital")) {
            System.out.println("Enter the price of the digital product:");
            double price = scanner.nextDouble();
            p= digitalproduct(price);
        } else {
            System.out.println("Invalid product type");
            scanner.close();
            return;
        }

        System.out.println("Product Properties:");
        System.out.println("Weight: " + Nproduct.getProductWeight());
        System.out.println("Price: " + Nproduct.getPrice());
        System.out.println("Market Name: " + Nproduct.getMarketName());

        scanner.close();
    }
}*/
