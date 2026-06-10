package TemplateDesignPattern.OnlineExaminationSystem;

public abstract class OnlineExam {
    protected abstract void loadQuestions();

    protected  void publishResults(){
        System.out.println("Results questions are published");
    }

    protected void evaluateAnswers(){
        System.out.println("Answers questions are evaluated");
    }

    public final void coductExam(){
        loadQuestions();
        evaluateAnswers();
        publishResults();
    }
}
