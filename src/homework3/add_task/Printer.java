package homework3.add_task;

public class Printer {

    //private static final String ANSI_RED = "\033[0;31m";
    //private static final String ANSI_RESET = "\033[0m";

    public static void main(String[] args) {
        Printer printer = new Printer();
        Printer printerBrother = new PrinterBrother();
        printer.print("Class Printer");
        printerBrother.print("Class PrinterBrother");
    }

    void print(String value) {
        System.out.println(ConsoleColors.RED + value);
        //System.out.println(ANSI_RED + value);
    }
}