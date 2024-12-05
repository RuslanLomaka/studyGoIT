class DigitText {

    public boolean detect(String text){
       return  text.replaceAll("[\\d\\s]", "").length()==0;
    }

}
class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}