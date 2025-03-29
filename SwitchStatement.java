public class SwitchStatement {
//switch case check only checks the equality you cannot check single condition more than 1 time
    //after logical code you need to write break statement if not written it will keep on executing
    //code until last case
    //if no case is matching it will print default block
    public static void main (String[] args)
    {
        String MonthName ="April";
        int MonthNumber=1 ;

        switch(MonthName){

            case "Jan" :
                case   "January":
              MonthNumber=1;
            break;

            case "Feb":
            case "february":
                MonthNumber=2;
                break;

            case "March":
                MonthNumber=3;
                break;
            default:
                System.out.println("provide month name in range");
                break;

    }
        System.out.println("Month Number: " + MonthNumber);
    }


}