package module4;

public class TrurlBank {

    public int sumQuads(int n){
        int answer =0;

        int i=n;
        while(i>0){
            answer= answer+i*i;
            i--;
        }
        return answer;
    }

    public int countSumOfDigits(int number){
        int answer=0;
        char[] digits= Integer.toString(number).toCharArray();

        int i=0;
        while(i<digits.length){
            int digit = Integer.parseInt(String.valueOf(digits[i]));
            answer=answer+digit;
            i++;
        }
        return answer;


    }

    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 14 - 1 + 4 + 9
        //System.out.println(bank.sumQuads(3));

        //Should be 16 - 5 + 4 + 7
        System.out.println(bank.countSumOfDigits(999));
    }
}