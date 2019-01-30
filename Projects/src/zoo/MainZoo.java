package zoo;

import zoo.Angestellte.AtomarerZoowaerter;
import zoo.Angestellte.Kaefigleiter;
import zoo.Angestellte.Zoowaerter;
import zoo.FressVerhalten.LangsamFressen;
import zoo.FressVerhalten.SchnellFressen;
import zoo.Käfig.AffenKaefig;
import zoo.Käfig.ElefantenKaefig;
import zoo.Käfig.Kaefig;
import zoo.Käfig.LoewenKaefig;
import zoo.Tier.Affe;
import zoo.Tier.Elefant;
import zoo.Tier.Loewe;
import zoo.Tier.Tier;
import zoo.TrinkVerhalten.LangsamTrinken;
import zoo.TrinkVerhalten.SchnellTrinken;

import java.util.ArrayList;
import java.util.Scanner;

public class MainZoo {

    private static Zoo zoo = createZoo();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean tryAgain = true;
        System.out.println("=====================================================");
        System.out.println("============ Willkommen im " + zoo.getName() + " ===============");
        System.out.println("=====================================================");

        while (tryAgain) {
            System.out.println("\n In welche Rolle möchten Sie sich versetzen? \n" +
                    "[1] Käfig besichtigen \n" +
                    "[2] Zoowärter teams anschauen \n" +
                    "[x] Exit");
            String eingabe = scanner.nextLine();

            switch (eingabe) {
                case "1":
                    watchKäfige();
                    break;
                case "2":
                    watchZoowärterTeams();
                    break;
                case "x":
                    tryAgain = false;
                    System.out.println("Bis Bald!");
                    System.exit(0);
                    break;
            }
        }
    }

    private static void watchKäfige() {
        Scanner scanner = new Scanner(System.in);
        boolean tryAgain = true;
        System.out.println("================= Käfige =================");
        while (tryAgain) {
            System.out.println("\n Welcher der folgenden Käfige möchten Sie besichtigen? \n" +
                    "[1] Affenkäfig \n" +
                    "[2] Elefantenkäfig \n" +
                    "[3] Löwenkäfig \n" +
                    "[b] Zurück");
            String eingabe = scanner.nextLine();

            switch (eingabe) {
                case "1":
                    int i = 1;
                    for (Tier affe : zoo.getKäfige().get(0).getTierList()) {
                        System.out.println(affe.toString() + i);
                        i++;
                    }
                    makeAnimalDo(0);
                    break;
                case "2":
                    int u = 1;
                    for (Tier elefant : zoo.getKäfige().get(1).getTierList()) {
                        System.out.println(elefant.toString() + u);
                        u++;
                    }
                    makeAnimalDo(1);
                    break;
                case "3":
                    int z = 1;
                    for (Tier loewe : zoo.getKäfige().get(2).getTierList()) {
                        System.out.println(loewe.toString() + z);
                        z++;
                    }
                    makeAnimalDo(2);
                    break;
                case "b":
                    tryAgain = false;
                    break;
            }
        }
    }


    private static void makeAnimalDo(int i) {
        Scanner scanner = new Scanner(System.in);
        boolean tryAgain = true;
        String action;
        while (tryAgain) {
            System.out.println("Wähle ein Tier aus (Zahl des Tieres eingeben).");
            String zahl = scanner.nextLine();

            switch (zahl) {
                case "1":
                    System.out.println("Was soll es machen?");
                    System.out.println("[1] schnell fressen");
                    System.out.println("[2] langsam fressen");
                    System.out.println("[3] schnell trinken");
                    System.out.println("[4] langsam trinken");
                    action = scanner.nextLine();

                    switch (action) {
                        case "1":
                            System.out.println(zoo.getKäfige().get(i).getTierList().get(0).toString() + "1");
                            zoo.getKäfige().get(i).getTierList().get(0).setFressVerhalten(new SchnellFressen());
                            zoo.getKäfige().get(i).getTierList().get(0).fressen();
                            break;
                        case "2":
                            System.out.println(zoo.getKäfige().get(i).getTierList().get(0).toString() + "1");
                            zoo.getKäfige().get(i).getTierList().get(0).setFressVerhalten(new LangsamFressen());
                            zoo.getKäfige().get(i).getTierList().get(0).fressen();
                            break;
                        case "3":
                            System.out.println(zoo.getKäfige().get(i).getTierList().get(0).toString() + "1");
                            zoo.getKäfige().get(i).getTierList().get(0).setTrinkVerhalten(new SchnellTrinken());
                            zoo.getKäfige().get(i).getTierList().get(0).trinken();
                            break;
                        case "4":
                            System.out.println(zoo.getKäfige().get(i).getTierList().get(0).toString() + "1");
                            zoo.getKäfige().get(i).getTierList().get(0).setTrinkVerhalten(new LangsamTrinken());
                            zoo.getKäfige().get(i).getTierList().get(0).trinken();
                            break;
                    }
                    tryAgain = false;
                    break;
                case "2":
                    System.out.println("Was soll es machen?");
                    System.out.println("[1] schnell fressen");
                    System.out.println("[2] langsam fressen");
                    System.out.println("[3] schnell trinken");
                    System.out.println("[4] langsam trinken");
                    action = scanner.nextLine();

                    switch (action) {

                    }

                    switch (action) {
                        case "1":
                            System.out.println(zoo.getKäfige().get(i).getTierList().get(0).toString() + "2");
                            zoo.getKäfige().get(i).getTierList().get(1).setFressVerhalten(new SchnellFressen());
                            zoo.getKäfige().get(i).getTierList().get(1).fressen();
                            break;
                        case "2":
                            System.out.println(zoo.getKäfige().get(i).getTierList().get(0).toString() + "2");
                            zoo.getKäfige().get(i).getTierList().get(1).setFressVerhalten(new LangsamFressen());
                            zoo.getKäfige().get(i).getTierList().get(1).fressen();
                            break;
                        case "3":
                            System.out.println(zoo.getKäfige().get(i).getTierList().get(0).toString() + "2");
                            zoo.getKäfige().get(i).getTierList().get(1).setTrinkVerhalten(new SchnellTrinken());
                            zoo.getKäfige().get(i).getTierList().get(1).trinken();
                            break;
                        case "4":
                            System.out.println(zoo.getKäfige().get(i).getTierList().get(0).toString() + "2");
                            zoo.getKäfige().get(i).getTierList().get(1).setTrinkVerhalten(new LangsamTrinken());
                            zoo.getKäfige().get(i).getTierList().get(1).trinken();
                            break;
                    }
                    tryAgain = false;
                    break;
            }
        }
    }

    private static void createArrange() {

    }

    private static ArrayList<Kaefig> createKaefige() {
        Affe affe1 = new Affe();
        Affe affe2 = new Affe();
        ArrayList<Affe> affenListe = new ArrayList<>();
        affenListe.add(affe1);
        affenListe.add(affe2);
        AffenKaefig affenKaefig = new AffenKaefig("Affenkäfig");
        affenKaefig.setTierList(affenListe);

        Elefant elefant1 = new Elefant();
        Elefant elefant2 = new Elefant();
        ArrayList<Elefant> elefantenListe = new ArrayList<>();
        elefantenListe.add(elefant1);
        elefantenListe.add(elefant2);
        ElefantenKaefig elefantenKaefig = new ElefantenKaefig("Elefantenkäfig");
        elefantenKaefig.setTierList(elefantenListe);

        Loewe loewe1 = new Loewe();
        Loewe loewe2 = new Loewe();
        ArrayList<Loewe> loewenListe = new ArrayList<>();
        loewenListe.add(loewe1);
        loewenListe.add(loewe2);
        LoewenKaefig loewenKaefig = new LoewenKaefig("Affenkäfig");
        loewenKaefig.setTierList(loewenListe);


        ArrayList<Kaefig> kaefige = new ArrayList<Kaefig>();
        kaefige.add(affenKaefig);
        kaefige.add(elefantenKaefig);
        kaefige.add(loewenKaefig);

        return kaefige;
    }

    private static ArrayList<Zoowaerter> createZoowaerter(AffenKaefig affenKaefig, ElefantenKaefig elefantenKaefig, LoewenKaefig loewenKaefig) {
        AtomarerZoowaerter zoowaerter1 = new AtomarerZoowaerter("Tim", 20);
        AtomarerZoowaerter zoowaerter2 = new AtomarerZoowaerter("Dino", 24);
        ArrayList<Zoowaerter> affenZoowaerters = new ArrayList<>();
        affenZoowaerters.add(zoowaerter1);
        affenZoowaerters.add(zoowaerter2);
        Kaefigleiter leiter1 = new Kaefigleiter("Diogo", 32, affenKaefig);
        leiter1.setListZoowaerter(affenZoowaerters);


        AtomarerZoowaerter zoowaerter3 = new AtomarerZoowaerter("Silvio", 33);
        AtomarerZoowaerter zoowaerter4 = new AtomarerZoowaerter("Joel", 25);
        ArrayList<Zoowaerter> elefantenZoowaerters = new ArrayList<>();
        elefantenZoowaerters.add(zoowaerter3);
        elefantenZoowaerters.add(zoowaerter4);
        Kaefigleiter leiter2 = new Kaefigleiter("Ben", 28, elefantenKaefig);
        leiter2.setListZoowaerter(elefantenZoowaerters);


        AtomarerZoowaerter zoowaerter5 = new AtomarerZoowaerter("Vinsent", 18);
        AtomarerZoowaerter zoowaerter6 = new AtomarerZoowaerter("Sangeeths", 55);
        ArrayList<Zoowaerter> loewenZoowaerters = new ArrayList<>();
        loewenZoowaerters.add(zoowaerter5);
        loewenZoowaerters.add(zoowaerter6);
        Kaefigleiter leiter3 = new Kaefigleiter("Dirhat", 26, loewenKaefig);
        leiter3.setListZoowaerter(loewenZoowaerters);

        ArrayList<Zoowaerter> allZoowaerter = new ArrayList<>();
        allZoowaerter.add(zoowaerter1);
        allZoowaerter.add(zoowaerter2);
        allZoowaerter.add(zoowaerter3);
        allZoowaerter.add(zoowaerter4);
        allZoowaerter.add(zoowaerter5);
        allZoowaerter.add(zoowaerter6);
        allZoowaerter.add(leiter1);
        allZoowaerter.add(leiter2);
        allZoowaerter.add(leiter3);

        return allZoowaerter;
    }

    private static Zoo createZoo() {
        Zoo zoo = new Zoo("Zoo Zürich");
        zoo.setKäfige(createKaefige());
        zoo.setZoowärter(createZoowaerter((AffenKaefig) zoo.getKäfige().get(0), (ElefantenKaefig) zoo.getKäfige().get(1), (LoewenKaefig) zoo.getKäfige().get(2)));

        return zoo;
    }

    private static void watchZoowärterTeams() {
        Scanner scanner = new Scanner(System.in);
        Zoo zoo = createZoo();
        boolean tryAgain = true;
        System.out.println("================= Zoowärter =================");
        while (tryAgain) {
            System.out.println("\n Welches Team der folgenden Käfigleiter möchten Sie anschauen?");
            int counter = 1;
            for (Zoowaerter zoowaerter : zoo.getZoowärter()) {
                if (zoowaerter instanceof Kaefigleiter) {
                    System.out.println("[" + counter + "] " + zoowaerter.getName());
                    counter++;
                }
            }
            System.out.println("[b] Back");
            String eingabe = scanner.nextLine();

            switch (eingabe) {
                case "1":
                    zoo.getZoowärter().get(0).print();

                case "2":
                    zoo.getZoowärter().get(1).print();
                    break;
                case "3":
                    zoo.getZoowärter().get(2).print();
                    break;
                case "b":
                    tryAgain = false;
                    break;
            }
        }
    }
}
