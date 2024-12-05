class SensitiveDataSearcher {

    public boolean isSensitiveDataPresent(String phrase) {

        String[] sensitiveWords = new String[]{"pass", "key", "login", "email"};

        boolean isSensitive = false;

        for (String word : sensitiveWords) {
            if (phrase.toLowerCase().contains(word)) {
                return true;
            }
        }
        return isSensitive;

    }


}

class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}