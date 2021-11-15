package AddEnding;

import java.util.Arrays;

public class Challenge {
    public static void main(String[] args) {

        String[] arr = {"clever", "meek", "hurried", "nice"};
        System.out.println(
                (
                        (Arrays.toString(Challenge.addEnding(arr, "ly")))
                )
        );

    }

    public static String[] addEnding(String[] arr, String ending) {
        String output[] = arr.clone();

        for (int i = 0; i < arr.length; i++) {
            output[i] = arr[i] + ending;
        }
        return output;
    }

}