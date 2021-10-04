package fr.lightning.AnimeQuizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import fr.lightning.AnimeQuizz.Model.User;

public class Home extends AppCompatActivity {
  public User user;
  TextView usernameTextView;
  TextView passwordTextView;
  Button start_question;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);

    usernameTextView = findViewById(R.id.usernameTextViewHome);
    passwordTextView = findViewById(R.id.passwordTextViewHome);
    start_question = findViewById(R.id.start_questionbtn);

    Intent v_intent = getIntent();
    usernameTextView.setText(v_intent.getStringExtra("username"));
    passwordTextView.setText(v_intent.getStringExtra("password"));

    start_question.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View p_view) {
        Intent intent = new Intent(Home.this, QuestionActivity.class);
        startActivity(intent);
      }
    });
  }
}