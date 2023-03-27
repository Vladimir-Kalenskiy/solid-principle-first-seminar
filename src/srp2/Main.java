package srp2;

import srp2.model.Order;
import srp2.util.JsonSaver;
import srp2.util.Saver;
import srp2.view.Console;

public class Main {
    public static void main(String[] args) {
        System.out.println("¬ведите заказ:");
        Console consoleView = new Console();
        Order order = consoleView.inputFromConsole();
        Saver orderSaver = new JsonSaver(order);
        orderSaver.save();
    }
}
