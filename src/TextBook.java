public class TextBook extends Book {
    private String subject;
    private int edition;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public TextBook(String isbn, String title, String author, boolean isAvailable , String subject , int edition) {
        super(isbn, title, author, isAvailable);
        this.subject = subject;
        this.edition = edition;
    }

    @Override
    void displayBookDetails() {

        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Isbn: " + getIsbn());
        System.out.println("Available: " + isAvailable());
    }

    @Override
    public void returnBook(User user) {
       user.returnBooks();
        returnBook(user);
    }

    @Override
    public boolean isAvailable() {
        return false;
    }



}
