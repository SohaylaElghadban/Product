package product;

public class Physical implements ProductInfo {
    public static double price;
    public static int quantity;
    public int weight;
    public String marketName;
    public String productId;

    public Physical() {
        this.price = 0.0;
        this.quantity = 0;
        this.weight = 0;
        this.marketName = "";
    }

    public Physical(double price) {
        this.price = price;
        this.quantity = 0;
        this.weight = 0;
        this.marketName = "";
    }

    public Physical(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
        this.weight = 0;
        this.marketName = "";
    }

    public Physical(int weight, double price, String marketName) {
        this.price = price;

        this.weight = weight;
        this.marketName = marketName;
    }


    @Override
    public int getProductWeight() {
        return weight;
    }

    @Override
    public double getProductPrice() {
        return price;
    }

    @Override
    public String getProductMarketName() {
        return marketName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getproductId() {
        System.out.println(productId);
        return null;
    }

    public void setproductId() {
        this.productId = productId;
    }

    public int Calculate(int quantity, double price) {
        double sum = quantity * price;
        System.out.println("Total Value: " + sum);
        return 0;
    }

    public static void printProductData() {
        System.out.println("Product Price: " + price);
        System.out.println("Product Quantity: " + quantity);
    }
}
