package Divisor;

public class Divisor {
    public static void main(String[] args) {
        System.out.println(
                findGreatestDivisor(32, 8) // 8
        );

        System.out.println(
                findGreatestDivisor(8, 12) // 4
        );

        System.out.println(
                findGreatestDivisor(17, 13) // 1
        );
    }

    static int findGreatestDivisor(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; ++i) {
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }
        return gcd;
    }
}
