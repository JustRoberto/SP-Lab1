public class Main {
    public static void main(String[] args) throws Exception{
        MediaPlayer m = new MediaPlayer("Winamp");
        Playlist p = new Playlist("Chill");
        p.add(new Song("BudaBar", 3000));
        p.add(new Video("Waves in Caraibe",2000));
        p.add(new Song("Simple Things",4000));
        p.add(new Gif("sunglasses"),500);
        m.add(p);

        Visitor v = new MediaSizeVisitor();
        m.accept(v);
        v.printSizes();
    }
}