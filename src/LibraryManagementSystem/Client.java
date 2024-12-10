package LibraryManagementSystem;

public class Client {
    public static void main(String[] args) {
        LibraryManagementSystem libraryManagementSystem = new LibraryManagementSystem();

        Book book1 = new TextBook("Ncert", "123", "Mohit", 1, "Science");
        Book book2 = new NovelBook("245", "Champak", "Mohit sharma", "Comic");

        libraryManagementSystem.addBook(book1);
        libraryManagementSystem.addBook(book2);

        User user = new Member("Mohit" , "");
        User user2 = new Member("Nishant", "");

        libraryManagementSystem.registerUser(user);
        libraryManagementSystem.registerUser(user2);

        if(book1.lend(user)){
            System.out.println("Successfully lended the book");
        }

        if(book1.lend(user2)){
            System.out.println("Successfully lended the book");
        } else {
            System.out.println("Book is already lend");
        }

        book1.returnBook(user);
    }
}
