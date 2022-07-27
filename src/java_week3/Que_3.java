package java_week3;


import java.util.Scanner;

//Write a java program to input student Name, roll No, and three subjects Math, Science and
//English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
//Input, Marks should between 0 to 100”) and find out total, percentage and result.
//If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
//%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
public class Que_3 {
    public static void main(String[] args) {
        Que_3 q1 = new Que_3();
        q1.m();
    }


          public void m(){
        System.out.println(" -----------------------------------");
        System.out.println("|                                   |");
        System.out.println("|             Mark Sheet            |");
        System.out.println("|___________________________________|");
        Scanner sc = new Scanner(System.in);
        System.out.print  ("|   Name     :                      | ");
        String a = sc.next();
        System.out.print ("|   Roll Number                      |");
        int b = sc.nextInt();
        System.out.println("|                                   |");
        System.out.println("_____________________________________");
        System.out.println("|   subjects            Marks       |");
        System.out.println("|                                   |");
        System.out.println("_____________________________________");
        System.out.print  ("|   Math   :                        |");
        int c = sc.nextInt();
        if (c >= 0 && c <= 100) {
        }else{
            System.out.println(" Invalid Input, Marks should between 0 to 100");
            System.exit(0);
        }{
            System.out.print ("| Science   :                     |");
            int d = sc.nextInt();
            if (d >= 0 && d <= 100) {
            } else {
                System.out.println(" Invalid Input, Marks should between 0 to 100");
                System.exit(0);
            }
            System.out.print ("| English :                       |");
            int e = sc.nextInt();
            System.out.println("_________________________________");
            if (e >= 0 && e <= 100) {
            } else {
                System.out.println(" Invalid Input, Marks should between 0 to 100");
                System.exit(0);
            }


            System.out.println(" total :       ");
            int t = c + d + e;
            System.out.println("__________________________________");
            System.out.println(t);
            System.out.println(" Percentage  :  ");
            int p = t / 3;
            System.out.println(p);

            System.out.println("Result :         ");
            if (p < 35) {
                System.out.println("Fail");
            } else if (p > 35) {
                System.out.println("Pass");


                System.out.println("| Grade :                           |");
                if (p >= 80) {
                    System.out.println(" A+ ");
                } else if (p >= 60) {
                    System.out.println(" A ");
                } else if (p >= 50) {
                    System.out.println(" B ");
                } else if (p >= 35) {
                    System.out.println(" C ");
                    System.out.println("_____________________________");
                }
            }


        }

    }
}
