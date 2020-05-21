public class App {
    public static void main(String[] args) {

        TypeHistory typeHistory = new TypeHistory();
        TextUndo textUndo = new TextUndo();

        textUndo.writeText(new Text("aaa"));
        textUndo.writeText(new Text("bbb"));

        typeHistory.save(textUndo);
        System.out.println(textUndo);

        textUndo.writeText(new Text("ccc"));

        typeHistory.save(textUndo);

        textUndo.writeText(new Text("ddd"));
        System.out.println(textUndo);

        typeHistory.revert(textUndo);
        System.out.println(textUndo);

    }
}
