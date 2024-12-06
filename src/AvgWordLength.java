class AvgWordLength {

    public double count(String phrase) {
        phrase = phrase.replaceAll("[,!.:;]", "");

        int wordCount = phrase.split(" ").length;
        int lettersCount =phrase.replaceAll(" ","").length();

        return (float)  lettersCount/wordCount;//average amount of letters in one word
    }


}


class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life, is strange thing"));
    }
}