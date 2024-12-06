package minuten;
import java.util.Scanner;
// overgezet vanuit verkeerde project (testzone)

public class minuten {
    public static void main(String[] args){
        int years;
        int months;
        int weeks;
        int days;
        int hours;
        int minutes;
        System.out.println("Hoeveel jaar? ");
        Scanner input = new Scanner (System.in);
        years = input.nextInt();
        System.out.println("Hoeveel maanden? ");
        months = input.nextInt();
        System.out.println("Hoeveel weken? ");
        weeks = input.nextInt();
        System.out.println("Hoeveel dagen? ");
        days = input.nextInt();
        System.out.println("Hoeveel uren? ");
        hours = input.nextInt();

        months = months + (years * 12);
        weeks = weeks + (months * 4);
        days = days + (weeks * 7);
        hours = hours + (days * 24);
        minutes = hours*60;
        System.out.println(minutes);
    }
}
