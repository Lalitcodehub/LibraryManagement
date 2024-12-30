public class Member extends User{
    private int borrowedBooksCount;
    private static final int  MAX_BORROW_LIMIT = 5;
    public Member() {
           super ();
           borrowedBooksCount = 0;
    }
    public Member(String name, String contactInfo){
        super(name, contactInfo);
        borrowedBooksCount = 0;
    }
    @Override
    void displayDashboard() {
        System.out.println("Name: " + getName());
        System.out.println("Borrowed books: " + borrowedBooksCount);
        System.out.println("Total borrowed books: " + borrowedBooksCount);

    }

    @Override
    boolean canBorrowBooks() {

        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }

    @Override
    public void returnBooks() {

        borrowedBooksCount--;
    }
}
