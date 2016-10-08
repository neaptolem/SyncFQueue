package CustomFile.Command;

import CustomFile.CustomFile;

public class SaveCommand implements Command {
    private CustomFile customFile = new CustomFile();

    public SaveCommand(CustomFile customFile) {
        this.customFile = customFile;
    }

    @Override
    public void execute() {
        customFile.save();
    }
}
