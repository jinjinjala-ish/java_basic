package re1.access;

public class MaxCounter {
    private int count;
    int max;

    MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (max > count) {
            count++;
        } else {
            System.out.println("최대값보다큼");
        }
    }

    public int getCount() {
        return count;
    }
}
