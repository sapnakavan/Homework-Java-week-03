package java_week3;
//Same as above program-8 using switch statement.

import java.util.Scanner;

public class Que_9 {//class Que_9
    public static void main(String[] args) {//main method
        Que_9 m = new Que_9();//create object
        m.m1();//called instance method
    }
          public void m1(){//instance method
        Scanner s1 = new Scanner(System.in);
        System.out.println("Input any alphabet  :  ");
        char c = s1.next().charAt(0);

        switch (c) {
            case 'A':
                System.out.println("Anand,Ambaji,Agra,Ahemdabad");
                break;
            case 'a':
                System.out.println("Anand,Ambaji,Agra,Ahemdabad");
                break;
            case 'B':
                System.out.println("Bardoli,baroda,bhavnagar,borivali");
                break;
            case 'b':
                System.out.println("Bardoli,baroda,bhavnagar,borivali");
                break;
            case 'C':
                System.out.println("chandigardh,cyprus,chicago,cali");
                break;
            case 'c':
                System.out.println("chandigardh,cyprus,chicago,cali");
                break;
            case 'D':
                System.out.println("delhi,dehradun,dubai,div");
                break;
            case 'd':
                System.out.println("delhi,dehradun,dubai,div");
                break;
            case 'E':
                System.out.println("egypt,Edinburg,eastbourn");
                break;
            case 'e':
                System.out.println("egypt,Edinburg,eastbourn");
                break;
            case 'F':
                System.out.println("france,fiji,fahtepur");
                break;
            case 'f':
                System.out.println("france,fiji,fahtepur");
                break;
            default:
                System.out.println("Invalid entry");
                break;

        }

    }
}
