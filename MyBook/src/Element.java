import java.util.List;

public class Element {

public List<Element> myList;

    public void add(Element element)
    {
        myList.add(element);
    }
    public void remove(Element element)
    {
        myList.remove(element);
    }
    public void get(int id){
        myList.get(id);
    }
    public void print()
    {

    }
}
