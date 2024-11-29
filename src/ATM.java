public class ATM {

    public int countBanknotes(int sum){
        int[] banknotes = {500, 200, 100, 50, 20, 10, 5, 2, 1};

        int remainder = sum;
        int totalBnkNoteCont =0;
        int curentBnkNoteuCont=0;

        int i=0;
        while(i<banknotes.length){
            curentBnkNoteuCont=remainder/banknotes[i];
            totalBnkNoteCont+=curentBnkNoteuCont;
            remainder= remainder-curentBnkNoteuCont*banknotes[i];
            //System.out.println(curentBnkNoteuCont+" banknote(s) by "+banknotes[i]+". Still remains: "+remainder);
          i++;
        }
        return totalBnkNoteCont;
    }

    public static void main(String[] args) {
        ATM ATM = new ATM();
        System.out.println(ATM.countBanknotes(578));
    }
}
