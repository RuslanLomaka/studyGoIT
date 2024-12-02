class CircleIntersectorTest {
    public static void main(String[] args) {
        //intersects
        System.out.println(new CircleIntersector(0, 0, 2, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(5, 5, 2, 8, 8, 2));
    }
}

class CircleIntersector{
    boolean intersects;
    public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2)  {

        intersects = (r1+r2)>=(Math.sqrt ( (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2) ));

    }

    @Override
    public String toString(){
        if(intersects) return  "intersects";
        else return "not intersects";
}

}