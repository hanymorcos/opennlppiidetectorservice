package opennlp;

public class Data {

    private  String text;

    public Data() {}
    
    public Data(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }
}
