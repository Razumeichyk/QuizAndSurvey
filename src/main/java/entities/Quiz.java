package entities;


import java.util.Date;
import java.util.List;

public class Quiz {

    private Integer id;
    private String surveyTitle;
    private String description;
    private List<Question> questions;
    private List<Answer> answers;
    private Integer correctAnswers;
    private Date creationDate;
}
