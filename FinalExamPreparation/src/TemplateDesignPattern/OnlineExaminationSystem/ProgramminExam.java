package TemplateDesignPattern.OnlineExaminationSystem;

public class ProgramminExam extends OnlineExam{
    @Override
    protected void loadQuestions() {
        System.out.println("Programming questions loaded");
    }
}
