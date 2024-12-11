package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    public List<Book> bookInventory;
    public List<User> registeredUsers;

    LibraryManagementSystem(){
        bookInventory = new ArrayList<>();
        registeredUsers = new ArrayList<>();
    }

    public void addBook(Book book){
        bookInventory.add(book);
    }

    public void registerUser(User user){
        registeredUsers.add(user);
    }

    public Book searchBooks(String criteria){
        for(Book book : bookInventory){
            if(book.getAuthor().equalsIgnoreCase(criteria) ||
            book.getTitle().equalsIgnoreCase(criteria) ){
                return book;
            }
        }
        return null;
    }

    public Book searchBooks(String criteria , BookType type){
        for(Book book : bookInventory){
            if((book.getAuthor().equalsIgnoreCase(criteria) ||
                    book.getTitle().equalsIgnoreCase(criteria))
                    && book.getType() == type ){
                return book;
            }
        }
        return null;
    }
}
