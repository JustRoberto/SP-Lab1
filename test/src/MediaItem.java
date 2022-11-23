import java.util.ArrayList;
import java.util.List;

public class MediaItem {

    public List<MediaItem> myList;
    public String name;
    public int size;

    public MediaItem(String name) {
        this.myList = new ArrayList<MediaItem>();
        this.name = name;
    }
    public void updateSize(int size)
    {
    this.size=size;
    }
    void add(MediaItem item)
    {
        myList.add(item);
    }
    void add(MediaItem item,int size)
    {
        item.updateSize(size);
        myList.add(item);
    }

    public int getSize() {
        return size;
    }
}
