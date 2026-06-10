package TemplateDesignPattern.OnlineExaminationSystem;

public class OnlineexamDemo {
    public static void main(String[] args) {
        OnlineExam mcq = new MCQExam();
        OnlineExam programme = new ProgramminExam();

        mcq.coductExam();
        programme.coductExam();
    }


}
