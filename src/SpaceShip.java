class Engine{
    private int power;


    public static void main(String[] args) {
        System.out.println(new Engine().getFuelType());
        System.out.println(new XFuelEngine().getFuelType());
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getFuelType(){
        return "A500";
    }
}
class XFuelEngine extends Engine{
    @Override
    public String getFuelType(){
        return "XFuel";
    }
}