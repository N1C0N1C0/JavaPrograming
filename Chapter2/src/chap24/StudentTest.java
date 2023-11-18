package chap24;

public class StudentTest {
    public static void main(String[] args) {
        School school = School.getStudentID();
        Student lee = school.createID("Lee");
        Student kim = school.createID("Kim");

        lee.addSubject("국어", 100);
        lee.addSubject("수학", 50);
        lee.showInfo();
        System.out.println("==================");
        kim.addSubject("국어",70);
        kim.addSubject("수학",85);
        kim.addSubject("영어",100);
        kim.showInfo();
    }
}
