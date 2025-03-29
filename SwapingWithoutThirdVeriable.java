public class SwapingWithoutThirdVeriable {

    public static void main(String[] args) {

       int i =31;
       int k =43;

       i =i + k ;// 74
       k =i - k ;// 74-43 31
       i= i - k ;// 74 -31

        System.out.println("value of i " +i);
        System.out.println("value of k " +k);
    }

}
