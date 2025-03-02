package re1.array;


public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder p1 = new ProductOrder("두부", 2000, 2);
        ProductOrder p2 = new ProductOrder("김치", 5000, 1);
        ProductOrder p3 = new ProductOrder("콜라", 1500, 2);

        ProductOrder[] products = new ProductOrder[]{p1, p2, p3};

        printOrders(products);

        getTotalAmount(products);
    }

    public static void printOrders(ProductOrder[] orders) {
        for (ProductOrder p : orders) {
            System.out.println("상품명: " + p.productName + ", 가격: " + p.price + ", 수량: " + p.quantity);
        }
    }

    public static void getTotalAmount(ProductOrder[] orders) {
        int totalPrice = 0;
        for (ProductOrder p : orders) {
            totalPrice += p.price * p.quantity;
        }
        System.out.println("총 결제 금액: " + totalPrice);
    }
}
