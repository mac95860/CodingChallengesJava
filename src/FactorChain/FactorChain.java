package FactorChain;

public class FactorChain {
 // Create a function that returns true if an array is a factor chain, and false if it is not
 public static void main(String[] args) {

     System.out.println(
             isFactorChain(new int[]{1, 2, 4, 8, 16, 32}) // true
     );

     System.out.println(
             isFactorChain(new int[]{1, 1, 1, 1, 1}) // true
     );

     System.out.println(
             isFactorChain(new int[]{1, 2, 4, 5, 7, 8, 16, 32}) // false
     );
 }

 static Boolean isFactorChain(int[] arr) {
     for(int i = 0; i < arr.length - 1; i++) {
         if(arr[i + 1] % arr[i] != 0) {
             return false;
         }
     }

     return true;
 }
}
