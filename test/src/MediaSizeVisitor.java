public class MediaSizeVisitor extends Visitor {

    private MediaPlayer mp;
    private int VideoSize;
    private int GifSize;
    private int PlaylistSize;
    private int Songsize;
    public MediaSizeVisitor() {
    }

    public int visit(Video video){
        VideoSize+= video.getSize();
        System.out.println("test");
        return video.getSize();
    }
    public int visit(Gif gif){
        GifSize+=gif.getSize();
        return gif.getSize();
    }
    public int visit(Song song){
        Songsize+= song.getSize();
        return song.getSize();
    }
    public int visit(Playlist playlist){
        for (MediaItem md:
                playlist.myList) {
           // visit(md)

        }
        return playlist.getSize();
    }



    @Override
    public int visit(MediaPlayer mediaPlayer) {
        mp= mediaPlayer;
        PlaylistSize+= mediaPlayer.playList.getSize();
    return mediaPlayer.playList.getSize();
    }

    @Override
    public void printSizes() {
        System.out.println("total"+visit(mp));
        System.out.println("Video "+VideoSize);
        System.out.println("Gif "+GifSize);
        System.out.println("Song "+Songsize);
        System.out.println("Playlist "+ PlaylistSize);
    }
}
