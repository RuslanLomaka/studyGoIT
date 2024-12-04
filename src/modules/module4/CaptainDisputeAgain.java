package modules.module4;

public class CaptainDisputeAgain {
    public int findMin(int[] triple){
        return Integer.min(Integer.min(triple[0],triple[1]), triple[2]);
    }


    public static void main(String[] args) {
        CaptainDisputeAgain CaptainDisputeAgain = new CaptainDisputeAgain();

        System.out.println(CaptainDisputeAgain.findMin(new int[] {1, 10, 3}));
        System.out.println(CaptainDisputeAgain.findMin(new int[] {50, 4, 100}));
    }

}
