import java.util.ArrayList;
import java.util.List;

// Class ShoppingCart untuk mengelola keranjang belanja
class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void checkout() {
        double total = calculateTotal();
        System.out.println("Total belanja: $" + total);
        // Logika pembayaran, pengurangan stok, dll.
    }
}
