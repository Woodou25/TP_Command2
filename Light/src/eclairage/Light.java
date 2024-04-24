package eclairage;

public class Light {
    private boolean on;
    private int brightness;

    public Light() {
        this.on = false;
        this.brightness = 0;
    }

    public void turnOn() {
        on = true;
        brightness = 100;
        System.out.println("La lumière est allumé au maximum.");
    }

    public void turnOff() {
        on = false;
        brightness = 0;
        System.out.println("La lumière est éteinte.");
    }

    public void setBrightness(int brightness) {
        if (brightness < 0 || brightness > 100) {
            System.out.println("Le reglage de la lumière est incorrect, entre une valeur entre 0 et 100.");
            return;
        }
        this.brightness = brightness;
        on = brightness > 0;
        System.out.println("La lumière est réglé à " + brightness + ".");
    }

    public boolean isOn() {
        return on;
    }

    public int getBrightness() {
        return brightness;
    }
}
