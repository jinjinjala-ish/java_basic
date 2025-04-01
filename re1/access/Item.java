package re1.access;

public class Item {
    private String product;
    private int price;
    private int quantity;

    Item(String product, int price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public int getPrice() {
        return price * quantity;
    }
}
