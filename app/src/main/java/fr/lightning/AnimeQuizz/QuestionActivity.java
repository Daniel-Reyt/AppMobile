package fr.lightning.AnimeQuizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import fr.lightning.AnimeQuizz.Model.Question;
import fr.lightning.AnimeQuizz.Model.Score;

public class QuestionActivity extends AppCompatActivity {
  TextView question;
  Button answer1Btn;
  Button answer2Btn;
  Button answer3Btn;
  TextView goodscore;
  TextView badscore;

  List<String> answer_question1 = new ArrayList<>();
  String answer1 = "1";
  String answer2 = "2";
  String answer3 = "3";
  Question m_question1 = new Question(0, "question 1", 0, answer_question1);
  Question m_question2 = new Question(0, "question 2", 1, answer_question1);
  Question m_question3 = new Question(0, "question 3", 2, answer_question1);

  List<Question> m_questionList = new ArrayList<>();

  int i = 0;

  Score userScore = new Score();
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    this.answer_question1.add(answer1);
    this.answer_question1.add(answer2);
    this.answer_question1.add(answer3);

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_question);

    question = findViewById(R.id.start_question);
    answer1Btn = findViewById(R.id.answer1Btn);
    answer2Btn = findViewById(R.id.answer2Btn);
    answer3Btn = findViewById(R.id.answer3Btn);
    goodscore = findViewById(R.id.goodscore);
    badscore = findViewById(R.id.badscore);
    m_questionList.add(m_question1);
    m_questionList.add(m_question2);
    m_questionList.add(m_question3);

    DisplayNextQuestion(m_questionList.get(0));
    answer1Btn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View p_view) {
        if (m_questionList.get(i).getId_goodAnswer() == 0) {
          userScore.addGoodAnswer();
          DisplayScore(userScore);
          i += 1;
          CheckIfNoQuestion(i, m_questionList.size());
          DisplayNextQuestion(m_questionList.get(i));
        } else {
          userScore.addBadAnswer();
          DisplayScore(userScore);
          i += 1;
          CheckIfNoQuestion(i, m_questionList.size());
          DisplayNextQuestion(m_questionList.get(i));
        }
      }
    });

    answer2Btn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View p_view) {
        if (m_questionList.get(i).getId_goodAnswer() == 1) {
          userScore.addGoodAnswer();
          DisplayScore(userScore);
          i += 1;
          CheckIfNoQuestion(i, m_questionList.size());
          DisplayNextQuestion(m_questionList.get(i));
        } else {
          userScore.addBadAnswer();
          DisplayScore(userScore);
          i += 1;
          CheckIfNoQuestion(i, m_questionList.size());
          DisplayNextQuestion(m_questionList.get(i));
        }
      }
    });

    answer3Btn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View p_view) {
        if (m_questionList.get(i).getId_goodAnswer() == 2) {
          userScore.addGoodAnswer();
          DisplayScore(userScore);
          i += 1;
          CheckIfNoQuestion(i, m_questionList.size());
          DisplayNextQuestion(m_questionList.get(i));
        } else {
          userScore.addBadAnswer();
          DisplayScore(userScore);
          i += 1;
          CheckIfNoQuestion(i, m_questionList.size());
          DisplayNextQuestion(m_questionList.get(i));
        }
      }
    });
  }

  private void DisplayScore(Score p_score) {
    goodscore.setText(p_score.getGoodAnswer() +  " bonnes réponses");
    badscore.setText(p_score.getBadAnswer() +  " mauvaises réponses");
  }
  private void DisplayNextQuestion(Question p_question) {
    question.setText(p_question.getQuestion());
    answer1Btn.setText(p_question.getAnswerList().get(0));
    answer2Btn.setText(p_question.getAnswerList().get(1));
    answer3Btn.setText(p_question.getAnswerList().get(2));
  }
  private void CheckIfNoQuestion(int i, int remainQuestion) {
    if (i == remainQuestion) {
      Intent v_intent = new Intent(QuestionActivity.this, Home.class);
      startActivity(v_intent);
    }
  }
}