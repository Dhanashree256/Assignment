import java.util.Scanner;

public class AmstrongNumber {

    public static void main(String[] args){

        System.out.println("Enter number to check armstrong or not");

        Scanner sc= new Scanner (System.in);

            int number =sc.nextInt();

            int originalnumber = number;
            double sum =0;

            while(number !=0) {

                int digit = number % 10; //153

                double cube = Math.pow(digit, 3);

                sum = sum + cube; //0+9

                number /= 10; //15
            }
                if(sum == originalnumber)
                {
                    System.out.println("given number is armstrong");

                }
                else {
                    System.out.println("given number is not armstrong");
                }
            }

}
