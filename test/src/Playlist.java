import java.util.ArrayList;

public class Playlist extends MediaItem{
    public Playlist(String name) {
        super(name);
        this.myList= new ArrayList<MediaItem>();
    }

    @Override
    public int getSize() {
        size=0;
        for(MediaItem med : this.myList )
        {
        size+= med.getSize();
        }
        return size;
    }
}
