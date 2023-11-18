package chap20;

public class ElementsTest {
    public static void main(String[] args) {
        double[] dArr = new double[5];
        double total = 1;
        int count = 0;
        dArr[0] = 1.1; count++;
        dArr[1] = 2.1; count++;
        dArr[2] = 3.1; count++;

        for(int i=0; i<count; i++) {
            total *= dArr[i];
        }

        System.out.println(total);
    }
}
