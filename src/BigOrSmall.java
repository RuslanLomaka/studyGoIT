class BigOrSmall {
    public String calculate(String text) {

        int smallCount = 0;
        int bigCount = 0;

        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                bigCount++;
            } else if (Character.isLowerCase(c)) {
                smallCount++;
            }
        }


        if (bigCount > smallCount) {
            return "Big";
        } else if (smallCount > bigCount) {
            return "Small";
        } else {
            return "Same";
        }


    }


}


class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}