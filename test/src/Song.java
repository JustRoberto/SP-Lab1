import java.util.List;

public class Song extends MediaItem{
    public Song(String name, int size) {
        super(name);
        this.size=size;
    }

    public Song(String name) {
        super(name);
    }
}
