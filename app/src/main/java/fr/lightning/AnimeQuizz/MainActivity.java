package fr.lightning.AnimeQuizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

import fr.lightning.AnimeQuizz.Model.User;

public class MainActivity extends AppCompatActivity {
  EditText m_TextInputUsername;
  EditText m_TextInputPassword;
  Button m_BtnSubmit;
  TextView textview_err;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    m_TextInputUsername = findViewById(R.id.text_inputUsername_main);
    m_TextInputPassword = findViewById(R.id.text_inputPassword_main);
    m_BtnSubmit = findViewById(R.id.submit_btn_main);
    textview_err = findViewById(R.id.textview_err);
    m_BtnSubmit.setEnabled(true);

    m_BtnSubmit.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View p_view) {
        User v_user = new User();
        List<User> v_userList = v_user.getAllUser();

        for (int i = 0; i < v_userList.size(); i++) {
          if (v_userList.get(i).getUsername().toString().equals(m_TextInputUsername.getText().toString())) {
            if (v_userList.get(i).getPassword().toString().equals(m_TextInputPassword.getText().toString())) {
              Intent intent = new Intent(MainActivity.this, Home.class);

              String username = v_userList.get(i).getUsername().toString();
              intent.putExtra("username", username);
              String password = v_userList.get(i).getPassword().toString();
              intent.putExtra("password", password);
              startActivity(intent); }
          }
        }
      }
    });
    m_TextInputUsername.addTextChangedListener(new TextWatcher() {
      @Override
      public void beforeTextChanged(CharSequence p_charSequence, int p_i, int p_i1, int p_i2) {

      }

      @Override
      public void onTextChanged(CharSequence p_charSequence, int p_i, int p_i1, int p_i2) {

      }

      @Override
      public void afterTextChanged(Editable p_editable) {

      }
    });
  }

}