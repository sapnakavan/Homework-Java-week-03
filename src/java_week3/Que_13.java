package java_week3;
//13. Write a Java program which input any number between 1 to 7 and it print The Days
//name MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.
//NOTE: if number is out of selection Print message “Week contains 1 to 7 days”

import java.util.Scanner;

public class Que_13 {//class Que_13

    public static void main(String[] args) {//main method
        Que_13 q1 = new Que_13();//create object
        q1.m1();//called instance method
    }

    public void m1(){//instance method
        Scanner s1 = new Scanner(System.in);
        System.out.println("Input any number :  ");
        int day = s1.nextInt();


        switch (day){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednsday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Week contains 1 to 7 days");
        }
    }
}
