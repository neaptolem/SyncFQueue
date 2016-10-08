package CustomFile.Command;


import java.util.ArrayList;
import java.util.List;

public class Invoker{
    private List<Command> history=new ArrayList<Command>();
    public void storeAndExecute(Command command){
        this.history.add(command);
        command.execute();
    }
}
