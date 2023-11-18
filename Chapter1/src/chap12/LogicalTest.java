package chap12;

public class LogicalTest {
    public static void main(String[] args) {

        int num1 = 10;
        int i = 2;

        boolean value1 = ((num1 += 10) < 10) && ((i += 2) < 10);

        System.out.println(value1);
        System.out.println(num1);
        System.out.println(i);


        int num2 = 10;
        int i2 = 2;

        boolean value2 = ((num2 += 10) < 10) || ((i2 += 2) < 10);

        System.out.println(value2);
        System.out.println(num2);
        System.out.println(i2);
    }
}
