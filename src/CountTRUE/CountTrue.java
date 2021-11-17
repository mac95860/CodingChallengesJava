package CountTRUE;

public class CountTrue {
    public static void main(String[] args) {
        System.out.println(
                counting(new boolean[] {true, true, false, false, true}) // 3
        );

        System.out.println(
                counting(new boolean[] {false, false, true, false, true}) // 2
        );
    }

    public static int counting(boolean[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]) {
                count++;
            }
        }
        return count;
    }
}
