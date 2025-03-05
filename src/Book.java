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

}
