package practise3_6_3.electronics;

public class Refrigator extends ElectronicsProduct {
    public Refrigator(int productId, String productName, double price) {
        super(productId, productName, price);
    }
    public void refrigatorInfo(){
        System.out.println("Refrigator Id: "+getProductId());
        System.out.println("Refrigator Name: "+getProductName());
        System.out.println("Refrigator Price: "+getPrice());
    }

    public void calculatePrice(double discount) {
        setPrice(getPrice() * discount);
        System.out.println("Refrigator price is: " + getPrice());
    }
}
