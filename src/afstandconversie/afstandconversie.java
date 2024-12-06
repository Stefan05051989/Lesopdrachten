package afstandconversie;
// overgezet vanuit verkeerde project (testzone)
import java.util.Scanner;

public class afstandconversie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wat is de afstand in meters? ");
        int myMeters = input.nextInt();
        System.out.println("Wat is de tijd in uren? ");
        int myHours = input.nextInt();
        System.out.println("Wat is de tijd in minuten? ");
        int myMin = input.nextInt();
        System.out.println("Wat is de tijd in seconden? ");
        int mySec = input.nextInt();

        float seconden = mySec + 60f * myMin + 3600f * myHours;
        float metersPerSec = myMeters / seconden;
        System.out.println(metersPerSec + " meters per seconden" );

    }
}

