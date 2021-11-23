package Vowels;

public class RemoveAllVowels {
    public static void main(String[] args) {
        System.out.println(
                removeVowels("This is a string with some vowels in it") // Ths s  strng wth sm vwls n t
        );
    }

    public static String removeVowels(String s) {
        String str, strRes, vowels;
        char ch;
        int i, count, k;

        str = s;
        strRes = "";
        vowels = "aeiouAEIOU";

        for( i = 0; i < str.length(); i++){
            count = 0;
            ch = str.charAt(i);
            for ( k = 0; k < vowels.length(); k++) {
                if(ch == vowels.charAt(k)){
                    count++;
                }
            }
            if(count == 0){
                strRes = strRes + ch;
            }
        }
        return strRes;
    }
}
