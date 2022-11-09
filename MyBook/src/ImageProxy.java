import java.awt.*;

public class ImageProxy extends Element{
    public String URL;
    public Dimension dim;
    public Image loadImage(){
        Image realImage = null;
        if (realImage==null)
        {
            realImage = new Image(this.URL);
        }
        return realImage;
    }

    public ImageProxy(String URL) {
        this.URL = URL;
    }

    public void print()
    {
        System.out.println("Image with Image name:"+URL);
    }
}
