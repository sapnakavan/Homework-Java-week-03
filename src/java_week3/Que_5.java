package java_week3;

import java.util.Scanner;

//WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
//salary
//HRA = basic salary 10%
//DA = Basic salary 8%
//TA = Basic salary 9%
//PF= Basic salary 20%
//Gross salary = basic salary + HRA + TA + DA –PF
public class Que_5 {//class Que_5
    public static void main(String[] args) {//main method
        Que_5 s = new Que_5();//create object
        s.m1();//called instance method
    }

    public void m1(){//instance method
        Scanner t = new Scanner(System.in);
        System.out.println("_____________________________________");
        System.out.println("|           Salary Slip              |");
        System.out.println("|____________________________________|");

        System.out.println("| Employ ID  :                       |");
        int t2 = t.nextInt();
        System.out.println("| Employee Name                      |");
        String t3 =t.next();
        System.out.println("|____________________________________|");
        System.out.println("| Basic Salary :                     |");
        double a = t.nextDouble();
        double HRA = 10/100.0 * a;
        System.out.println("|HRA 10 %  :                         |" +HRA);
        double DA = 8 / 100.0 * a;
        System.out.println("|DA 8%     :                         |"    +DA);
        double TA = 9/100.0 *a;
        System.out.println("|TA 9%     :                         |"    +TA);
        double PF =20/100.0 *a;
        System.out.println("|PF 20%    :                         |"    +PF);
        System.out.println("|____________________________________|");


        double gross =  a + HRA + TA + DA - PF;
        System.out.println("|Gross Salary =                      |" + gross );
        System.out.println("|====================================|");


    }
}
