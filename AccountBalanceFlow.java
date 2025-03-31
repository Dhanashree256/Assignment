import java.util.Scanner;

public class AccountBalanceFlow {

    public static void main (String[] args)
    {

        System.out.println("Enter amount to withdraw money");
        Scanner sc = new Scanner(System.in);

        double accountbalance = 12367.23;
        double withdrawal = sc.nextDouble();

        if(accountbalance > withdrawal)
        {
            double remaining_balance=accountbalance-withdrawal;
            System.out.println("after withdrawal remaining balance is " +remaining_balance);
        }else
        {
            System.out.println("your withdrwal amout has exceeded");
        }





    }
}
