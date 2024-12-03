class LevelTest {
    public static void main(String[] args) {
        Level.Point p1 = new Level.Point(3, 5);
        Level.Point p2 = new Level.Point(10, 100);
        Level.Point p3 = new Level.Point(50, 40);
        Level.Point[] points = {p1, p2, p3};
        Level.LevelInfo info = new Level.LevelInfo("Quarke Intro", "Easy");

        //3015
        System.out.println(new Level(info, points).calculateLevelHash());
    }
}

class Level {
    private LevelInfo levelInfo;
    private Point[] points;

    public Level(LevelInfo levelInfo, Point[] points) {
        this.levelInfo = levelInfo;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Quarke level, name is " + this.levelInfo.getName() + ", difficulty is " + this.levelInfo.getDifficulty() + ", point count is " + points.length;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        for (Point point : points) {
            int modifier = point.x * point.y;
            hash += modifier;
        }
        return hash;
    }

    int calculateLevelHash() {
        return hashCode();
    }

    static class LevelInfo {
        private String name;
        private String difficulty;

        public LevelInfo(String name, String difiiculy) {
            this.difficulty = difiiculy;
            this.name = name;

        }

        public String getName() {

            return name;
        }

        public String getDifficulty() {
            return difficulty;
        }
    }

    static class Point {
        private int x;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        private int y;

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }


    }
}