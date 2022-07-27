package java_week3;
//Number of Days In Month
//Write a method isLeapYear with a parameter of type int named year.
public class Que_4 {//class Que_4
    public static void main(String[] args) {//main method
    Que_4 q1 = new Que_4();// create object
    q1.Leapyear(2000);
   getDaysInMonth(5,2021);

    }
    public static void Leapyear (int year){
        int x = year;
        if (x<1 || x > 9999){
            System.out.println(" false ");
            System.out.println(" Not in range ");
        }else{
            if(((x % 4== 0) && (x % 100 != 0)) || ( x % 400 == 0)){
                System.out.println(" This is Leap year.");
            }else {
                System.out.println( "This is not Leap year.");

            }
        }
    }

    public static void getDaysInMonth(int month ,int year){
        int m = month;
        int y = year;

        switch (m){
            case 1:
                System.out.println("January" + y + " has 31 days");
                break;
            case 2:
                System.out.println("February" + y + " Either 28 or 29 days in this month");
                break;
            case 3:
                System.out.println("March" + y + " has 31 days");
                break;
            case 4:
                System.out.println("April" + y + " has 31 days");
                break;
            case 5:
                System.out.println("May" +y + " has 31 days ");
                break;
            case 6:
                System.out.println("June " + y + " has 31 days");
                break;
            case 7:
                System.out.println("July" + y + " has 31 days");
                break;
            case 8:
                System.out.println("August" + y + " has 31 days");
                break;
            case 9:
                System.out.println("September" + y + " has 31 days");
                break;
            case 10:
                System.out.println("October" + y + " has 31 days");
                break;
            case 11:
                System.out.println("November" + y + " has 31 days");
                break;
            case 12:
                System.out.println("December" + y + " has 31 days");
                break;
            default:
                System.out.println("please enter valid number between 1 to 12");
                break;


        }
    }
}
