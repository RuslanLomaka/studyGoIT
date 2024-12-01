package module4;

import java.util.Arrays;

public class UberShop {
    public void printPrices(float[] prices) {
        for(float price: prices)
            System.out.println(price + " jup.");
    }

    public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < 1000) {
                prices[i] *= 2f;
            } else if (prices[i] >= 1000) {
                prices[i] *= 1.5f;
            }
        }
    }

    public int[] findMinMaxPrices(int[] prices){
        if(prices.length==0) return new int[0];

        int maxPrice= Integer.MIN_VALUE;
        int minPrice= Integer.MAX_VALUE;

        for (int price : prices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
            if (price < minPrice) {
                minPrice = price;
            }
        }

        if(maxPrice==minPrice) return new int[]{minPrice};

        return new int[]{minPrice,maxPrice};
    }

    public int getMinPriceCount(int[] prices){
        if (prices.length==0) return 0;

        int minPrice= Integer.MAX_VALUE;

        for (int price : prices) {

            if (price < minPrice) {
                minPrice = price;
            }
        }

        int anountOfMinPrices =0;

            for (int price1 : prices){
                if(price1==minPrice) anountOfMinPrices++;
            }

        return anountOfMinPrices;
    }

    public int[] removePrice(int[] prices, int toRemove){

        int a=0;//how many elements to remove
        for(int price : prices){
            if(price==toRemove) a++;
        }

        int[] editedPrices = new int[prices.length-a];// new array to return

        int j = 0;//pointer for editedPrices
        for (int price : prices) {
            //int j = 0;//pointer for editedPrices was declared in loop by mistake
            if (!(price == toRemove)) {
                editedPrices[j] = price;
                j++; //move pointer after adding new element to editedPrices
            }
        }

        return editedPrices;
    }

    public int[] leavePrice9(int[] prices){
        int howMany9s =0;
            for (int price :prices){
               if(price%10==9){ //if last digit is 9
               howMany9s++;     //incr size of return array
               }
            }

        int[] prices9 = new int[howMany9s];//declaring array to return with proper size

        int i=0;
        for(int price:prices){
            if(price%10==9){//if last digit of price is 9
                prices9[i]=price;//copy it to return array
                i++;
            }
        }

        return prices9;
    }
    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks){

        String [] mergedStock = new String[showcaseStocks.length+warehouseStocks.length];
        int i=0;

        for (String stockItem:showcaseStocks) {
           mergedStock [i] = stockItem ;
           i++;
        }

        for (String stockItem:warehouseStocks){
            mergedStock[i] = stockItem;
            i++;
        }

        return mergedStock;
    }

    public int getPricesSum(int[] prices, int minPrice, int maxPrice){
        int summ=0;
        for(int price:prices){
            if(price>=minPrice && price<=maxPrice){
                summ+=price;
            }
        }
        return summ;
    }

    //Test output

    public static void main(String[] args) {
            UberShop shop = new UberShop();

            //Final result should be ["gun", "firebow", "firegun"]
            String[] showcaseStocks = new String[] {"gun", "firebow"};
            String[] warehouseStocks = new String[] {"firegun"};
            System.out.println(Arrays.toString(shop.mergeStocks(showcaseStocks, warehouseStocks)));
    }

}