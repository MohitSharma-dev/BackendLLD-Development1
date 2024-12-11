package LibraryManagementSystem;

public class TextBook extends Book {
    private String subject;
    private int edition;

    TextBook(String title, String isbn, String author, int edition, String subject) {
        super(isbn , title , author, BookType.TEXTBOOK);
        this.edition = edition;
        this.subject = subject;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Subject : " + subject);
        System.out.println("Edition : " + edition);
    }
}
