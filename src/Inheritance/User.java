package Inheritance;

public class User {
    private int id;
    private String name;
    private String email;
    private String password;

    User(){
        System.out.println("User Constructor is called");
    }

    public void login(){
        System.out.println("Successfully logged in");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
