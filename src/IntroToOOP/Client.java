package IntroToOOP;

public class Client {
    public static void main(String[] args) {

        Student student1 = new Student();

        Student student3 = new Student("Mohit sharma", 26 , 2024);
//        student1.age = 26;
        student1.name = "John Doe";
        student1.course = "Computer Science";
        student1.gradYear = 2020;
//        student1.rateClass();
        student1.printDetails();

        Student student2 = new Student();

//        student2.age = 30;
        student2.name = "Jane Doe";
        student2.course = "Computer Science";
        student2.gradYear = 2015;

        student2.printDetails();
//      variable.property

        BankAccount bankAccount = new BankAccount();
//        bankAccount.ownerName = "Mohit Sharma";
//        bankAccount.balance = 10000;
        bankAccount.setOwnerName("John Doe");
        bankAccount.setBalance(10000);

        bankAccount.deposit(25000);
        bankAccount.withdraw(50);

        bankAccount.printTransactionHistory();

        Animal animal1 = new Animal();

        Dog dog1 = new Dog();

        System.out.println("");
    }
}
