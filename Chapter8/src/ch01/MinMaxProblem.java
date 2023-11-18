package ch01;

public class MinMaxProblem {
    public static void main(String[] args) {

        int[] number = {10,55,23,2,79,101,16,82,30,45};

        int min = number[0];
        int max = number[0];
        int minPosition = 0;
        int maxPosition = 0;

        for(int i=0; i<number.length; i++) {
            if(number[i] > max) {
                max = number[i];
                maxPosition = i+1;
            }
            if(number[i] < min) {
                min = number[i];
                minPosition = i+1;
            }
        }

        System.out.println("최댓갑: "+max + " 위치 : " + maxPosition);
        System.out.println("최소값: "+min + " 위치 : " + minPosition);
    }
}
