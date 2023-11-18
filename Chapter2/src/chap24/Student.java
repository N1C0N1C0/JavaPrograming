package chap24;

import java.util.ArrayList;

public class Student {
    private static int studentID = 1000;
    private int studentNum;
    private String studentName;
    ArrayList<Subject> subjectList;

    Student(String studentName) {
        studentID++;
        studentNum = studentID;
        this.studentName = studentName;

        subjectList = new ArrayList<>();
    }

    public void addSubject(String name, int point) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setPoint(point);
        subjectList.add(subject);
    }

    public void showInfo() {
        int total = 0;
        for(Subject s : subjectList) {
            total += s.getPoint();
            System.out.println("학생 " + studentName + "의 " + s.getName() + "과목 성적은 " +
                    s.getPoint() + "입니다.");
        }
        System.out.println(studentNum + "번 " + studentName + " 학생의 총점은 " +
                total + "입니다.");
    }


}
