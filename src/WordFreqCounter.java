class WordFreqCounter {

    public float countFreq(String phrase, String word) {

        String[] words = phrase.split(" ");
        int count = 0; // how many occurrences of given word in the phrase
        for (String oneWord : words) {

            if (word.toLowerCase().equals(oneWord.toLowerCase())) {

                count++;
            }
        }


        return (float) count / words.length;
    }

}

class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java hello world Hello Java hello world Hello Java hello world", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}