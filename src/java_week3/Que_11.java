package java_week3;
//Write a java program to print the numbers between 1 to 100 which can be divided by 3
//and 5 separately.
public class Que_11 {//class Que_11
    public static void main(String[] args) {//main method
        Que_11 q1 = new Que_11();//create object
        q1.m1();//called instance method
    }

    public void m1(){//instance method
        System.out.println("Divided by 3:  ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + " , ");
        }
        System.out.println("\nDivided by 5:  ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0)
                System.out.print(i + " , ");
        }
        System.out.println("\nDivided by 3 & 5 :  ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print(i + " , ");
        }
    }
}