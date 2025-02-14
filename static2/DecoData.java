package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
        staticValue++; //정적 변수 접근 가능
        staticMethod(); //정적 메서드 접근 가능

        /*instanceValue++; //정적 변수가 아니면 접근 불가능
        instanceMethod(); //정적 메서드 접근 불가능*/
    }

    public void instanceCall() {
        instanceValue++;
        staticValue++;
        instanceMethod();
        staticMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
