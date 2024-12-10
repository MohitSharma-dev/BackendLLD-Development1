package LibraryManagementSystem;

public abstract class Book implements Lendable{
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;
    private String type;

    Book(){
        isAvailable = true;
    }

    Book(String isbn, String title, String author, String type){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.type = type;
    }

    @Override
    public boolean lend(User user) {
        if(isAvailable && user.canBorrowBooks()){
            isAvailable = false;
            return true;
        }
        return false;
    }

    @Override
    public void returnBook(User user) {
        isAvailable = true;
        user.returnBook();
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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

    public abstract void displayBookDetails();
}
