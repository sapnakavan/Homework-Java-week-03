package java_week3;

import java.util.Arrays;

//Write a Java program to sort a numeric array and a string array.
public class Que_17 {//class Que_17
    public static void main(String[] args) {//main method
        Que_17 q1 = new Que_17();//create object
        q1.s1();//called instance method
    }

        public void s1(){//instance method
        int[] a = {20,15,45,78,45,30,};

        String[] b ={"kiana","Pearl","Prisha","krishu"};

        System.out.println( "Original numeric array : "+ Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Sorted numeric array : "+ Arrays.toString(a));

        System.out.println( "Original numeric array : "+ Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("Sorted numeric array : "+ Arrays.toString(b));
    }
}
