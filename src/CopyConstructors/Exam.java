package CopyConstructors;

public class Exam {
    private int exam_id;
    private String exam_name;
    private ReattemptExam reattempt_exam;

    Exam(){
        exam_id = 1;
        exam_name = "Exam 1";
        reattempt_exam = new ReattemptExam(exam_id);
    }

    Exam(int exam_id, String exam_name) {
        this.exam_id = exam_id;
        this.exam_name = exam_name;
        reattempt_exam = new ReattemptExam(exam_id);
    }

    Exam(Exam other){
        this.exam_id = other.exam_id;
        this.exam_name = other.exam_name;
        // copying the reference : Shallow copy
        this.reattempt_exam = other.reattempt_exam;
    }

    public int getExam_id() {
        return exam_id;
    }

    public void setExam_id(int exam_id) {
        this.exam_id = exam_id;
    }

    public String getExam_name() {
        return exam_name;
    }

    public void setExam_name(String exam_name) {
        this.exam_name = exam_name;
    }
}
