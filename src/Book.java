public class Book {

    private int rating;
    private String title;
    private String author;

    public Book(int pRating) {
        title = "Journey Under the Midnight Sun";
        author = "Higashino Keigo";
        this.rating = pRating;
    }

    public int getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void print() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Rating: " + rating);
        System.out.println("************");
    }
}
