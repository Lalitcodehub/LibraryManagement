public class Librarian extends User {
    private String employeeNumber;
    @Override
    void displayDashboard() {
        System.out.println("Librarian DashBoard");
        System.out.println("Employee Number: " + employeeNumber);
        System.out.println("Name : " + getName());

    }

    Librarian(String employeeNumber, String name, String contactInfo) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    @Override
    boolean canBorrowBooks() {
        return true;
    }

    @Override
    public void returnBooks() {

    }

    public void addNewBook(Book book){
      System.out.println("Adding new book");
    }
    public void removeBook(Book book){
       System.out.println("Removing book");
    }

}
