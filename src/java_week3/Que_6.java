package java_week3;

import java.util.Scanner;

//Write a java program to input any number and find out if it’s odd or even
public class Que_6 {
    public static void main(String[] args) { //Main method
        Que_6 q1 = new Que_6();
        q1.t1();

    }

        public void t1(){
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter number to test");

        int n = s2.nextInt();
        if ( n % 2 == 0 )
        {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
