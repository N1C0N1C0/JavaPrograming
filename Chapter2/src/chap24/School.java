package chap24;

public class School {
    private static School studentID = new School();


    private School() {}

    public static School getStudentID() {
        if(studentID == null)
            return new School();
        return studentID;
    }

    public Student createID(String name) {
        Student student = new Student(name);
        return student;
    }


}
