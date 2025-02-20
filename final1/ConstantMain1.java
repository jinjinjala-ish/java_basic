package final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        /*System.out.println("프로그램 최대 참여자 수 : " + 1000);*/
        //참여자 수는 상수임
        System.out.println("프로그램 최대 참여자 수: " + Constant.MAX_USERS);
        int currentUserCount = 999;
    }
    private static void process(int currentUserCount) {
        System.out.println("참여자 수 : " + currentUserCount);
        if (currentUserCount > Constant.MAX_USERS) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참여해야 합니다.");
        }
    }
}
