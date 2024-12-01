package module5;

import java.util.Objects;
class  StarTrackTest{

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(1);
        p1.setY(1);
        p1.setZ(1);

        Point p2 = new Point();
        p2.setX(1);
        p2.setY(1);
        p2.setZ(1);

        Point p3 = new Point();
        p3.setX(2);
        p3.setY(2);
        p3.setZ(3);

        StarTrack track1 = new StarTrack();
        track1.setStart(p1);
        track1.setFinish(p2);

        StarTrack track2 = new StarTrack();
        track2.setStart(p1);
        track2.setFinish(p2);

        StarTrack track3 = new StarTrack();
        track3.setStart(p1);
        track3.setFinish(p3);

        System.out.println(track1.equals(track2)); //Should be true
        System.out.println(track1.equals(track3)); //Should be false
        System.out.println(track1.hashCode() == track2.hashCode()); //Should be true
    }
}

class Point{
    private int x;
    private int y;
    private int z;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getZ() {
        return z;
    }
    public void setZ(int z) {
        this.z = z;
    }

    @Override
   public boolean  equals(Object Obj){
        if (this == Obj) return true; // Check if they are the same object
        if (Obj == null || getClass() != Obj.getClass()) return false; // Check class and null
        Point p = (Point) Obj;
        return this.x==p.x && this.y==p.y && this.z==p.z;
    }

    @Override
    public int hashCode(){
         return Objects.hash(x,y,z);
    }
}

class StarTrack{
    private Point start;
    private Point finish;


    public Point getStart() {
        return start;
    }
    public void setStart(Point start) {
        this.start = start;
    }
    public Point getFinish() {
        return finish;
    }
    public void setFinish(Point finish) {
        this.finish = finish;
    }

    @Override
    public boolean equals(Object Obj){
        if (Obj==this) return true;
        if (Obj == null || !(Obj.getClass()==this.getClass())) return false;
        StarTrack track = (StarTrack) Obj;
        return start.equals(track.start) && finish.equals(track.finish);
    }

    @Override
    public int hashCode(){
        return  Objects.hashCode(start.hashCode()*finish.hashCode());
    }
}