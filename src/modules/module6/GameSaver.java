package modules.module6;

class GameSaver {
static{
    System.out.println("modules.module6.GameSaver created!");
}

}

class GameSaverTest {
    public static void main(String[] args) {
        //modules.module6.GameSaver created!
        for(int i = 0; i < 10; i++) {
            new GameSaver();
        }
    }
}