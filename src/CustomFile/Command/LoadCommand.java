package CustomFile.Command;

import CustomFile.CustomFile;

import java.util.ArrayList;

public class LoadCommand implements Command {
    private CustomFile customFile;

    public LoadCommand(CustomFile customFile) {
        this.customFile = customFile;
    }

    @Override
    public void execute() {
        this.customFile.load();
    }
}
