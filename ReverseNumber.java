import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args)
    {

        System.out.println("Enter number to reverse");
        Scanner sc=new Scanner(System.in);

        int reverse =0;

        int number =sc.nextInt();

        //if number is 1234
    while (number !=0 )
    {
        int digit = number % 10;  //1234 4

        reverse = reverse * 10 + digit; //0*10+4

        number /= 10; //1234 /10 =123
    }
        System.out.println("reversed number is" +reverse);
    }
}
