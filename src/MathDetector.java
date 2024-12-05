class MathDetector {

    public boolean isMath(String text) {

        boolean hasEqualsSign = (text.replaceAll("=", "").length() < text.length());
        boolean hasAtLeastTwoDigits = (text.replaceAll("\\d", "").length() < text.length() - 1);
        boolean hasOperands = (text.replaceAll("[+\\-*/]", "").length() < text.length());

        return hasEqualsSign && hasOperands && hasAtLeastTwoDigits;
    }


}


class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}