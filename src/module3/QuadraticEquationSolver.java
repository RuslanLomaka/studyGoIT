package module3;

import java.util.Arrays;

public class QuadraticEquationSolver {
    public double[] solve(int a, int b, int c){
    double D = b*b-4*a*c;
    double x1 = (((double)-b)+Math.sqrt(D))/(2*a);
    double x2 = (((double)-b)-Math.sqrt(D))/(2*a);

    if (x1==x2)return new double[]{x1};
    if (Double.isNaN(x1)&&Double.isNaN(x2))return new double[0];
    return new double[]{x1,x2};
    }

    public static void main(String[] args) {
        QuadraticEquationSolver QuadraticEquationSolver = new QuadraticEquationSolver();

        System.out.println(Arrays.toString(QuadraticEquationSolver.solve(1, -2, -3)));
        System.out.println(Arrays.toString(QuadraticEquationSolver.solve(1, 12, 36)));
        System.out.println(Arrays.toString(QuadraticEquationSolver.solve(5, 3, 7)));
    }
}
