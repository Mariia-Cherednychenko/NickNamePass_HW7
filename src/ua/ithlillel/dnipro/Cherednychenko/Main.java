package ua.ithlillel.dnipro.Cherednychenko;

public class Main {

    public static void main(String[] args) {

        String textWithUsers = "programmer:vasia@123,programmer:vasia,vasia@1234,vasia,vasia:@trulala";
        String regex = "(?:([a-z]*?):)?([a-z]+)@?(\\d+)?";

        UserParser userParser = new UserParser(regex);
        userParser.showList(userParser.parseList(textWithUsers));

    }
}
