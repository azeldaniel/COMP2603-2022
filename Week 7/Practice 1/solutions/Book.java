public abstract class Book implements WrittenWork {

  protected Author author;
  private String title;
  private int numPages;
  private double price;

  public Book(String title, int numPages) {
    this.title = title;
    this.numPages = numPages;
  }

  public void addAuthor(Author a) {
    author = a;
  }

  public String getAuthorName() {
    return author.getName();
  }

  public String getTitle() {
    return title;
  }

  public int getNumPages() {
    return numPages;
  }
}
