package Lucas;
import java.util.Scanner;

public class Lucas {
    static int LucasSum(int n) {
        // declaratie van integers (lucassom = n)
        // sum houd som van de integers bij
        int sum = 0;
        // a + b zijn opeenvolgende integers in lucas reeks
        int a = 2;
        int b = 1;
        int c;
        // som start met a = 2, b = 1, som wordt opgeteld met a
        sum += a;

        while (b <= n) {
            sum += b;
            c = a + b;
            a = b;
            b = c;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you would like to add to calculate the Lucas-number from : ");
        int n = scanner.nextInt();
        System.out.println(LucasSum(n));
    }
}

