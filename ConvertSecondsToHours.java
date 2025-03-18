public class ConvertSecondsToHours {

    public static void main(String[] args)
    {


        int seconds=86399;

        int minute =seconds/60;

        int remaining_minute =minute%60;

        int remaining_Seconds =seconds%60;

        int hour= minute/60;

        System.out.println("hour" +hour +"minute" +remaining_minute+"seconds" +remaining_Seconds);




    }
}
