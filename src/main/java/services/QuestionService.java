package services;

import entities.Question;

import java.util.List;

public interface QuestionService {

    public List<Question> findAll();

    public  int findAnswerIdCorrect(int questionId);
}
