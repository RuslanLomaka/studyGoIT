import java.util.Arrays;


class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}

class WordSplitter {


    public String[] split(String phrase) {


        StringBuilder sbPhrase = new StringBuilder(phrase.toLowerCase());//My solution
        while (sbPhrase.indexOf("  ") > 0) {
            sbPhrase.delete(sbPhrase.indexOf("  "), sbPhrase.indexOf("  ") + 1);
        }
        return sbPhrase.toString().split(" ");

        //return phrase.split("\\s+");///ChatGpt's solution
    }
}