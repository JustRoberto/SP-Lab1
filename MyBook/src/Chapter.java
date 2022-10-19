import java.util.ArrayList;
import java.util.List;

public class Chapter {
    public List<SubChapter> subchapters;
    public String name;

    public Chapter(String s) {
        this.name=s;
        this.subchapters=new ArrayList<SubChapter>();
    }

    public int createSubChapter(String s) {
        SubChapter temp= new SubChapter(s);
        subchapters.add(temp);
        return subchapters.indexOf(temp);
    }

    public SubChapter getSubChapter(int indexSubChapterOneOne) {
        return subchapters.get(indexSubChapterOneOne);
    }
}
