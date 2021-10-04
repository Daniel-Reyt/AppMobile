package fr.lightning.AnimeQuizz.Model;

import java.util.ArrayList;
import java.util.List;

public class User {
  private String m_Username;
  private String m_Password;

  public User() {
  }

  public User(String pUsername, String pUsername1) {
    m_Username = pUsername;
    m_Password = pUsername1;
  }

  public String getUsername() {
    return m_Username;
  }

  public void setUsername(String pUsername) {
    m_Username = pUsername;
  }

  public String getPassword() {
    return m_Password;
  }

  public void setPassword(String pPassword) {
    m_Password = pPassword;
  }

  public List<User> getAllUser() {
    List<User> v_userList = new ArrayList<User>();

    User v_user1 = new User("dada", "dada");
    User v_user2 = new User("admin", "admin");

    v_userList.add(v_user1);
    v_userList.add(v_user2);

    return v_userList;
  }
}
