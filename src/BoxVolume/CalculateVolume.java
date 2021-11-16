package BoxVolume;

public class CalculateVolume {
    public static void main(String[] args) {
        System.out.println(
                volume(new int []{1, 2, 3}) // 6
        );

        System.out.println(
                volume(new int[]{2, 5, 6})
        ); // 60
    }

    static int volume(int [] sizes) {
        int product = 1;

        for(int value : sizes) {
            product *= value;
        }
        return product;
    }
}
