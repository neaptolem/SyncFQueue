package CustomFile;

import CustomFile.Command.*;
import CustomFile.EventHandler.ChangeHandler;

public class FileController extends Thread implements ChangeHandler {
    private CustomFile customFile = new CustomFile();

    private Invoker invoker = new Invoker();
    private Command load = new LoadCommand(customFile);
    private Command compare = new CompareCommand(customFile);
    private Command save = new SaveCommand(customFile);

    public void run() {
        System.out.println("FileController run");
        customFile.addToListener(this);
        invoker.storeAndExecute(load);
        for (; ; ) {
            invoker.storeAndExecute(compare);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onChange() {
        invoker.storeAndExecute(save);
    }

    public CustomFile getData() {
        return customFile;
    }
}
