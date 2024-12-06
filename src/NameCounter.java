class NameCounter {
    public int count(String text) {
        String[] words = text.split(" ");
        int namesCounter = 0;
        for (String word : words) {
            boolean isName = true;
            if (!Character.isUpperCase(word.charAt(0))) {
                isName = false;
            } else {
                for (int i = 1; i < word.length(); i++) {
                    if (!Character.isLowerCase(word.charAt(i))) {
                        isName = false;
                        break;
                    }
                }
            }
            if (isName) {
                namesCounter++;
            }
        }
        return namesCounter;
    }
}

class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}