package PrototypeAndRegistry;

public class Client {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        Student mar23Student = new Student(0 , "Temp_Name" , 0 , "Mar23");
        studentRegistry.add("Mar23Student" , mar23Student);

        Student newMar23Student = studentRegistry.get("Mar23Student");
        newMar23Student.setName("Joshy");
        newMar23Student.setAge(5);

        Student newMar23Student2 = studentRegistry.get("Mar23Student");
        newMar23Student2.setAge(50);
        newMar23Student2.setName("Josh");

        Student st = new Student(1 , "Mohit" , 26, "");

//        Student st2 = st;
//        Student st2 = new Student(st.id , );
        Student st2 = st.copy();
//        Let's suppose I want to store prototype of students who will enroll in march , april

        IntelligentStudent it = new IntelligentStudent();
//        IntelligentStudent st4 = it.copy();
    }
}
