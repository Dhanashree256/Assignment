import java.sql.SQLOutput;
import java.util.Scanner;
//Math.pow method always return output in double if you want only integer value
//cast the output in int.
public class NumberPowers {

    public static void main(String[] args){

        System.out.println("Enter Number");

        Scanner sc=new Scanner(System.in);
        double inputnumber= Double.parseDouble(sc.next());

        System.out.println("Entered value" +inputnumber);
            sc.close();
        double square= Math.pow(inputnumber,2);
        double cube= Math.pow(inputnumber,3);
        double fourthpower=Math.pow(inputnumber,4);

        System.out.println("Square"+square +"\nCube" +cube +"\nFourthPower" +fourthpower);
    }
}
