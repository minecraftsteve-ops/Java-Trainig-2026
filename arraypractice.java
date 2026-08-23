import java.util.ArrayList;
import java.util.List;

public class arraypractice {
    public static void main(String[] args) {

        //maxvalue
        int maxvalue = 0;
        int[] aray = {67,7,3};
        for (int i = 0; i < aray.length; i++) {
            if (aray[i] > maxvalue) {
                maxvalue = aray[i];
            }
            
        }

        System.out.println("The largest value is " + maxvalue);

        //avg

        List<Double> hello = new ArrayList<>();

        hello.add(6.2);
        hello.add(4.6);
        hello.add(3.8);

        double sum = 0;

        for (int g = 0; g < hello.size(); g++) {
            sum += hello.get(g);
        }

        double avg = sum / 3;

        System.out.println("The average is " + avg);



    }
}

