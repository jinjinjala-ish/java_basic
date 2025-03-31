package re1.constructor;

public class MemberInit {
    String name;
    int age;
    int grade;

    MemberInit(String name, int age, int grade) { //생성자
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    //생성자가 하나라도 없으면 기본생성자를 만듦 -> 자바에서 알아서 만들어줌
    //기본생성자는 매개변수가 없는 메서드를 말한다.
    //MemberInit(){ //기본생성자
    // }
}
