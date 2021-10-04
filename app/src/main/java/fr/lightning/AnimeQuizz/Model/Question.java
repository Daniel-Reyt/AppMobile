package fr.lightning.AnimeQuizz.Model;

import java.util.List;

public class Question {
  private int id;
  private String question;
  private int id_goodAnswer;
  private List<String> AnswerList;

  public Question() {
  }

  public Question(int p_id, String p_question, int p_id_goodAnswer, List<String> p_answerList) {
    this.setId(p_id);
    this.setQuestion(p_question);
    this.setId_goodAnswer(p_id_goodAnswer);
    this.setAnswerList(p_answerList);
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String p_question) {
    question = p_question;
  }

  public int getId_goodAnswer() {
    return id_goodAnswer;
  }

  public void setId_goodAnswer(int p_id_goodAnswer) {
    id_goodAnswer = p_id_goodAnswer;
  }

  public List<String> getAnswerList() {
    return AnswerList;
  }

  public void setAnswerList(List<String> p_answerList) {
    AnswerList = p_answerList;
  }

  public int getId() {
    return id;
  }

  public void setId(int p_id) {
    id = p_id;
  }
}
