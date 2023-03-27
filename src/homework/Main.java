package homework;

import homework.util.User;
import homework.util.impl.Report;
import homework.util.impl.Saver;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        Report.report(user);
        Saver.save(user);
    }
}