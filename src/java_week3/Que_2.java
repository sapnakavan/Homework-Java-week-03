package java_week3;

import java.util.Scanner;

//Write a java program to input any year like (ex.2007) and find out if it is leap year or
//not?
public class Que_2 {//class Que_2
    public static void main(String[] args) {//main method
        Que_2 b = new Que_2();
        b.a();
    }
        public void a(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Input the year : ");
        int year = s1.nextInt();

        boolean x= (year %4 )== 0;

        if (x){
            System.out.println(year +"is a leap year ");
        }
        else{
            System.out.println(year + "is not a leap year");
        }
    }
}
