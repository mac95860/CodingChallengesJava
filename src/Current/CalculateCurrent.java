package Current;

// Create a function that calculates the Power generated by a given Voltage and Current.

public class CalculateCurrent {
    public static void main(String[] args) {
        System.out.println(
                powerCalculator(4, 3) + " Watts"
        );
    }

    static int powerCalculator(int voltage, int current) {
        return voltage * current;
    }
}