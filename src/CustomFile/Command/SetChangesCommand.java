package CustomFile.Command;

import CustomFile.*;

import java.util.ArrayList;

public class SetChangesCommand implements Command {
    private CustomFile customFile;
    private ArrayList<FileItem> fileItemArrayList;

    public SetChangesCommand() {
    }

    public SetChangesCommand(CustomFile customFile, ArrayList<FileItem> fileItemArrayList) {
        this.customFile = customFile;
        this.fileItemArrayList = fileItemArrayList;
    }

    public SetChangesCommand(ArrayList<FileItem> fileItemArrayList) {
        this.fileItemArrayList = fileItemArrayList;
    }

    public SetChangesCommand(CustomFile customFile) {
        this.customFile = customFile;
    }

    @Override
    public void execute() {
        customFile.setData(fileItemArrayList);
    }
}
