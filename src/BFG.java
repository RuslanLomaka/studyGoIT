class BfgTest {

}

public class BFG{
    private int ammo ;
    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }
    public int getAmmo(){
        return ammo;
    }

    private int damage;
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getDamage() {
        return damage;
    }

    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


   public BFG(int ammo, int damage,String name){
        this.setAmmo(ammo);
        this.setDamage(damage);
        this.setName(name);
   }

    public BFG(int ammo, int damage){
      this(ammo,damage,"BFG");
    }

   public BFG(int ammo){
        this(ammo,50,"BFG");
   }

   public BFG(){
        this(1000,50,"BFG");
   }

   @Override
    public String toString(){

        return (name+", ammo: "+ammo+", damage: "+damage);
   }

    public static void main(String[] args) {
        //ExtraGun, ammo: 10000, damage: 300
        System.out.println(new BFG(10000, 300, "ExtraGun"));

        //BFG, ammo: 5000, damage: 200
        System.out.println(new BFG(5000, 200));

        //BFG, ammo: 2000, damage: 50
        System.out.println(new BFG(2000));

        //BFG, ammo: 1000, damage: 50
        System.out.println(new BFG());

    }


}