import java.util.Scanner;

public class NumberOfDaysInMonth {

    public static void main (String[] args)
    {
        System.out.println("Enter number of month to find Days");

        Scanner sc =new Scanner(System.in);

        int input =sc.nextInt();

        if (input ==1 || input ==3 || input ==5 ||input==7 ||input ==8 ||input==10 ||input==12 )
        {
            System.out.println("31 days in Month");

        } else if (input ==4 || input==6 || input==9 ||input==11)

        {
            System.out.println("30 days in Month");

        } else if (input==2)

        {
            System.out.println("28 days in Month");
        }
        else
        {
            System.out.println("Input is out of range");
        }
    }

}


