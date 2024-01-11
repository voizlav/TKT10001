
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object compare) {
        if (!(compare instanceof Book)) {
            return false;
        }

        Book b = (Book) compare;

        return this.name.equals(b.name) && this.publicationYear == b.publicationYear;
    }
}
