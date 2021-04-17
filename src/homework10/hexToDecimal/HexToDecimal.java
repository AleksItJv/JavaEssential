package homework10.hexToDecimal;

public class HexToDecimal {

    public static void main(String[] args) {
        String number = "-C";
        System.out.println(new HexToDecimal().hexToDecimal(number));
    }

    public int hexToDecimal(String number) {
        char ch[] = number.toCharArray();
        int result = 0;
        if (ch[0] == '-'){
            char newCh[] = new char[ch.length - 1];
            for (int i = 1; i < ch.length; i++){
                newCh[i - 1] = ch[i];

            }
            ch = newCh;
            for (int i = ch.length - 1; i >= 0; i--) {
                result += Character.getNumericValue(ch[i]) * (int) Math.pow(16, (ch.length - 1 - i));
            }
            return - result;
        }
        for (int i = ch.length - 1; i >= 0; i--) {
            result += Character.getNumericValue(ch[i]) * (int) Math.pow(16, (ch.length - 1 - i));
        }
        return result;
    }

}
