package java_week3;
//Write a java program that tells us that Input number is odd or even?
//HINT: use ternary operator (? :)

import java.util.Scanner;

public class Que_1 {//class Que_1

    public static void main(String[] args) {//Main method
        Que_1 s = new Que_1();//create object
        s.s1();//called instance method
    }

     public void s1(){//instance method
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to test");


        int n = scan.nextInt();
        //ternary operator to check number
        String result = n%2==0 ? "Even"  :" Odd ";
        System.out.println(n +" is " + result);
    }


    }

