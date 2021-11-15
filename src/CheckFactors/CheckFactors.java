package CheckFactors;

// Write a function that returns true if all integers in an array are factors of a number, and false otherwise.

public class CheckFactors {
    public static void main(String[] args) {
        System.out.println(
                isFactor(new int[]{2,3,4}, 12) // true
        );

        System.out.println(
                isFactor(new int[]{1,2,3,8}, 12) // false
        );
    }

    static boolean isFactor(int[] factors, int num) {
        for(int i = 0; i < factors.length; i++) {
            if(num % factors[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
