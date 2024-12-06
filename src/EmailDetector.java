class EmailDetector {

    public boolean isPresent(String text) {
        try {
            if (!text.contains("@")) {
                return false;
            } else if (text.charAt(text.indexOf('@') + 1) == ' ') {
                return false;
            } else if (text.charAt(text.indexOf('@') + 2) == ' ') {
                return false;
            } else if (text.charAt(text.indexOf('@') - 1) == ' ') {
                return false;
            } else if (text.charAt(text.indexOf('@') - 2) == ' ') {
                return false;
            }
        } catch (StringIndexOutOfBoundsException E) {
            return false;
        }

        return true;
    }


}


class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This @email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @"));
    }
}