package com.company;
import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {
	// Java Stdin and Stdout II
        Scanner sc = new Scanner(System.in);

        int i=sc.nextInt();
        double d=sc.nextDouble();
        sc.nextLine();
        String s=sc.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        // Java Output Formatting
//        Scanner sc=new Scanner(System.in);
//        System.out.println("================================");
//        for(int i=0;i<3;i++){
//            String s1=sc.next();
//            int x=sc.nextInt();
//            String y;
//
//            if(x < 100) {
//                y = String.format("%03d", x);
//                System.out.println(String.format("%-15s", s1) + y);
//            } else {
//                System.out.println(String.format("%-15s", s1) + x);
//            }
//        }
//        System.out.println("================================");


        // Java Loops 1
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(bufferedReader.readLine().trim());
//        int multiplier = 1;
//
//        do {
//            int product = N * multiplier;
//            System.out.println(N + " x " + multiplier + " = " + product);
//            multiplier++;
//        } while (
//                multiplier <= 10
//        );
//
//        bufferedReader.close();

        // Java Loops II
//        Scanner in = new Scanner(System.in);
//        int t=in.nextInt();
//        for(int i=0;i<t;i++){
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();
//            int sum = a;
//            for (int j = 0; j < n; j++) {
//                sum += b * Math.pow(2, j);
//                System.out.print(sum + " ");
//            }
//            System.out.println();
//
//        }
//        in.close();
    }
}
