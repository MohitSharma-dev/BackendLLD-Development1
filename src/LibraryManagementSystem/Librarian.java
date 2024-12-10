package LibraryManagementSystem;

public class Librarian extends User {
    private String employeeNumber;

    Librarian(String employeeNumber, String name , String contactInfo) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("Employee Number : "+ employeeNumber + " Name :" + getName());
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    public void addNewBook(Book book) {
        System.out.println("New Book Added");
    }

    public void removeBook(Book book) {
        System.out.println("Book Removed");
    }

    @Override
    public void returnBook() {
        System.out.println("Returned Book");
    }
}
