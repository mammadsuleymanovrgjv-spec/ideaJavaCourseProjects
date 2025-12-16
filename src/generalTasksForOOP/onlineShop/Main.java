package generalTasksForOOP.onlineShop;

import generalTasksForOOP.onlineShop.model.Product;
import generalTasksForOOP.onlineShop.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product p1 = new Product("T-Shirt", 25.99);
        Product p2 = new Product("Laptop", 650.99);
        Product p3 = new Product("Iphone 13 Pro", 1399.99);
        shoppingCart.addItem(p1, 4);
        shoppingCart.addItem(p2, 2);
        shoppingCart.addItem(p3, 1);
        shoppingCart.removeItem("laptop");
        shoppingCart.getTotalPrice();
    }
}
