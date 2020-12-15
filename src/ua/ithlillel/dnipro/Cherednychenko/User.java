package ua.ithlillel.dnipro.Cherednychenko;

import java.util.Objects;

public class User {

    private String nickname;
    private String username;
    private String pass;

    public User(String nickname, String username, String pass) {
        this.nickname = nickname;
        this.username = username;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return String.format("User(%-21s, %-13s, %-11s",
                "nickname=\"" + nickname + '\"',
                "username=\"" + username + '\"',
                "password=\"" + pass + '\"',
                ")");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(nickname, user.nickname) &&
                Objects.equals(username, user.username) &&
                Objects.equals(pass, user.pass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, username, pass);
    }
}
