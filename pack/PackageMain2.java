package pack;

import pack.a.*;
//import pack.a.User;
//import pack.a.User2;

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data(); //동일한 패키지
        User user = new User(); //다른 패키지
        User2 user2 = new User2(); //다른 패키지
    }

}
