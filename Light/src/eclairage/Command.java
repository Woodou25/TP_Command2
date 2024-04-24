package eclairage;

public interface Command {
    void execute();
    void undo();
}