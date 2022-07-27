package java_week3;
//Write a Java program to calculate the average value of array elements.
public class Que_19 {//class Que_19
    public static void main(String[] args) {//main method
       Que_19 q1 = new Que_19();//create object
       q1.m1();//called instance method
    }
    public void m1 (){//instance method
        int[] n1 =new int[]
                {20,30,25,35,15};
        int sum =0 ;
        for (int i=0; i < n1.length ; i++)// for loop where i =  initialize control variable, i < n1 is checking condition
                                          // ,i++ is incremental loop control variable
        sum = sum +n1[i];
        double average = sum/ n1.length;
        System.out.println("Average value of array element is  : "+ average);//printing statement

    }
}
