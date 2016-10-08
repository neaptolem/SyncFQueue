import CustomFile.*;
import CustomFile.Command.*;
import CustomFile.Command.Invoker;
import CustomFile.EventHandler.ChangeHandler;

import java.util.ArrayList;

public class _Main implements ChangeHandler {
    static private FileController fileController = new FileController();
    static private CustomFile customFile = fileController.getData();
    static private Invoker invoker = new Invoker();

    static public void main(String[] args) {
        fileController.start();
        _Main app = new _Main();
        customFile.addToListener(app);
        Test test=new Test();
        ArrayList<FileItem> fileItemArrayList=new ArrayList<FileItem>();
        fileItemArrayList=test.generateCustomFile("SMTH");
        Command setChanges = new SetChangesCommand(customFile,fileItemArrayList);
        invoker.storeAndExecute(setChanges);
    }


    @Override
    public void onChange() {
        System.out.println(customFile.toPrint());
    }
}
