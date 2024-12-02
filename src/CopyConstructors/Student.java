package CopyConstructors;

public class Student {
//    data attributes
    public String name;
    private int age;
    int gradYear;
    public String course;
    private Exam enrollmentExam;
    private Batch batch;

    public Student(){
        System.out.println("Constructor 1 is called");
        name = "New_Student";
        age = 21;
        gradYear = 2020;
        course = "Java";
        enrollmentExam = new Exam(age * 100 + gradYear , name + "_enrollment_exam");
    }

    Student(String name1, int age1, int gradYear1){
        System.out.println("Constructor 2 is called");
        name = name1;
        age = age1;
        gradYear = gradYear1;
        enrollmentExam = new Exam(age * 100 + gradYear , name + "_enrollment_exam");
    }
    // copy constructor
    Student(Student other){
        this.name = other.name;
        this.age = other.age;
        this.course = other.course;
        this.gradYear = other.gradYear;
        // this will create again a shallow copy of Exam
        this.enrollmentExam = other.enrollmentExam;

        // deep copy : normal constructor
        this.enrollmentExam = new Exam(
                other.enrollmentExam.getExam_id(),
                other.enrollmentExam.getExam_name());

        // call copy constructor of Exam
        this.enrollmentExam = new Exam(other.enrollmentExam);

        // shallow copy works here, because we don't want
        // to create a new batch for each and every student
        this.batch = other.batch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
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


// Shallow copy : Whenever you want shallow copy at a particular level, you
// just need to copy the references at that level

// Deep copy : In deep copy you need to create new objects at every level
// and copy the details instead of references