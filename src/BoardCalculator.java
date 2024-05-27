package com.company;
import java.util.Scanner;

public class BoardCalculator {
    public static void main(String[] args){
        System.out.println("Board % Calculator");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in subject 1 ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks in subject 2 ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks in subject 3 ");
        int m3 = sc.nextInt();

        System.out.print("Enter marks in subject 4 ");
        int m4 = sc.nextInt();

        System.out.print("Enter marks in subject 5 ");
        int m5 = sc.nextInt();

        float percentage = (float) (m1 + m2 + m3 + m4 + m5) /5;

        System.out.println("The marks in percentage are " + percentage + " %");

        sc.close();
    }
}
