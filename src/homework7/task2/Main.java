package homework7.task2;

class Main {
    public static void main(String[] args) {
        ErrorPrinter errorPrinter = new ErrorPrinter() {
            @Override
            public void printError(String string) {
                //System.out.println((char)27 + "[31m" + string);                       Как это расшифровать?
                System.out.println("\033[31m" + string + (char) 27 + "[33m" + string);
                //Это типа, после набора этих символов, все что будет выводиться далее, будет заданным цветом? -(char)27 + "[33m"
            }
        };
        errorPrinter.printError("BlaBlaBla");
    }
}
