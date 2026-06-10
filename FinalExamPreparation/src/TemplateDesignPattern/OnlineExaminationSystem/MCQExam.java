package TemplateDesignPattern.OnlineExaminationSystem;

public class MCQExam extends OnlineExam{
    @Override
    protected void loadQuestions() {
        System.out.println("MCQ questions are loaded");
    }

}
