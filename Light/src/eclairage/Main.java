package eclairage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Light light = new Light();

        LightControlPanel panel = new LightControlPanel();
        
        System.out.println("Contrôle de l'éclairage :");
        System.out.println("[1] Allumer la lumière");
        System.out.println("[2] Éteindre la lumière");
        System.out.println("[3] Ajuster l'intensité de la lumière");
        System.out.println("Choisissez une option : ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Command turnOn = new TurnOnLightCommand(light);
                panel.addCommand(turnOn);
                panel.executeCommand(0);
                break;
            case 2:
                Command turnOff = new TurnOffLightCommand(light);
                panel.addCommand(turnOff);
                panel.executeCommand(0);
                break;
            case 3:
                System.out.println("Entrez l'intensité de la lumière (0-100) :");
                int brightness = scanner.nextInt();
                Command adjustBrightness = new AdjustBrightnessCommand(light, brightness);
                panel.addCommand(adjustBrightness);
                panel.executeCommand(0);
                break;
        }

        scanner.close();
    }
}
