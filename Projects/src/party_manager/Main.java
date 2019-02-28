package party_manager;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean tryAgain = true;
        ArrayList<Kontakt> kontakte = new ArrayList<>();
        kontakte.add(new Kontakt("Vinsent", "Petri"));
        kontakte.add(new Kontakt("Luca", "Schweizer"));
        kontakte.add(new Kontakt("Tim", "Mazhari"));
        kontakte.add(new Kontakt("Sangeeths", "Chandrakumar"));
        kontakte.add(new Kontakt("Dino", "Umiker"));
        kontakte.add(new Kontakt("Dirhat", "Mohammad"));
        kontakte.add(new Kontakt("Ali", "Elchab"));
        kontakte.add(new Kontakt("Joel", "Rauber"));
        kontakte.add(new Kontakt("Artur", "Baumann"));
        kontakte.add(new Kontakt("Silvio", "Merz"));


        Gastgeber ben = new Gastgeber("Ben", "Meier", kontakte);
        Gastgeber diogo = new Gastgeber("Diogo", "Caraca", kontakte);

        System.out.println("PARTY-MANAGER\n");

        while (tryAgain) {
            System.out.println("Wähle einen Gastgeber aus!\n" +
                    "[1] Ben\n" +
                    "[2] Diogo \n" +
                    "[x] Exit");
            String eingabe = scanner.nextLine();

            switch (eingabe) {
                case "1":
                    gastgeberMenu(ben);
                    break;
                case "2":
                    gastgeberMenu(diogo);
                    break;
                case "x":
                    tryAgain = false;
                    System.out.println("Bis Bald!");
                    System.exit(0);
                    break;
            }
        }
    }

    public static void gastgeberMenu(Gastgeber gastgeber) {
        Scanner scanner = new Scanner(System.in);
        boolean tryAgain = true;

        System.out.println(gastgeber.toString() + "\n");

        while (tryAgain) {
            System.out.println("Wähle eine Option aus!\n" +
                    "[1] Party planen\n" +
                    "[2] Einladung senden \n" +
                    "[3] Partys zeigen \n" +
                    "[x] Exit");
            String eingabe = scanner.nextLine();

            switch (eingabe) {
                case "1":
                    Scanner partyscan = new Scanner(System.in);
                    System.out.println("Name der Party: ");
                    String name = partyscan.nextLine();
                    System.out.println("Datum: ");
                    String datum = partyscan.nextLine();
                    System.out.println("Zeit: ");
                    String zeit = partyscan.nextLine();
                    System.out.println("Ort: ");
                    String ort = partyscan.nextLine();
                    gastgeber.getParties().add(gastgeber.createParty(name, datum, zeit, ort, gastgeber));
                    break;
                case "2":
                    doEinladung(gastgeber);
                    break;
                case "3":
                    showingParties(gastgeber);
                    break;
                case "x":
                    tryAgain = false;
                    System.out.println("Bis Bald!");
                    System.exit(0);
                    break;
            }
        }
    }

    public static void doEinladung(Gastgeber gastgeber) {
        Scanner einladungscan = new Scanner(System.in);
        boolean antwort;
        int i = 0;
        int q = 0;
        System.out.println("Welche Party?");
        for (Party party : gastgeber.getParties()) {
            System.out.println("Party: " + i);
            System.out.println(party.toString());
            i++;
        }
        int partynr = Integer.parseInt(einladungscan.nextLine());

        System.out.println("Welche Person?");
        for (Kontakt kontakt : gastgeber.getKontakte()) {
            System.out.println("Person: " + q);
            System.out.println(kontakt.toString());
            q++;
        }
        int personnr = Integer.parseInt(einladungscan.nextLine());

        Party choosenP = gastgeber.getParties().get(partynr);
        Kontakt choosenK = gastgeber.getKontakte().get(personnr);

        System.out.println(choosenK.toString() + ":");
        System.out.println("Annehmen? [y/n]:");
        String entscheid = einladungscan.nextLine();

        if (entscheid.equals("y")) {
            antwort = true;
        } else {
            antwort = false;
        }

        gastgeber.createEinladung(choosenP, choosenK, antwort);
    }

    public static void showingParties(Gastgeber gastgeber) {
        int i = 0;
        System.out.println("=Partys=");
        for (Party party : gastgeber.getParties()) {
            System.out.println("Party: " + i);
            System.out.println(party.toString());
            i++;
        }
    }
}
