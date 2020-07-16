package services;

import entities.Answer;
import entities.Question;
import repositories.QuestionRepository;

import java.util.List;

public class QuestionServiceImpl implements QuestionService {

    private QuestionRepository questionRepository;

    @Override
    public List<Question> findAll() {
        return (List<Question>) questionRepository.findAll();
    }

    @Override
    public int findAnswerIdCorrect(int questionId){
        Question question = questionRepository.findById(questionId).get();
        for (Answer answer : question.getAnswers()){
            if (answer.isCorrect()){
                return answer.getId();
            }
        }
        return -1;
    }
}
