package HelloWorld;

//Write a function that takes an integer and:
//
//        If the number is a multiple of 3, return "Hello".
//        If the number is a multiple of 5, return "World".
//        If the number is a multiple of both 3 and 5, return "Hello World".

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println( helloWorld(3) );
        System.out.println( helloWorld(5) );
        System.out.println( helloWorld(15) );
    }

    static String helloWorld (int num) {
            return  num % 3 == 0 && num % 5 == 0 ? "Hello World"
                    : num % 5 == 0 ? "World"
                    : "Hello";
    }
}
