package modules.module4;

public class CheapStocks {

    public String getCheapStocks(String[] stocks){

        if (stocks == null || stocks.length == 0) return ""; //early exit
        StringBuilder namesOfCheapItems = new StringBuilder();

        for (String item : stocks) {
            String[] splitItem = item.split(" ");
            int itemPrice = Integer.parseInt(splitItem[1]);
            if (itemPrice<200) {
                namesOfCheapItems.append(splitItem[0]).append(" ");
            }
        }
        return namesOfCheapItems.toString().trim();//add that trim to remove the last space
    }

    public static void main(String[] args) {

        CheapStocks cheapStocks = new CheapStocks();
        System.out.println(cheapStocks.getCheapStocks(new String[] {"gun 500", "fireblow 70", "pixboom 200", "fireboow 70", "fireboioiow 70", "firebow 70"}));
    }

}
