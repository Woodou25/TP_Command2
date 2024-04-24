package eclairage;

import java.util.ArrayList;
import java.util.List;

public class LightControlPanel {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }
    
    public void executeCommand(int index) {
        if (index >= 0 && index < commands.size()) {
            commands.get(index).execute();
        }
    }

    public void undoCommand(int index) {
        if (index >= 0 && index < commands.size()) {
            commands.get(index).undo();
        }
    }
}
