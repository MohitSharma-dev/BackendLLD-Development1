package Inheritance;

public class Client {
    public static void main(String[] args) {
        User user = new User();

        Student student = new Student();

        Instructor instructor = new Instructor();

        user.login();
        student.login();
        instructor.login();

        D d = new D();

        System.out.println();
    }
}

// whenever a child object it's parent constructor is also called

// D->C->B->A

// D's constructor is called
// C's constructor is called by D's
// B's constructor is called by C's
// A's constructor is called by B's
// A's constructor is exectued completely

