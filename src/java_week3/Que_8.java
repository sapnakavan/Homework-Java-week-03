package java_week3;
//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry

import java.util.Scanner;

public class Que_8 {
    public static void main(String[] args) {
        Que_8 x = new Que_8();
        x.m1();
    }

         public void m1(){
        Scanner s = new Scanner(System.in);
        System.out.println(" input any alphabet  =  ");
        char c = s.next().charAt(0);

        if (c=='A' || c=='a'){
            System.out.println("Anand,Ambaji,Agra,Ahemdabad");
        } else if
            (c=='B' || c=='b') {
            System.out.println("Bardoli,baroda,bhavnagar,borivali");
        } else if
           (c=='C'  || c=='c') {
            System.out.println("chandigardh,cyprus,chicago,cali");
        } else if
            (c=='D' || c=='d') {
            System.out.println("delhi,dehradun,dubai,div");
        } else if
            (c=='E' || c=='e') {
            System.out.println("egypt,Edinburg,eastbourn");
        } else if
            (c=='F' || c=='f') {
            System.out.println("france,fiji,fahtepur");
        } else
            System.out.println("Invalid entry");

        }
    }
