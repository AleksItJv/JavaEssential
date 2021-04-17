package homework10.hexToDecimal;

public class HexToDecimal {

    public static void main(String[] args) {
        String number = "B5ae452";
        System.out.println(new HexToDecimal().hexToDecimal(number));
    }

    public int hexToDecimal(String number) {
        char ch[] = number.toCharArray();
        int result = 0;
        for (int i = ch.length - 1; i >= 0; i--) {
            result += Character.getNumericValue(ch[i]) * (int) Math.pow(16, (ch.length - 1 - i));
        }
        return result;
    }

}
