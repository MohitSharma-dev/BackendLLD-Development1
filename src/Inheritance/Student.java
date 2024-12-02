package Inheritance;

public class Student extends User{
    private double psp;
    private String batch;

    Student(){
        System.out.println("Student constructor is called");
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }
}
