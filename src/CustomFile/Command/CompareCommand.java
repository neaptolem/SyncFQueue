package CustomFile.Command;

import CustomFile.CustomFile;

public class CompareCommand implements Command {
    private CustomFile customFile = new CustomFile();

    public CompareCommand(CustomFile customFile) {
        this.customFile = customFile;
    }

    @Override
    public void execute() {
        customFile.compare();
    }
}
