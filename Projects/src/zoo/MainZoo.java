package zoo;

import zoo.Angestellte.AtomarerZoowaerter;
import zoo.Angestellte.Kaefigleiter;
import zoo.Angestellte.Zoowaerter;
import zoo.Käfig.AffenKaefig;
import zoo.Käfig.ElefantenKaefig;
import zoo.Käfig.Kaefig;
import zoo.Käfig.LoewenKaefig;
import zoo.Tier.Affe;
import zoo.Tier.Elefant;
import zoo.Tier.Loewe;

import java.util.ArrayList;
import java.util.Scanner;

public class MainZoo {

    public static void main(String[] args) {
        Zoo zoo = new Zoo("Zoo Zürich");
        zoo.setKäfige(createKaefige());
        ArrayList<AffenKaefig> affenKaefige = new ArrayList<>();
        ArrayList<ElefantenKaefig> elefantenKaefige = new ArrayList<>();
        ArrayList<LoewenKaefig> loewenKaefige = new ArrayList<>();

        for (Kaefig kaefig : zoo.getKäfige()) {
            if (kaefig instanceof AffenKaefig) {
                affenKaefige.add((AffenKaefig) kaefig);
            } else if (kaefig instanceof ElefantenKaefig) {
                elefantenKaefige.add((ElefantenKaefig) kaefig);
            } else if (kaefig instanceof LoewenKaefig) {
                loewenKaefige.add((LoewenKaefig) kaefig);
            }
        }

        zoo.setZoowärter(createZoowaerter(affenKaefige.get(0), elefantenKaefige.get(0), loewenKaefige.get(0)));


        Scanner scanner = new Scanner(System.in);
        boolean tryAgain = true;
        System.out.println("=====================================================");
        System.out.println("============ Willkommen im " + zoo.getName() + " ===============");
        System.out.println("=====================================================");

        while (tryAgain) {
            System.out.println("\n In welche Rolle möchten Sie sich versetzen? \n" +
                    "[1] Käfig besichtigen \n" +
                    "[2] Tier unter die Lupe nehmen \n" +
                    "[3] Zoowärter teams anschauen \n" +
                    "[x] Exit");
            String eingabe = scanner.nextLine();

            switch (eingabe) {
                case "1":
                    watchKäfige();
                    break;
                case "2":

                    break;
                case "3":

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
        System.out.println("================= Käfige =================");
        System.out.println("Welcher der folgenden Käfige möchten Sie besichtigen? ");
        System.out.println();
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
}
