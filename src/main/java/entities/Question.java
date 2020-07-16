package entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question {

    private Integer id;
    private String content;
    private Integer pointsForCorrectAnswers;
    private List<Answer> answers = new ArrayList<>();

    public Question(){
    }

    public Question(String content) {
        this.content = content;
    }

    public Question(String content, Integer pointsForCorrectAnswers, List<Answer> answers) {
        this.content = content;
        this.pointsForCorrectAnswers = pointsForCorrectAnswers;
        this.answers = answers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getPointsForCorrectAnswers() {
        return pointsForCorrectAnswers;
    }

    public void setPointsForCorrectAnswers(Integer pointsForCorrectAnswers) {
        this.pointsForCorrectAnswers = pointsForCorrectAnswers;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
