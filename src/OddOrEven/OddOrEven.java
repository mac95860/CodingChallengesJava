package OddOrEven;

// Create a method that takes an integer as an argument and returns"even" for even integers and "odd" for odd integers.

public class OddOrEven {
    public static void main(String[] args) {
        int numEven = 4;
        int numOdd = 3;

        System.out.println(isEvenOrOdd(numEven));
        System.out.println(isEvenOrOdd(numOdd));
    }

    public static String isEvenOrOdd(int num) {
        String even = "even";
        String odd = "odd";

        if(num % 2 == 0) {
            return even;
        } else {
            return odd;
        }
    }


}
