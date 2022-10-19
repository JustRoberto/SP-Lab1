public class Image extends Element{
    public String URL;
    public Image(String s) {
        this.URL=s;
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

    public void print()
    {
        System.out.println("Image with Image name:"+URL);
    }
}
