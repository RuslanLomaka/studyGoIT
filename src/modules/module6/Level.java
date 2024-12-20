package modules.module6;

class Level {
    private int width;
    private int height;

    public Level(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

class LevelLoader {
    public void load(Level level) throws LevelTooBigException {
        if (level.getHeight()*level.getWidth()>100000){
            throw new LevelTooBigException();
        }

        System.out.println("modules.module6.Level loaded");
    }
}
class LevelTooBigException extends Exception{

}







class LevelLoaderTest {
    public static void main(String[] args) {
        //modules.module6.Level loaded
        try {
            new LevelLoader().load(new Level(10, 20));
        } catch (LevelTooBigException ex) {
            System.out.println("modules.module6.Level too big");
        }

        //modules.module6.Level too big
        try {
            new LevelLoader().load(new Level(10000, 2000));
        } catch (LevelTooBigException ex) {
            System.out.println("modules.module6.Level too big");
        }
    }
}