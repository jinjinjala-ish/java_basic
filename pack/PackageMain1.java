package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data(); //동일한 패키지
        pack.a.User user = new pack.a.User(); //다른 패키지 일 때
    }
}
