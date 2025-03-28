import java.util.Scanner;

public class PositiveNegativeNumber {

    public static void main(String[] args)
    {
        System.out.println("Enter Value");

        Scanner sc=new Scanner(System.in);

        int value= sc.nextInt();

        if (value >=0 )
        {
            System.out.println("Number is positive");

        }
        else
        {
            System.out.println("Number is Negative");

        }

    }

}
