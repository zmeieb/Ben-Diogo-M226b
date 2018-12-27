package Mittelalter;

public class Main {
    public static void main(String[] args) {
        Human servant1 = new Servant("Jeff");
        Human servant2 = new Servant("Jim");

        System.out.println(servant1.toString());
        System.out.println(servant2.toString());
    }
}
