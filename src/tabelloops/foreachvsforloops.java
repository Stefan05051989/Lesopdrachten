package tabelloops;

public class foreachvsforloops {
    public static void main(String[] args) {
        int[] lijst = {1,2,3,4};
        int som1 = 0, som2 = 0;

        for(int i = 0; i < lijst.length; i++) {
            som1 = som1 + lijst[i];
        }

        for(int getal : lijst) {
            som2 = som2 + getal;
        }

        System.out.println("som1: " + som1); // som1: 10
        System.out.println("som2: " + som2); // som2: 10

    }
}
// tekst