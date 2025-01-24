package lesopdrachtarray;
import java.util.*;


 class lesopdrachtarray {
    static class opdrachtArray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("Hoelang moet de array zijn? ");
                int antwoord = scanner.nextInt();
                scanner.nextLine();

                int[] numItems = new int[antwoord];
                String waardes;

                while (true) {
                    System.out.println("Welke waardes moeten er in de array? ");
                    waardes = scanner.nextLine().trim();
                    // waardes.matches("\\d{" + antwoord + "}")( = regex ( regular expression) check of de string een patroon specificeert door de
                    // expresisies in de parantheses ( soort inline boolean)
                    if (waardes.matches("\\d{" + antwoord + "}")) {
                        // \d is short voor regular expressions for a digit
                        //\d{4} matches exactly 4 digits (e.g., 1234).
                        //\d{6} matches exactly 6 digits (e.g., 123456).
                        //\d{ + antwoord!!! + } matches exactly  number antwoord digits
                        break;
                    } else {
                        System.out.println("niet genoeg waarde, vul opnieuw in.");
                    }
                }
                String[] waardeAlsString = waardes.split("");
                for (int i = 0; i < antwoord; i++) {
                    numItems[i] = Integer.parseInt(waardeAlsString[i]);
                }
                System.out.println("De waardes in de array zijn : " + Arrays.toString(numItems));
                } catch(Exception e){
                System.out.println("Er is een fout opgetreden. " + e.getMessage());
                e.printStackTrace();
                } finally {
                scanner.close();
            }
        }
    }
}

