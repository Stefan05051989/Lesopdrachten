package tabelloops;
/*
for (int uur = 1; uur <= 6; uur++) {
        for (int min = 1; min <= 60; min++) {
        System.out.println(uur + ":" + min);
*/

public class tabelloops {
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++){
                System.out.print(i * j);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
