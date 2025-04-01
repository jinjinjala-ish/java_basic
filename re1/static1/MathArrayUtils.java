package re1.static1;

public class MathArrayUtils {
    private static int sum = 0;
    private static int average = 0;

    public static int sum(int[] array) {
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int average(int[] array) {
        average = sum / array.length;
        return average;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int a : array) {
            if (min > a) {
                min = a;
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int a : array) {
            if (max < a) {
                max = a;
            }
        }
        return max;
    }
}
