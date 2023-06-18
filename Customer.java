// Class Customer untuk merepresentasikan pelanggan
class Customer {
    private ShoppingCart cart;

    public Customer(String name) {
        cart = new ShoppingCart();
    }

    public void addItemToCart(Item item) {
        cart.addItem(item);
    }

    public void removeItemFromCart(Item item) {
        cart.removeItem(item);
    }

    public void checkout() {
        cart.checkout();
    }
}