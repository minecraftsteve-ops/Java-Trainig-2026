public class quadratic {
    public static void main(String[] args) {
        double a = 3;
        double b = 2;
        double c = 4;

        double fourac = 4*a*c;

        double disc = b*b-fourac;
        
        //how many roots
        if (disc == 0) {
            System.out.println("One root exists");
        } else if (disc > 0) {
            System.out.println("Two roots exist");
        } else if (disc < 0) {
            System.out.println("No reat roots exist");
        }

        // determine how the parabola open
        if (a > 0) {
            System.out.println("The parabola opens up");
        } else if (a < 0) {
            System.out.println("The parabola opens down");
        }
    }
}
