
import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    List<Book> bookInventory = new ArrayList<Book>();
    List<User> registeredUsers = new ArrayList<>();

    public void addBook(Book book){
        bookInventory.add(book);
    }
    public void addUser(User user){

    }
   boolean searchBooks(String isbn){
        for(Book book : bookInventory){
            if(book.getIsbn()
            .equals(isbn)){
                return true;
            }
        }
        return false;
    }
}