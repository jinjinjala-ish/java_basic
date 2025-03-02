package re1.array;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("학생1", 19, 90);
        Student student2 = new Student("학생2", 18, 80);

        /*Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;*/
        Student[] students = new Student[]{student1, student2};

        for (Student s : students) {
            System.out.println(s.name + s.age + s.grade);
        }
    }
}
