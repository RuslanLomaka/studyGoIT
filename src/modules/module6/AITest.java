package modules.module6;

class AITest {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++) {
            new AI();
        }
    }
}

class AI{
    static{
        System.out.println("modules.module6.AI loaded!");
    }
    {
        System.out.println("New modules.module6.AI created!");
    }
}