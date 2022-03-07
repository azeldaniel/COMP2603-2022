import java.util.ArrayList;

public class Magazine implements WrittenWork {

  private String title;
  private ArrayList<Author> authors;

  public Magazine(String title) {
    this.title = title;
    authors = new ArrayList<>();
  }

  public int getNumPages() {
    return authors.size() * 3;
  }

  public String getAuthorName() {
    String names = "";
    for (Author author : authors) {
      names += author.getName() + ", ";
    }
    return names;
  }

  public String getTitle() {
    return this.title;
  }

  public double getPrice() {
    return 50;
  }

  public void addAuthor(Author author) {
    authors.add(author);
  }

  public boolean hasAuthor(Author a) {
    if (authors.contains(a)) return true;
    return false;
  }
}
