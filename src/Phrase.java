import java.util.Arrays;

class Phrase {
    private  final String[] words;

    public Phrase(String[] words){
            this.words=words.clone();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for(String word:words){
            result.append(word+" ");
        }


        return result.toString().trim();
    }
}

class PhraseTest {
    public static void main(String[] args) {
        String[] words = {"alpha", "beta", "gamma"};
        Phrase phrase = new Phrase(words);

        System.out.println(phrase); //alpha beta gamma

        words[0] = "zero";

        System.out.println(phrase);  //alpha beta gamma
    }
}