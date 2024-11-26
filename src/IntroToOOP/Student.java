package IntroToOOP;

public class Student {
//    data attributes
    public String name;
    private int age;
    int gradYear;
    public String course;

    public Student(){
        System.out.println("Constructor 1 is called");
        name = "New_Student";
        age = 21;
        gradYear = 2020;
        course = "Java";
    }

    Student(String name1, int age1, int gradYear1){
        System.out.println("Constructor 2 is called");
        name = name1;
        age = age1;
        gradYear = gradYear1;
    }

    public void setAge(int updatedAge) {
//        checks and validations
        if(updatedAge < 18) {
            throw new RuntimeException("This is under Age");
        }
        age = updatedAge;
    }

    public int getAge(String token) {
        if(token.equals("$123")) {
            return age;
        }
        throw new RuntimeException("Invalid token! Access not allowed");
    }

    void raiseHR(){
//
        System.out.println("HR raised");
    }

    private void rateClass(){
        System.out.println("rate class");
    }

    public void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grad Year: " + gradYear);
        System.out.println("Course: " + course);
    }


}
