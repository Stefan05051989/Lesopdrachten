package OddEvenTest;

import java.util.Scanner;

public class OddEvenTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welkom, geef nummer om conditie te controleren : ");
        int input = scanner.nextInt();


        if (input % 2 == 0){
            System.out.println(input + " het is een even nummer.");
        }else{
            System.out.println(input + " het nummer is oneven.");
        }

        /*
        Zoek uit hoe een nummer even of oneven is ( incl scanner voor input)
         */
    }
}
