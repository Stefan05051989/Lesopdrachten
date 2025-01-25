package exponent;
/*
Schrijf een methode met de naam exponent (int base, int exp) die een waarde
teruggeeft tot de macht van exp
basis 3
exponent 4
3 tot de macht van 4 : 81

 */


public class Exponent {
    /*
    methode om de macht te berekenen
    parameters voor berekening : basis (3) + exponent(4)

     */
    public static void main(String[] args) {
        int basis = 3;
        int exp = 4;

        int result = exponent(basis, exp);
        System.out.println(basis + " tot de macht van " + exp + " is : " + result);
    }
    /*
    creeer loop om grondgetal herhaaldelijk te vermenigvuldigen
     */
    public static int exponent(int basis, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= basis;
        }
        return result;
    }
}

