class SpaceRocketLauncher{
 private int bigRocketCount;//кількість великих ракет
 private int smallRocketCount;//кількість маленьких ракет



    public int getBigRocketCount() {
        return bigRocketCount;
    }

    public void setBigRocketCount(int bigRocketCount) {
       if( 0>bigRocketCount||bigRocketCount>100 ){return;}
       this.bigRocketCount = bigRocketCount;
    }

    public int getSmallRocketCount() {
        return smallRocketCount;
    }

    public void setSmallRocketCount(int smallRocketCount) {
     if( 0>smallRocketCount||smallRocketCount>100 ){return;}
        this.smallRocketCount = smallRocketCount;
    }

 public int getTotalPower(){/* Цей метод рахує загальну вогневу міць ракетної установки з розрахунку, що кожна велика  ракета, що залишилася, дає 100 одиниць міці, кожна маленька ракета - 50 одиниць міці.*/

     return this.bigRocketCount*100+this.smallRocketCount*50;
 }

    public void launchBigRocket() {
        if(this.getBigRocketCount()<0) return;
        --this.bigRocketCount;
    }
    public void launchSmallRocket() {
        if(this.getSmallRocketCount()<0) return;
        --this.smallRocketCount;
    }

 public static void main(String[] args) {
     SpaceRocketLauncher launcher = new SpaceRocketLauncher();
     launcher.setBigRocketCount(5);
     launcher.setSmallRocketCount(10);

     System.out.println("Power is " + launcher.getTotalPower());

     launcher.launchBigRocket();
     System.out.println("Big rocket count is " + launcher.getBigRocketCount());

     launcher.launchSmallRocket();
     System.out.println("Small rocket count is " + launcher.getSmallRocketCount());

     System.out.println("Power is " + launcher.getTotalPower());

 }




}