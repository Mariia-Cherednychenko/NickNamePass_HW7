package ua.ithlillel.dnipro.Cherednychenko;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserParser {

    Pattern pattern;

    public UserParser(String regex) {
        this.pattern = Pattern.compile(regex);
    }


    public User parse(String userInfo) {
        Matcher m = pattern.matcher(userInfo);
        m.find();
        String nickname = m.group(1) != null ? m.group(1) : m.group(2);
        String username = m.group(2);
        String pass = m.group(3);

        User newUser = new User(nickname, username, pass);
        return newUser;
    }

    public List<User> parseList(String allUserLine) {
        List<User> userList = new ArrayList<>();
        String[] userLineList = allUserLine.split(",");

        for (String line : userLineList) {
            Matcher m = pattern.matcher(line);
            if (!m.matches()) {
                System.out.println(line + " - invalid user. ");
                continue;
            }

            userList.add(parse(line));
        }
        return userList;
    }

    public void showList(List<User> userList) {
        for (User user : userList) {
            System.out.println(user);
        }
    }

}
