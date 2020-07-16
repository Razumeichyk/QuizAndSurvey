package entities;

public class Answer {

    private Integer id;
    private String content;
    private boolean correct;

    public Answer() {
    }

    public Answer(Integer id, String content, boolean correct) {
        this.id = id;
        this.content = content;
        this.correct = correct;
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

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
}
