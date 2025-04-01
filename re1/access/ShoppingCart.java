package re1.access;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount < 10) {
            items[itemCount] = item;
            itemCount++;

        } else {
            System.out.println("장바구니가 가득 찼습니다.");
        }
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명: " + item.getProduct() + ", 합계: " + item.getPrice());
        }
        System.out.println("전체 가격 합: " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}
