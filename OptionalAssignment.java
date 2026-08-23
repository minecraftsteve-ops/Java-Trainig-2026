public class OptionalAssignment {
    public static void main (String[] args) throws Exception {
        //trapezoid

        double base1 = 16;
        double base2 = 7;
        double height = 8;

        System.out.println("Area is: " + 0.5*(base1 + base2)*height);

        //1678

        int seconds = 1678;
        
        System.out.println(1678/60 + ":" + 1678%60);

        //intercepts

        double m = 8;
        double b = 9;

        System.out.println("y intercept is " + b + " and x intercept is " + -b/m);

        //zeros

        double a = 2;
        double B = 7;
        double c = 5;

        double d = 4*a*c;

        double disc = Math.sqrt(Math.pow(B,2)- d);

        double firstzero = -B + disc / 2*a;

        double secondzero = -B - disc / 2*a;

        System.out.println("First zero: " + firstzero + " Second zero: " + secondzero);

    }
}
