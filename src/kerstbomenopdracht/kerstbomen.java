package kerstbomenopdracht;

public class kerstbomen {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i = 1; i <= 5; i++) {
            // print de correct aantal spaties (5 - hoogte)(i = hoogte)
            for (int k = 0; k < 5 - i; k++) {
                System.out.print(" ");
            }
            // print resterende sterretjes (hoogte)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // na elke lijn, print nieuwe break line
            System.out.println(" ");
        }
        for (int i = 1; i <= 5; i++) {  // Hoogte van de piramide
            for (int j = 1; j <= 5 - i; j++) {  // Spaties voor sterren
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {  // Sterren
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println(" ");
        }
        System.out.println("Nieuw: ");
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
