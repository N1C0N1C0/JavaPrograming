package chap09;

public class SubjectTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "Lee");
        studentLee.setKorea("국어", 100);
        studentLee.setMath("수학", 90);

        Student studentKim = new Student(200, "Kim");
        studentKim.setKorea("국어", 50);
        studentKim.setMath("수학", 65);

        studentLee.showScoreInfo();
        studentKim.showScoreInfo();
    }
}
