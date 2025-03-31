package re1.constructor;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {
      /*  this.name = name;
        this.age = age;
        grade = 50;*/
        //name과 age는 밑 생성자와 중복됨
        this(name, age, 50);

    }

    MemberConstruct(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
