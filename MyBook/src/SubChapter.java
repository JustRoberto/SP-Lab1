import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    public String name;
    public List<Image> images;
    public List<Paragraph> paragraphs;
    public List<Table> tables;
    public SubChapter(String name) {
        this.name = name;
        this.images= new ArrayList<Image>();
        this.paragraphs= new ArrayList<Paragraph>();
        this.tables= new ArrayList<Table>();
    }

    public Paragraph createNewParagraph(String s) {
        Paragraph temp = new Paragraph(s);
        paragraphs.add(temp);
        return temp;

    }

    public Image createNewImage(String s) {
        Image temp = new Image(s);
        images.add(temp);
        return temp;
    }

    public Table createNewTable(String s) {
        Table temp = new Table(s);
        tables.add(temp);
        return temp;
    }

    public void print() {
        for(Image img : images)
        {
            System.out.println(img.Imagename);
        }
        for(Table img : tables)
        {
            System.out.println(img.Title);
        }
        for(Paragraph img : paragraphs)
        {
            System.out.println(img.text);
        }
    }
}
