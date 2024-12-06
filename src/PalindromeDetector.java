class PalindromeDetector {
    public boolean isPalindrome(String word) {


        return word.equalsIgnoreCase(reverse(word));
    }

    private String reverse(String word) {
        StringBuilder sbWord = new StringBuilder(word);
        return sbWord.reverse().toString();
    }
}

class PalindromeDetectorTest {
    public static void main(String[] args) {
        //false
        System.out.println(new PalindromeDetector().isPalindrome("Javaj"));

        //true
        System.out.println(new PalindromeDetector().isPalindrome("Noon"));
    }
}