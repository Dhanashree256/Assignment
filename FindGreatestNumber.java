import java.util.Scanner;

public class FindGreatestNumber {

    public static void main(String[] args)
    {
        System.out.println("Enter 3 numbers to find greatest number");

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        System.out.println("Enter 3rd number");
        int c=sc.nextInt();

        if(a>=b && a>=c)
        {
            System.out.println("greatest number is  " +a);

        } else if (b>=c && b>=a) {

            System.out.println("greatest number is  " +b);
        }
        else
        {
            System.out.println("greatest number is  " +c);
        }

    }
}
