import java.util.Arrays;

class UniqueCharCounter {


    public int count(String phrase){
        char[] chars =phrase.toCharArray();
        Arrays.sort(chars);
        int count = 0;
        if (chars.length<2){
            return 2;
        }

        for(int i=0;i<chars.length-1;i++){
            if (chars[i]!=chars[i+1]){
               count++;
            }
        }
        count++;
        return count;
    }

}
class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();
        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));

    }
}