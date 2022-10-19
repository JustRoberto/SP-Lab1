public class Paragraph extends Element {
    public String text;
    public Paragraph(String s) {
        this.text=s;
    }

    @Override
    public void add(Element element) {
        //nimic
    }

    @Override
    public void get(int id) {
        //nimic
    }

    @Override
    public void remove(Element element) {
        //nimic
    }
    @Override
    public void print()
    {
        System.out.println("Paragraph :"+text);
    }
}
