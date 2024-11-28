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

    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be [50, 1500]
        int[] prices = new int[] {100, 1500, 300, 50, 10, 10, 70,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        System.out.println(shop.getMinPriceCount(prices)); //Should be 2
    }
}