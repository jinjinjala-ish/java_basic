package re1.array;

import java.util.Scanner;

public class ProductOrderScannerMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int num = s.nextInt();

        ProductOrder[] products = new ProductOrder[num];

        printOrder(num, s, products);

        getTotalPrice(products);
    }

    public static void printOrder(int num, Scanner s, ProductOrder[] products) {
        for (int i = 0; i < num; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = s.next();
            System.out.println();
            System.out.print("가격: ");
            int price = s.nextInt();
            System.out.print("수량: ");
            int quantity = s.nextInt();
            products[i] = new ProductOrder(productName, price, quantity);
        }
    }
    public static void getTotalPrice(ProductOrder[] products){
        int sum = 0;
        for (ProductOrder p : products) {
            sum += p.price * p.quantity;
        }
        System.out.println("총 결제 금액: " + sum);
    }
}
