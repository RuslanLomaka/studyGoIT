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

    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be [200, 2250]
        float[] prices = new float[] {100f, 1500f};
        shop.multiplyPrices(prices);
        System.out.println(Arrays.toString(prices));
    }
}