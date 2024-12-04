package modules.module6;

class LevelLoader1 {
    private LevelLoader1(){}
    public String load(String levelName) {
        return "Loading level " + levelName + " ...";
    }

    private static LevelLoader1 instance = new LevelLoader1();

    public static LevelLoader1 getInstance(){
        return instance;
    }
}



class LevelLoaderTest1 {
    public static void main(String[] args) {
        //Loading level Startlevel ...
        System.out.println(LevelLoader1.getInstance().load("StartLevel"));
    }
}