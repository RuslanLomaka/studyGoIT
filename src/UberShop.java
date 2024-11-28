import java.util.*;

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

    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be [50, 1500]
        int[] prices = new int[] {100, 1500, 300, 50};
        int[] prices1= new int[] {10, 50, 3, 1550};
        int[] prices2= new int[] {50,50};
        int[] prices3= new int[] {};

        int[] minMax = shop.findMinMaxPrices(prices);
        int[] minMax1 = shop.findMinMaxPrices(prices1);
        int[] minMax2 = shop.findMinMaxPrices(prices2);
        int[] minMax3 = shop.findMinMaxPrices(prices3);

        System.out.println(Arrays.toString(minMax));
        System.out.println(Arrays.toString(minMax1));
        System.out.println(Arrays.toString(minMax2));
        System.out.println(Arrays.toString(minMax3));
    }
}