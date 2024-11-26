import java.util.*;

public class HarekCity {
    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[] {age1, age2, age3, age4};
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public String firstAndLastTogether(String[] names) {
        return names[0] + " AND " + names[9] + " TOGETHER";
    }

    public void changeElectResult(String[] results) {
        String temp = results[0];
        results[0] = results[results.length - 1];
        results[results.length - 1] = temp;
    }

    public String[] changeElectResultAgain(String[] results) {
        return new String[] {
                results[2],
                results[3],
                results[4]
        };
    }

    public char[][] createKeyboard() {
             char[][] keyboard= new char[4][3];
                keyboard[0][0]='1';
                keyboard[0][1]='2';
                keyboard[0][2]='3';
                keyboard[1][0]='4';
                keyboard[1][1]='5';
                keyboard[1][2]='6';
                keyboard[2][0]='7';
                keyboard[2][1]='8';
                keyboard[2][2]='9';
                keyboard[3][0]='*';
                keyboard[3][1]='0';
                keyboard[3][2]='#';

        return keyboard;


    }
    public static void main(String[] args) {
        char[][] keyboard = new HarekCity().createKeyboard();
        for (int i = 0; i < keyboard.length; i++) {
            System.out.println(Arrays.toString(keyboard[i]));
        }
    }


}