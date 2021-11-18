package SumOfArray;
// return the sum of all the integers in an array
public class SumOfArray {
    public static void main(String[] args) {
        System.out.println(
                sum(new int[]{2,5, 7}) // 14
        );

        System.out.println(
                sum(new int[]{1, 6, 20}) // 27
        );
    }

    static int sum(int[] arr) {
        int a = 0;
        for(int i = 0; i < arr.length; i++){
            a += arr[i];
        }
        return a;
    }
}
