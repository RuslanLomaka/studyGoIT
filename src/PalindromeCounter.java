class PalindromeCounter {

    public int count(String phrase){

        String [ ] words = phrase.split(" ");
        int count =0;


        for(String word: words){



            word = word.toLowerCase().replace(".","")
                                    .replace(",","")
                                    .replace("!","")
                                    .replace(";","")
                                    .replace(":","");

            StringBuilder flipped = new StringBuilder(word).reverse(); // figured out later;


             // for (int i = word.length();i>0;i--){//also works but flipping manually
             //   flipped.append(word.charAt(i-1));
             // }

            //System.out.println(word);
            //System.out.println(flipped);
            //System.out.println();

            if (word.equals(flipped)){
                count++;
            }


        }
        return count;



    }
}

class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}