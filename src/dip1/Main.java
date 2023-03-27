package dip1;

import dip1.model.Report;
import dip1.model.ReportItem;
import dip1.model.util.Printer;
import dip1.model.util.ReportPrinter;

public class Main {
    public static void main(String[] args) {
        Printer<ReportItem> printer = new ReportPrinter();
        Report report = new Report(printer);
        report.calculate();
        report.output();
    }
}
