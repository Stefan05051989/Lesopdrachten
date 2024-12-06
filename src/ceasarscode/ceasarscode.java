package ceasarscode;
import java.util.Scanner;
// overgezet vanuit verkeerde project ( testzone)
public class ceasarscode {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Voer de boodschap in om te versleutelen" );
        String woord = input.nextLine().toUpperCase();
        String outputWoord = "";
        for(int i = 0; i < woord.length(); i++){
            int getal = woord.charAt(i);
            if (getal > 64 && getal < 91) {
                getal = getal + 3;
                if(getal > 90){
                    getal = getal - 26;
                }
            }
            char charNieuw = (char) (getal);
            outputWoord = outputWoord + charNieuw;
        }
        System.out.print("Het antwoord is: " );
        System.out.println(outputWoord);
    }
}
