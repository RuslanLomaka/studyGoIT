import java.util.Arrays;

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

    private static final int STAR100_PRICE = 70;
    private static final int STAR500_PRICE = 120;
    private static final int STAR1000_PRICE = 200;
    private static final int DEFAULT_PRICE = 50;

    public int calculateFuelPrice(String fuel, int count) {
        if ("STAR100".equals(fuel)) return count * STAR100_PRICE;
        if ("STAR500".equals(fuel)) return count * STAR500_PRICE;
        if ("STAR1000".equals(fuel)) return count * STAR1000_PRICE;
        return count * DEFAULT_PRICE;
    }

    public int roundSpeed(int speed){
       return (((speed-1)/10)+1)*10;
    }

    public int calculateNeededFuel(int distance){
        if(distance<=20)return 1000;
        return 1000+(distance-20)*5;
    }

    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));

        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));

        //Should be Earth
        System.out.println(ship.choosePlanet(10));

        //Should be 700
        System.out.println(ship.calculateFuelPrice("STAR100", 10));

        //Should be 60
        System.out.println(ship.roundSpeed(55));

        //Should be 1005
        System.out.println(ship.calculateNeededFuel(20));
    }
}