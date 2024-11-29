public class TriangleDrawer {

    public String drawTriangle(int side){

        StringBuilder triangle = new StringBuilder();
        int i=0;

        while(i<side){
            triangle.append("*".repeat(side - i)).append("\n");
            i++;
        }
        return triangle.toString();
    }


    public static void main(String[] args) {
        TriangleDrawer triangleDrawer = new TriangleDrawer();
        System.out.println(triangleDrawer.drawTriangle(5));
    }
}