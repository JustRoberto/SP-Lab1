import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
    public MediaItem playList;
    public String name;

    public MediaPlayer(String name) {
        this.name = name;
        //playList= new ArrayList<MediaItem>();
    }
public void add(MediaItem x){
        playList=x;
}
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }

}
