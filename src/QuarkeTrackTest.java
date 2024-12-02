class QuarkeTrackTest {
    public static void main(String[] args) {
        int[] track1Data = {1, 3, 5};
        int[] track2Data = {3, 5, 4};
        int[] track3Data = {1, 5, 3};

        QuarkeTrack track1 = new QuarkeTrack(track1Data);
        QuarkeTrack track2 = new QuarkeTrack(track2Data);
        QuarkeTrack track3 = new QuarkeTrack(track3Data);

        //false
        System.out.println(track1.equals(track2));

        //true
        System.out.println(track1.equals(track3));

        //Can be true or false
        System.out.println(track1.hashCode() == track2.hashCode());

        //true
        System.out.println(track1.hashCode() == track3.hashCode());
    }
}

class QuarkeTrack{
    private int track =0;
    public QuarkeTrack(int[] lines){

        for (int run: lines){
            track+=run;
        }

    }


    @Override
    public boolean equals(Object Obj){
     if(this==Obj) return true;
     if (!(Obj instanceof QuarkeTrack)) return false;
     QuarkeTrack track1 = (QuarkeTrack) Obj;
     return track1.track==this.track;
    }



    @Override
    public int hashCode(){
        return (track+31)*31;
    }

}