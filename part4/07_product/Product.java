public class Product {
    // Banana, price 1.1, 13 pcs

    private String name;
    private double price;
    private int quantity;

    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }

    public void printProduct() {
        String product = String.format("%s, price %.1f, %d pcs", this.name, this.price, this.quantity);
        System.out.println(product);
    }

}
