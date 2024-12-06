import java.util.Arrays;

class DigitExtracter {

    public int[] extract(String text) {
        StringBuilder digitBuilder = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                digitBuilder.append(c);
            }
        }
        int[] digits = new int[digitBuilder.length()];
        for (int i = 0; i < digitBuilder.length(); i++) {
            digits[i] = Character.getNumericValue(digitBuilder.charAt(i));
        }
        return digits;
    }
}


class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}