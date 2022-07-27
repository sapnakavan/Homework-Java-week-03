package java_week3;

import java.util.Scanner;

//16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
//“ZERO”
public class Que_16 {//class Que_16
    public static void main(String[] args) {//main method
        Que_16 q1 = new Que_16();//create method
        q1.m1();//called instance method
    }
       public void m1(){//instance method
        Scanner t1 = new Scanner(System.in);
        System.out.println("Input a number : ");
        int t = t1.nextInt();

        if (t > 0){
            System.out.println("Number is positive");
        }
        else if (t < 0) {
            System.out.println("Number is negative");
        }
        else {
            System.out.println( "Number is Zero");
        }
    }
}
