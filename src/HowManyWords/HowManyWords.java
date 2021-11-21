package HowManyWords;

public class HowManyWords {
    public static void main(String[] args) {
        System.out.println(
                countWords(new String ("How many words in this array")) // 6
        );
    }

    static int countWords(String s) {
        String[] arr = s.split(" ");
        return arr.length;
    }
}
