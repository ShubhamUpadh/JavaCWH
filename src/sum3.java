package com.company;
import java.util.Scanner;

public class sum3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int b = sc.nextInt();
        System.out.println("Enter number 3 : ");
        int c = sc.nextInt();
        System.out.println("The sum of the numbers is " + (a+b+c));
    }

}
