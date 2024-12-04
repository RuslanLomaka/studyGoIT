package modules.module6;

class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}

class RectangleArea{
    int xa;
    int ya;
    int xb;
    int yb;

    public int getArea(){
        return Integer.signum((xb-xa)*(yb-ya))*(xb-xa)*(yb-ya);
    }

    public RectangleArea(int[] coords){
        xa = coords[0];
        ya = coords[1];
        xb = coords[2];
        yb = coords[3];
    }
}