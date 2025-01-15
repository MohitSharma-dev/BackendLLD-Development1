package PrototypeAndRegistry;

public class IntelligentStudent extends Student {
    private int iq;

    IntelligentStudent(){
        this.iq = 50;
    }

    IntelligentStudent(IntelligentStudent student){
        super(student);
        this.iq = student.iq;
    }

    @Override
    public IntelligentStudent copy() {
        IntelligentStudent student = new IntelligentStudent(this);
        return student;
    }
}
