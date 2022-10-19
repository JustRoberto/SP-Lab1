import java.util.ArrayList;
import java.util.List;

public class Book {
    public String title;
    public Author auth;

    public List<Chapter> chapters;
    public Book(String title) {
        this.title=title;
        this.chapters= new ArrayList<Chapter>();
    }


    public void print() {
    }

    public void addAuthor(Author auth) {
        this.auth=auth;
    }

    public int createChapter(String s) {
        Chapter temp =new Chapter(s);
        chapters.add(temp);
        return chapters.indexOf(temp);
    }

    public Chapter getChapter(int indexChapterOne) {
        return chapters.get(indexChapterOne);
    }
}
