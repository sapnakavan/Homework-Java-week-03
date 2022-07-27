package java_week3;

import java.util.Scanner;

//10.Write a java program to input any two number and ask user to enter their symbol (+, -,
///, *) find addition, Subtraction, multiplication and division according to their symbol
//(using if else)
public class Que_10 {// class Que_10
    public static void main(String[] args) {// main method
        Que_10 q1 = new Que_10();//create object
        q1.a1();//called instance method
    }

    public void a1(){//instance method
        char ch;
        Scanner s1 = new Scanner(System.in);
        System.out.println(" Enter the first number : ");
        int n1 = s1.nextInt();

        System.out.println(" Enter operator you want(+ ,-,/,* ");
        ch = s1.next().charAt(0);

        System.out.println( " Enter the second number : ");
        int n2 = s1.nextInt();

        if(ch=='+'){
            System.out.println("Addition of "+n1+"+"+n2+"="+(n1+n2));
        }
        else if (ch=='-'){
            System.out.println("Substraction of " +n1+"-"+n2+"="+(n1-n2));
        }
        else if (ch=='*') {
            System.out.println("Multiplication of " +n1+"*"+n2+"="+(n1*n2));
        }
        else if (ch=='/') {
            System.out.println("Division of " +n1+"/"+n2+"= "+(n1/n2));
        }
        else {
            System.out.println("Operators is not available ");
        }
    }

}
