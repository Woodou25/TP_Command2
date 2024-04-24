package eclairage;

public class AdjustBrightnessCommand implements Command {
    private Light light;
    private int brightness;

    public AdjustBrightnessCommand(Light light, int brightness) {
        this.light = light;
        this.brightness = brightness;
    }

    @Override
    public void execute() {
        light.setBrightness(brightness);
    }

    @Override
    public void undo() {
    }
}