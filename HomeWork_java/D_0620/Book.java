package D_0620;

public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("");
        sb.append("Title : ").append(title);
        sb.append(", Author : ").append(author);
        sb.append(", ISBN : ").append(isbn);
        return sb.toString();
    }
}

