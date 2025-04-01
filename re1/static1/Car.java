package re1.static1;

public class Car {
    private String productName;
    private static int countProduct;

    Car(String productName) {
        this.productName = productName;
        countProduct++;
        System.out.println("차량구입, 이름: " + productName);
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + countProduct);
    }
}
