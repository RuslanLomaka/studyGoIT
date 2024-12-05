class WordDeleter {

    public String remove(String phrase, String[] words) {
        phrase = phrase.replaceAll("[^\\sa-zA-Z0-9]", "");

        String[] phraseArr = phrase.split(" ");
        StringBuilder phraseResult = new StringBuilder();

        for (String wordFromPhrase : phraseArr) {
            boolean toKeep = true;// do we want to keep this wordFromPhrase?

            for (String wordToRemove : words) {
                if (wordFromPhrase.equalsIgnoreCase(wordToRemove)) {
                    toKeep = false;//we don't want to keep it
                }

            }

            if(toKeep){
                phraseResult.append(wordFromPhrase+" ");
            }

        }

        return phraseResult.toString().trim();
    }

}


class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("Hello Java", new String[]{"Java"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[]{"is"}));
    }
}