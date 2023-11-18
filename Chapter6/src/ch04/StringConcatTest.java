package ch04;

public class StringConcatTest {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World";

        StringConcatImpl strImpl = new StringConcatImpl();
        strImpl.makeString("Hello", "World");

        System.out.println("Lambda");
        StringConcat concat = (s, v) -> System.out.println(s + ", " + v);
        concat.makeString(s1, s2);

        // 익명 내부 클래스 생략 되어있음
        StringConcat concat2 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + "...." + s2);
            }
        };

        concat2.makeString(s1, s2);
    }
}
