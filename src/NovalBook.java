public class NovalBook extends Book {
    private String genre;

    public NovalBook(String isbn, String title, String author, boolean isAvailable, String genre) {
        super(isbn, title, author, isAvailable);
        this.genre = genre;
    }


    @Override
    void displayBookDetails() {
       System.out.println("Genre: " + genre);
       System.out.println("Title: " + getTitle());
       System.out.println("Author: " + getAuthor());
       System.out.println("Isbn: " + getIsbn());
        System.out.println("Available: " + isAvailable());

    }

    @Override
    public void returnBook(User user) {

    }

    @Override
    public boolean isAvailable() {
        return false;
    }
}
