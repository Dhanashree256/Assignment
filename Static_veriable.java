public class Static_veriable {

    public static void main(String[] args){
        Human h1 = new Human();
        h1.country = "India";
        System.out.println(h1.country);
        Human h2 = new Human();
        System.out.println(h2.country);
    }
}


class Human {
    int age;
    String name;
    static String country;

    }

