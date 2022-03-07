public class Novel extends Book {

  public Novel(Author author, String title, int numPages) {
    super(title, numPages);
    addAuthor(author);
  }

  public double getPrice() {
    return getNumPages() * 0.75;
  }

  public String toString() {
    String novelDetails = "NOVEL: ";
    novelDetails += getTitle() + "\n";
    novelDetails += getAuthorName() + "\n";
    novelDetails += getPrice() + "\n";
    novelDetails += getNumPages() + "\n";
    return novelDetails;
  }

  public boolean hasAuthor(Author a) {
    return author.getName().equals(a.getName());
  }
}
