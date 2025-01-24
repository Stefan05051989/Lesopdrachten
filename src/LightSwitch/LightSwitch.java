package LightSwitch;

import java.util.Scanner;

public class LightSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isLightOn = false;
        String input;

        System.out.println("Turn lightswitch on and off with this tool.");
        System.out.println("Type : on, to turn light on. Type: off, for turning light off.");

        while (true) {
            System.out.println("Enter on/off: ");
            input = scanner.nextLine().toLowerCase();
            switch (input) {
                case "on":
                    if (!isLightOn) {
                        isLightOn = true;
                        System.out.println("The light is on.");
                    } else {
                        System.out.println("The light is allready on");
                    }
                    break;
                case "off":
                    if (isLightOn) {
                        isLightOn = false;
                        System.out.println("The light is now off.");
                    } else {
                        System.out.println("The light is allready off.");
                    }
                    break;
                default:
                    System.out.println("Choose between on and off please");
                    break;
            }
        }
    }
}
