package chap06;

public class StudentTest {
    public static void main(String[] args) {

        Student studentLee = new Student(123456, "Lee", 3);

        System.out.println(studentLee.showStudentInfo());

        Student studentKim = new Student();
        studentKim.studentName = "Kim";

        System.out.println(studentKim.showStudentInfo());
    }
}
