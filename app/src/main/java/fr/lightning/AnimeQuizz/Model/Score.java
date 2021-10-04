package fr.lightning.AnimeQuizz.Model;

public class Score {
  private int goodAnswer;
  private int badAnswer;

  public Score() {
  }

  public Score(int p_goodAnswer, int p_badAnswer) {
    goodAnswer = p_goodAnswer;
    badAnswer = p_badAnswer;
  }

  public int getGoodAnswer() {
    return goodAnswer;
  }

  public void setGoodAnswer(int p_goodAnswer) {
    goodAnswer = p_goodAnswer;
  }

  public int getBadAnswer() {
    return badAnswer;
  }

  public void setBadAnswer(int p_badAnswer) {
    badAnswer = p_badAnswer;
  }
  public void addGoodAnswer() {
    goodAnswer += 1;
  }

  public void addBadAnswer() {
    badAnswer += 1;
  }
}
