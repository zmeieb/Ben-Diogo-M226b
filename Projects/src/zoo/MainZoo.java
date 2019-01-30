package zoo;

import java.util.Scanner;

public class MainZoo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean tryAgain = true;
        System.out.println("=====================================================");
        System.out.println("================= Willkommen im Zoo =================");
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
}
