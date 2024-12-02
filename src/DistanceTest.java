class DistanceTest {
    public static void main(String[] args) {
        //Expect 14
        System.out.println(new Distance(10, 10, 20, 20).getDistance());

        //Expect 23
        System.out.println(new Distance(10, 10, 27, 25).getDistance());
    }
}

class Distance{
    private final int startX;
    private final int startY;
    private final int endX;
    private final int endY;

    Distance(int startX, int startY, int endX, int endY){
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public int getDistance(){
        int distance =(int) Math.round(Math.sqrt((endX-startX)*(endX-startX)+(endY-startY)*(endY-startY)))  ;
        return distance;
    }
}