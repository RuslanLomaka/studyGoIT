public class SpaceShip {
    private String name;
    private String serialNumber;





    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>100) return;
        if (name.isBlank()||name.isEmpty()) return;
        this.name = name;
    }
    public String getSerialNumber() {
        return serialNumber;
    }


    public void setSerialNumber(String serialNumber) {
        if (!(serialNumber.length() == 8) && serialNumber.startsWith("SN")) return;
        this.serialNumber = serialNumber;
    }


    //Test output
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();
        ship.setName("Walker");
        System.out.println(ship.getName()); //Should be Walker

        ship.setName("");
        System.out.println(ship.getName()); //Should be Walker, empty value ignored

        ship.setName("Voyager ".repeat(100));
        System.out.println(ship.getName()); //Should be Walker, too long value ignored

    }


}