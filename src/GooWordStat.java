class GooWordStat {
    private int freq;
    private String word;

    public String getWord() {
        return word;
    }

    public int getFreq() {
        return freq;
    }

    public GooWordStat(String word, int freq) {
        this.freq = freq;
        this.word = word;
    }

    @Override
    public String toString() {
        String verbalFreq;
        if(freq>=10000000 ){
            verbalFreq="EXTRA HIGH";
        }else
        if (freq>=100000 ) {
            verbalFreq = "HIGH";
        }else
        if (freq>=1000 ) {
            verbalFreq = "MEDIUM";
        }else
        if (freq<1000 ) {
            verbalFreq = "LOW";
        }else {
            verbalFreq = "NEGATIVE";
        }



        return "Word is [" + word + "], search freq is " + verbalFreq;
    }

}


class GooWordStatTest {
    public static void main(String[] args) {
        //Word is [human], search freq is LOW
        System.out.println(new GooWordStat("human", 10));

        //Word is [mars], search freq is MEDIUM
        System.out.println(new GooWordStat("mars", 10000));

        //Word is [space], search freq is HIGH
        System.out.println(new GooWordStat("space", 9965499));

        //Word is [life], search freq is EXTRA HIGH
        System.out.println(new GooWordStat("life", 564785654));
    }
}