public class ArlanHelper {

    public String drawQuad(int n){

       /*
        StringBuilder starQuad = new StringBuilder();
        int i=0;
        while(i<n){
            int j=0;
            while (j<n){
                starQuad.append("*");
                j++;
                if(j==n){
                    starQuad.append("\n");
                }
            }
            i++;
        }


        return starQuad.toString();

        */
        return this.drawRect(n,n,'*');

    }

    public String drawRect(int width, int height, char x) {
        StringBuilder starQuad = new StringBuilder();
        int i=0;
        while(i<height){
            int j=0;
            while (j<width){
                starQuad.append(x);
                j++;
                if(j==width){
                    starQuad.append("\n");
                }
            }
            i++;
        }
        return starQuad.toString();
    }

    String drawLine(int length){
        StringBuilder line = new StringBuilder();
        int i=0;
        boolean next = false;
        while(i<length){
            if (next) line.append('#');
            if(!next)line.append('*');
            next = !next;
            i++;
        }
        return line.toString();
    }

    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        System.out.println(helper.drawQuad(4));
        System.out.println(helper.drawRect(6, 7, 's'));
        System.out.println(helper.drawLine(5));


    }

}