package java_week3;
//Write a Java program to test if an array contains a specific value.

import java.util.Scanner;

public class Que_20 {//class Que_20
    public static void main(String[] args) {//main method
        Que_20 q1 = new Que_20();//create object
         q1.s1();//called instance method
    }
    public void  s1(){//instance method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array  :");
        int a =sc.nextInt();

        int[] n1 ={10,20,30,40,50,};
        boolean b = false;
        for (int n : n1){
            if(n==a){
                b = true;
                break;
            }
        }
        if (b)
            System.out.println(b +"is found ");
       else
           System.out.println( b +" is not found");
    }
}
