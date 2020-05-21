import java.util.ArrayList;

//originator
public class TextUndo {

    ArrayList<Text> texts = new ArrayList<Text>();

    public void writeText(Text text){
        texts.add(text);
    }

    public ArrayList<Text> getTexts() {
        return (ArrayList<Text>) texts.clone();
    }

    public TextMomento save(){
        return new TextMomento(getTexts());
    }

    public void undo(TextMomento textMomento){
        texts=textMomento.getTexts();
    }

    @Override
    public String toString() {
        return "TextUndo{" +
                "texts=" + texts +
                '}';
    }

    static class TextMomento{
        ArrayList<Text> texts;

        public TextMomento(ArrayList<Text> texts) {
            this.texts = texts;
        }

        private ArrayList<Text> getTexts() {
            return texts;
        }
    }
}
