import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Picture {
    public String URL;
    public Dimension dim;
   // public PictureContent content;
    public Picture(String s) {

        this.URL=s;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void print()
    {
        System.out.println("Image with Image name:"+URL);
    }
}


