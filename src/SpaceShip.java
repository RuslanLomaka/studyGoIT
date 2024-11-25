class SpaceshipCalc{
    final int calculateAirBalloons(int passengerCount){
        return 10*passengerCount;
    }
    int calculateBookCount(int passengerCount){
        return passengerCount*2;
    }

    public static void main(String[] args) {
        SpaceshipCalc calc = new SpaceshipCalc();
        System.out.println(calc.calculateAirBalloons(35));
        System.out.println(calc.calculateBookCount(50));
    }
}