package homework8.add_task;

public class Operations {
    int addition(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    int division(int firstNumber, int secondNumber) {
        int result = 0;
        try {
            result = firstNumber / secondNumber;
            return result;
        } catch (ArithmeticException aEx) {
            System.out.println("Делить на ноль нельзя");
            return 0;
        }


    }
}
