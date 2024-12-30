public abstract class Book implements Lendable{
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    abstract void displayBookDetails();

    public Book(String isbn, String title, String author, boolean isAvailable) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    public Book(){
        this.isAvailable = true;
    }

    public Book(Book book ){
        this.isbn = book.isbn;
        this.title = book.title;
        this.author = book.author;
        this.isAvailable = true;
    }

    public void returnBook(User user){
        isAvailable = true;
        user.returnBooks();
    }
    public boolean lend(User user) {
       if(isAvailable && user.canBorrowBooks()){
           return true;
       }

        return false;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
}
