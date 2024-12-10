package LibraryManagementSystem;

public class Member extends User {
    private int borrowedBooksCount;
    private final static int MAX_BORROW_LIMIT = 5;

    Member(){
        super();
        borrowedBooksCount = 0;
    }

    Member(String name , String contactInfo){
        super(name, contactInfo);
        borrowedBooksCount = 0;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Member DashBoard");
        System.out.println("Name: " + getName());
        System.out.println("Number of Books Borrowed : " + borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        // we need to check if the current member can borrow more books
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }

    @Override
    public void returnBook() {
        borrowedBooksCount--;
    }
}
