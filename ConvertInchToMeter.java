import java.util.Scanner;

public class ConvertInchToMeter {

    public static void main(String[] args)

    {
        System.out.println("Enter value of Inch");

        Scanner sc=new Scanner(System.in);
        double user_value =sc.nextDouble();

        //1 inch is 0.0254 meter

        double meter_value= user_value * 0.0254;

        System.out.println("inch_value  "+user_value +"  meter_value  " +meter_value);



    }

}
