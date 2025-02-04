package oop1;

public class ValueObjectMain {
    public static void main(String[] args) {
        ValueData vd = new ValueData();
        vd.valueUp();
        vd.valueUp();
        vd.valueUp();
        System.out.println("최종 숫자 = " + vd.value);
    }
}
