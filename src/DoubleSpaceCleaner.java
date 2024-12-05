class DoubleSpaceCleaner {


    public String clean(String phrase) {
        StringBuilder sbPhrase = new StringBuilder(phrase);//My solution
        while (sbPhrase.indexOf("  ") >= 0) {
            sbPhrase.delete(sbPhrase.indexOf("  "), sbPhrase.indexOf("  ") + 1);
        }
        return sbPhrase.toString().trim();

    }

}

class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("    Hello     World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}