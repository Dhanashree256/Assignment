import java.util.Scanner;

public class DisplayDays {

    public static void main(String[] args)
    {
        System.out.println("Enter number to display day");

        Scanner sc=new Scanner(System.in);

        int number =sc.nextInt();
        String nameoftheday="sunday";

        switch(number){

            case 1:
                nameoftheday ="sunday";
            break;

            case 2:
                nameoftheday="Monday";

            break;

            case 3:
                nameoftheday="Tuesday";
            break;

            case 4:
                nameoftheday="wednesday";
            break;

            case 5:
                nameoftheday="Thursday";
                break;

            case 6:
                nameoftheday="Friday";
                break;
            case 7:
                nameoftheday="Saturday";
                break;

            default:
                System.out.println("provide valid number between 1 to 7 ");
        }

        System.out.println("Day is " +nameoftheday);
    }

}
