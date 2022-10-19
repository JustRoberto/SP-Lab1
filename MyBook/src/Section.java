import java.util.ArrayList;
import java.util.List;

public class Section extends Element{
    public String title;
    public Section(String title) {
        this.title = title;
        this.myList= new ArrayList<Element>();
    }

    public Section() {

    }

    @Override
    public void print() {
        System.out.println(title);
        for(Element e : myList)
        {
            e.print();
        }
    }

}
