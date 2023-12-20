public class Book {
    private String title;
    private int pages;
    private int year;

    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    public int getPublicationYear() {
        return this.year;
    }

    @Override
    public String toString() {
        return String.format("%s, %d pages, %d", this.title, this.pages, this.year);
    }
}
