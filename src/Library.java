import java.util.Random;

public class Library {

    public String owner = "Yvonne Ye";
    public Book[] allBooks;

    public static void main(String[] args) {
        Library myLib = new Library();
    }

    public Library() {
        System.out.println("Welcome to " + owner + "'s library!!!!!");

        allBooks = new Book[10];

        Random r = new Random();

        for (int i = 0; i < allBooks.length; i++) {
            int randRating = r.nextInt(11);
            allBooks[i] = new Book(randRating);
        }

        for (Book b : allBooks) {
            b.print();
        }

        averageRating();
    }

    // Step 12: Calculate and print average rating
    public void averageRating() {
        int sum = 0;

        for (Book b : allBooks) {
            sum += b.getRating();
        }

        double average = (double) sum / allBooks.length;

        System.out.println("Average rating of all books = " + average);
    }
}
