package generalTasksForOOP.onlineShop.service;

import generalTasksForOOP.onlineShop.model.CartItem;
import generalTasksForOOP.onlineShop.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<CartItem> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {
        items.add(new CartItem(product, quantity));
        System.out.println("Item added!");
    }

    public void removeItem(String productName) {
        boolean result = items.removeIf(item -> item.getProduct().getName().equalsIgnoreCase(productName));
        if (result)
            System.out.println("Item removed!");
        else
            System.out.println("Item not found...");
    }

    public void getTotalPrice() {
        double result = 0;
        for (CartItem item : items) {
            result += item.getTotalPrice();
        }
        System.out.printf("%.2f",result);
    }
}


