import java.util.Scanner;

public class SumOfGivenNumber {

    public static void main (String[] args)
    {
        System.out.println("Enter number to make its sum");

        Scanner sc= new Scanner(System.in);
        int givennumber = sc.nextInt();
        int sum=0;

        while(givennumber !=0)
        {
            int digit = givennumber %10; //1234 =4
            sum =sum + digit;
            givennumber/=10; //1234 =123

        }
        System.out.println("Addition of number is" +sum);


    }
}
