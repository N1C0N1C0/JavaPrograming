package ch09;

public class arrayIndexException {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        try {
            for(int i=0; i<6; i++) {
                System.out.println(arr[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }

        System.out.println("here!!");
    }
}
