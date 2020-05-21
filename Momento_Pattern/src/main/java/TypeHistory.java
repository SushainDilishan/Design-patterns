import java.util.Stack;

//careTaker
public class TypeHistory {

    Stack<TextUndo.TextMomento> history = new Stack<TextUndo.TextMomento>();

    public void save(TextUndo textUndo){
        history.push(textUndo.save());
    }

    public void revert(TextUndo textUndo){
        if(!history.isEmpty()){
            textUndo.undo(history.pop());
        }else
            System.out.println("Undo Failed");
    }
}
