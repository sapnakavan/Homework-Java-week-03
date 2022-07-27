package java_week3;

import java.util.Scanner;

//Write a java program input sales id, seller's name, sales amount, and salary basic and
//then fined this sales
//Commission
//Sales amount >= 50,000 35%
//Sales amount >= 30,000 20%
//>= 20,000 10%
//>= 10,000 5%
//< 10,000 2%
public class Que_7 {//Class Que_7
    public static void main(String[] args) {//main method
        Que_7 q1 = new Que_7();//create object
        q1.m1();//called instance method
    }


    public void m1(){//instance method

        Scanner T = new Scanner(System.in);
        System.out.println("Sales ID");
        int t1 = T.nextInt();
        System.out.println(" Seller name");
        String t3 = T.next();
        System.out.println("sale amount");
        int t2 = T.nextInt();
        System.out.println("Basic salary");
        int t4 = T.nextInt();


        double salesAmount, commission, balance;


            if (t2 >= 50000){
                System.out.println(t2 * 35/100);
        }
        else if (t2 >= 30000 && t2 <= 50000) {
                System.out.println(t2 * 20/100 );
            }
        else if (t2 >= 20000 && t2 <= 30000){
                System.out.println(t2 * 10/100);
            }
        else if (t2 >= 10000 && t2 <=20000){
                System.out.println(t2 * 5/100);
            }else {
                System.out.println(t2 * 2/100);
            }

    }
}
