import java.util.Scanner;

public class OperationsOnNumbers {

    public static void main(String[] args){

        System.out.println("Enter two numbers");

        Scanner sc =new Scanner(System.in);

        int number1 = sc.nextInt();

        int number2 = sc.nextInt();

        int sum =number1 +number2;

        int diff =number1 -number2;

        int distance =number1 -number2;

        double avg =sum /2.0;

        int product =number1 * number2;

        System.out.println("  sum is " +sum +"  diff is  " +diff +"  Avg is  " +avg + "  Product is   "+product +"  Distance is   "+distance) ;

        int max;
        int min;

        if (number1 >= number2) {

             max=number1;
             min=number2;
        }
        else
        {
             max=number2;
             min=number1;
        }

        System.out.println("Maximum  "  +max  + "Minimum   " +min );

    }


}
