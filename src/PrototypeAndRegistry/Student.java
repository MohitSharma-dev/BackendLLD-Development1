package PrototypeAndRegistry;

public class Student implements Prototype<Student>{
    private int id;
    private String name;
    private int age;
    private String batch;

    Student(int id, String name, int age, String batch) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.batch = batch;
    }

    Student(){

    }

    Student(Student student){
//        copying logic resides here

        this.id = student.id;
        this.name = student.name;
        this.age = student.age;
    }

    @Override
    public Student copy() {
        Student stCopy = new Student(this);
        return stCopy;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
