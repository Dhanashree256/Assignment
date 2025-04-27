import java.util.Scanner;

public class FibonacciSeries {
    // 0 1 1 2 3 5 8 13
    public static void main (String[] args)
    {
        System.out.println("Enter range of number for fibonacci series");
        Scanner sc =new Scanner(System.in);

        int number = sc.nextInt();

        int first =0;
        int second =1;

        System.out.println("Fibonacci series" +number);

        for(int i=1 ; i<=number; ++i)
        {
            System.out.print(" " + first);

            int next = first + second; //1

            first = second; //1

            second =next; //1
//      0 1 1 2

        }




    }




}
