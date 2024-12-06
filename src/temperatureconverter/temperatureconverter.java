package celsiusconvert;
import java.util.Scanner;
// overgezet vanuit verkeerde project (testzone)
public class celsiusconvert {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Is het fahrenheit of celsius? 1 voor Fahrenheit, 2 voor Celcius" );
        int keuze = input.nextInt();
        if (keuze == 1)
        {
            System.out.println("Hoeveel graden fahrenheit is het? ");
            float fahrenheit = input.nextFloat();
            float celsius = (fahrenheit -32) / 1.8f;
            System.out.println("Het is " + celsius + " graden Celsius.");
        }
        else
        {
            System.out.println("Hoeveel graden celsius is het? ");
            float celcius = input.nextFloat();
            if (celcius <= -273) {
                System.out.println("KANNIETMOGOOL");
                return;
            }
            float fahrenheit = (celcius +32) * 1.8f;
            System.out.println("Het is " + fahrenheit + " graden Fahrenheit.");
        }
        input.close();
    }
}
