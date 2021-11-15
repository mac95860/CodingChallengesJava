package Sum;

// Create a function that takes two numbers and returns their sum

public class Sum {
    public static void main(String[] args) {
        System.out.println(
                sumOfTwoNumbers(1, 3)
        );
    }

    static int sumOfTwoNumbers(int... k) {
        return k[0] + k[1];
    }
}
