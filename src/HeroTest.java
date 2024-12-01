public class HeroTest {

    public static void main(String[] args) {
        Hero hero = new Hero("Stranger", 2000);

        //Expect Stranger
        System.out.println(hero.getName());

        //Expect 50
        System.out.println(hero.getHp());
    }

}
class Hero{
    private String name;
    public String getName() {
        return name;
    }

    private int hp;
    public int getHp() {
        return hp;
    }

    public Hero(){
       this("Paratrooper",100);
    }

    public Hero(String name, int hp){
        this.name=name;
        if          (hp>200)    this.hp=200;
        else if     (hp<0)      this.hp=0;
        else                    this.hp=hp;

    }





}