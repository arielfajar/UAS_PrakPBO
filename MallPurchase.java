public class MallPurchase {
    public static void main(String[] args) {
        // Membuat beberapa item
        Item item1 = new Item("Baju", 25.99);
        Item item2 = new Item("Celana", 39.99);
        Item item3 = new Item("Sepatu", 79.99);

        // Membuat keranjang belanja
        ShoppingCart cart = new ShoppingCart();

        // Menambahkan item ke keranjang belanja
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        // Checkout dan hitung total belanja
        cart.checkout();

        // Penggunaan getter pada kelas Item
        System.out.println("--------------------------");
        System.out.println("Nama item: " + item1.getName());
        System.out.println("Harga item: $" + item1.getPrice());
    }
}