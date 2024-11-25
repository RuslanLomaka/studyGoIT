class Engine {
    private int power;
    public int getPower () {
        return power;
    }

    public void setPower ( int power){
        this.power = power;
    }

    public String getFuelType () {
        return "A500";
    }
}

class XFuelEngine extends Engine {
    protected String serialNumber;

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String getFuelType() {
        return "XFuel";
    }
}

class AdvancedXFuelEngine extends XFuelEngine {

    public void printInfo() {
        System.out.println("Serial number is " + this.serialNumber + ", power is " + this.getPower());
    }

    public static void main(String[] args) {
        AdvancedXFuelEngine engine = new AdvancedXFuelEngine();
        engine.setPower(1000);
        engine.setSerialNumber("SN504030");
        engine.printInfo(); //Serial number is SN504030, power is 1000
    }
}

