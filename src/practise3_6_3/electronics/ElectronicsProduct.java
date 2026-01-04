package practise3_6_3.electronics;


public class ElectronicsProduct {
    private final int productId;
    private final String productName;
    private double price;

    public int getProductId() {
        return productId;
    }



    public String getProductName() {
        return productName;
    }




    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


    public ElectronicsProduct(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
}
