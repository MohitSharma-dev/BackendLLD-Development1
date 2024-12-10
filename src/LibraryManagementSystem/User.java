package LibraryManagementSystem;

public abstract class User {
    private String userId;
    private String name;
    private String contactInfo;
    private static int totalUsers = 0;

    User(){
        userId = generateUniqueId();
    }

    User(String name , String contactInfo){
        userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    User(User other){
        this.name = other.name;
        this.contactInfo = other.contactInfo;
        this.userId = generateUniqueId();
    }

    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();
    public abstract void returnBook();

    private final String generateUniqueId(){
        totalUsers++;
        return "User-" + totalUsers;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
