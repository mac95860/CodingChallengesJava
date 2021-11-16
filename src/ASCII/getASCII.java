package ASCII;

// Write a function that takes a character and returns ascii value

public class getASCII {
    public static void main(String[] args) {
        System.out.println(
                ascii('A') // 65
        );

        System.out.println(
                ascii('c') // 99
        );
    }

    static int ascii(char c) {
        int ascii = (int)c;

        return ascii;
    }
}
