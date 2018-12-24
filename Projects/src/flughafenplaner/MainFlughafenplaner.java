package flughafenplaner;

public class MainFlughafenplaner {

    public static void main(String[]args){

        Passagierflugzeug passagierflugzeug = new Passagierflugzeug("Swetlana", "A380", "Edelweiss", 400);

        System.out.println(passagierflugzeug.getFlugzeugName());
    }
}
