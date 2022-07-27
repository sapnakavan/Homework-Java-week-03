package java_week3;
//Write a Java program to sum values of an array.
public class Que_18 {//class Que_18
    public static void main(String[] args) {//main method
        Que_18 q1= new Que_18();//create object
        q1.a1();//called instance method
    }

    public void a1(){//instance method
        int a[] ={ 1,2,4,5,8,6,3,7,};
        int sum =0;

        for (int i : a)
            sum += i;
        System.out.println("The sum is "+ sum);//printing statement
    }
}
