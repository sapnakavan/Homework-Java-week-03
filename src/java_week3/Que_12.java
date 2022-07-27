package java_week3;
//Write a program that tells us input value is number or an alphabet or symbol.

import java.util.Scanner;

public class Que_12 {//class Que_12
    public static void main(String[] args) { //main method
     Que_12 q = new Que_12();//create object
     q.m1();//called instance method
    }
    public void m1(){ //instance method
        Scanner s1 = new Scanner(System.in);
        System.out.println(" Enter any caracter : ");
        char c1 = s1.next().charAt(0);
        if ((c1 >= 'a'&& c1 <= 'z') || (c1 >= 'A' && c1 <= 'Z')){
            System.out.println(c1 + "  is a alphabet.");
    } else if (c1>= '0' && c1 <= '9') {
            System.out.println(c1 + "   is a number.");
        }else {
            System.out.println(c1 + "   is a symbol");
        }
    }
}