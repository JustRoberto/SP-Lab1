import java.util.ArrayList;
import java.util.List;

public class Book extends  Section{
    public String title;
    public Author auth;

    public Book(String title) {
        super();
        this.title=title;
        this.myList= new ArrayList<Element>();
    }

    @Override
    public void print() {
        System.out.println("Book Title : " +title);
        System.out.println("By: " +auth.name);
        System.out.println();
        for(Element e : myList)
        {
            e.print();
        }
    }

    public void addAuthor(Author auth) {
        this.auth=auth;
    }


    public void addContent(Element e) {
        this.myList.add(e);
    }
}
