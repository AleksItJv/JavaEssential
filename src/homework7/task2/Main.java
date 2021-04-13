package homework7.task2;

class Main {
    public static void main(String[] args) {
        ErrorPrinter errorPrinter = new ErrorPrinter() {
            @Override
            public void printError(String string) {
                System.out.println("\033[31m" + string + (char) 27 + "[33m" + string);
            }
        };
        errorPrinter.printError("BlaBlaBla");
    }
}
