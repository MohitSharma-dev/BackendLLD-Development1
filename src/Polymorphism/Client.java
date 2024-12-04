package Polymorphism;

public class Client {
    public static void main(String[] args) {

        User user = new User();
        Student student = new Student();
        TA ta = new TA();

        user.login();
        student.login();
        ta.login();
        student.attendClass();
//        user.attendClass();
//        user.solveHRO();
        UserUtility userUtility = new UserUtility();
        userUtility.changePassword(student, "Mohit");
        userUtility.changePassword(ta, "MohitTa");
        userUtility.changePassword(user, "Mohit");


        User studentUser = new Student();
        User TAUser = new TA();

        studentUser.login();
//        studentUser.attendClass();

//        incompatible types
//        TA taUser = new User();
//        UserUti
    }
}
