package modules.module3;

import java.util.Arrays;
import java.util.Scanner;

public class SaveStarShip {

    public int calculateDistance(int i) {
        return Integer.signum(i)*i;
    }

    public String[] getPlanets(String galaxy) {
        if ("Miaru".equals(galaxy)) return new String[]{"Maux", "Reux", "Piax"};
        if ("Milkyway".equals(galaxy)) return new String[]{"Earth", "Mars", "Jupiter"};
        if ("DangerBanger".equals(galaxy)) return new String[]{"Fobius", "Demius"};
        return new String[0];
    }

    public String choosePlanet(long distanceToEarth) {
        if (distanceToEarth<45677)return "Earth";
        else return "Pern";
    }

    public int calculateFuelPrice(String fuel, int count) {
        final int STAR100_PRICE = 70;
        final int STAR500_PRICE = 120;
        final int STAR1000_PRICE = 200;
        final int DEFAULT_PRICE = 50;


        if ("STAR100".equals(fuel)) return count * STAR100_PRICE;
        if ("STAR500".equals(fuel)) return count * STAR500_PRICE;
        if ("STAR1000".equals(fuel)) return count * STAR1000_PRICE;
        return count * DEFAULT_PRICE;
    }

    public int roundSpeed(int speed){
       return (((speed-1)/10)+1)*10;
    }

    public int calculateNeededFuel(int distance){
        final int BASE_FUEL = 1000;//amount need to be used for starting engine, can also travel 20 l.y. on this fuel without using more
        if(distance<=20)return BASE_FUEL;
        return BASE_FUEL+(distance-20)*5;//each 1 l.y.over amount of 20 needs to spend 5 units of fuel to travel
    }

    public void calculateMaxPower(){

        //reading power data from user
        Scanner scanner = new Scanner(System.in);
        int power1 = scanner.nextInt();
        int power2 = scanner.nextInt();
        int power3 = scanner.nextInt();
        scanner.close();

        //choosing maximal power
        int maxPower=power1;
        if (power2>maxPower) maxPower=power2;
        if (power3>maxPower) maxPower=power3;

        //setting up the power constants
        final float COEFF_SMALL = 0.7f;
        final float COEFF_MEDIUM = 1.2f;
        final float COEFF_LARGE = 2.1f;

        //calculating output according to the algorithm with proper coefficients
        float realPower = (float) maxPower*COEFF_SMALL;
        if (maxPower>10) realPower= (float) maxPower*COEFF_MEDIUM;
        if (maxPower>100) realPower = (float) maxPower * COEFF_LARGE;
        System.out.println(realPower);
    }

    public String getMyPrizes(int ticket){
        String prize = "";
        if(ticket%10==0) prize += "crystall";
        if(ticket%10==7) prize += " chip";
        if(ticket>200) prize += " coin";
        return prize;
    }

    public boolean isHangarOk (int side1, int side2, int price){
        int area =  side1*side2;
        int pricePerSqMetr = price/area;
        int bigSide = Math.max(side1,side2);
        int smallSide = Math.min(side1,side2);
          boolean ratioIsOk = !(bigSide -2 * smallSide > 0);
        boolean pricePerSqMtrIsOk = pricePerSqMetr<=1000;
        boolean areaIsOk = area>=1500;
        return ratioIsOk && pricePerSqMtrIsOk && areaIsOk;
    }


    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();
        System.out.println(ship.calculateDistance(-10));  //Should be 10
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger"))); //Should be [Fobius, Demius]
        System.out.println(ship.choosePlanet(10)); //Should be Earth
        System.out.println(ship.calculateFuelPrice("STAR100", 10)); //Should be 700
        System.out.println(ship.roundSpeed(55)); //Should be 60
        System.out.println(ship.calculateNeededFuel(1001)); //Should be 1005
        ship.calculateMaxPower(); //Test stdin data - 1 3 5.Console ouput should be 3.5
        System.out.println(ship.getMyPrizes(54)); //Should be "crystall coin"
        System.out.println(ship.isHangarOk(53, 104, 5512000 ));//Should be true
    }

}