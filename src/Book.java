import java.util.Objects;

public class Book {

    private final String title;
    private String Author;
    private int publishingYear;

    public Book(String title, String Author, int publishingYear) {
        this.title = title;
        this.Author = Author;
        this.publishingYear = publishingYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return Author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        if (publishingYear < 1100 || publishingYear > 2050) {
            System.out.println("Invalid publishing year:" + publishingYear);
            return;
        }
        this.publishingYear = publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(title, book.title) && Objects.equals(Author, book.Author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, Author, publishingYear);
    }

    @Override
    public String toString() {
        return
                "Книга " + title + '\'' +
                " Автор " + Author + '\'' +
                " Год публикации " + publishingYear;
    }
}
