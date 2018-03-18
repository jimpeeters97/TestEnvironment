import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EfficiencyApplication {
    public static void main(String[] args) {
        int[] numbersArray = {1, 3, 5, 20, 21, 58, 113, 125, 130, 150, 151, 168, 170, 171, 179, 193, 200, 205, 209, 211, 236, 240, 315, 352, 379, 381, 397};
        List<Integer> numbersArrayList = new ArrayList<>(Arrays.asList(1, 3, 5, 20, 21, 58, 113, 125, 130, 150, 151, 168, 170, 171, 179, 193, 200, 205, 209, 211, 236, 240, 315, 352, 379, 381, 397));
        long start;
        long stop;
        int y;

        System.out.println("##Efficiency testing##\n\n");

        //<editor-fold desc="Array numbers - for-loop">
        System.out.println("Array of numbers - for loop");
        start = getCurrentTime();
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print(numbersArray[i] + ", ");
        }
        stop = getCurrentTime();
        System.out.println(getTimeElapsed(start, stop));
        //</editor-fold>

        //<editor-fold desc="Array numbers - for-each loop")
        System.out.println("Array of numbers - for-each loop");
        start = getCurrentTime();
        for (int i : numbersArray) {
            System.out.print(i + ", ");
        }
        stop = getCurrentTime();
        System.out.println(getTimeElapsed(start, stop));
        //</editor-fold>

        //<editor-fold desc="Array numbers - while loop">
        System.out.println("Array of numbers - while loop");
        start = getCurrentTime();
        y = 0;
        while(y < numbersArray.length) {
            System.out.print(numbersArray[y] + ", ");
            y++;
        }
        stop = getCurrentTime();
        System.out.println(getTimeElapsed(start, stop));
        //</editor-fold>

        //<editor-fold desc="Arraylist numbers - for loop">
        System.out.println("Arraylist of numbers - for loop");
        start = getCurrentTime();
        for(int i = 0; i < numbersArrayList.size(); i++) {
            System.out.print(numbersArrayList.get(i) + ", ");
        }
        stop = getCurrentTime();
        System.out.println(getTimeElapsed(start, stop));
        //</editor-fold>

        //<editor-fold desc="Arraylist numbers - for-each loop">
        System.out.println("Arraylist of numbers - for-each loop");
        start = getCurrentTime();
        for(int i : numbersArrayList) {
            System.out.print(i + ", ");
        }
        stop = getCurrentTime();
        System.out.println(getTimeElapsed(start, stop));
        //</editor-fold>

        //<editor-fold desc="Arraylist numbers - while loop">
        System.out.println("Arraylist of numbers - while loop");
        start = getCurrentTime();
        y = 0;
        while(y < numbersArrayList.size()) {
            System.out.print(numbersArrayList.get(y) + ", ");
            y++;
        }
        stop = getCurrentTime();
        System.out.println(getTimeElapsed(start, stop));
        //</editor-fold>

        //<editor-fold desc="Arraylist numbers - iterator">
        System.out.println("Arraylist of numbers - iterator");
        start = getCurrentTime();
        Iterator<Integer> it = numbersArrayList.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
        stop = getCurrentTime();
        System.out.println(getTimeElapsed(start, stop));
        //</editor-fold>
    }

    private static long getCurrentTime() {
        return System.nanoTime();
    }

    private static String getTimeElapsed(long start, long stop) {
        long elapsed = stop - start;
        return "\nTime elapsed: " + elapsed + " nanoseconds\n\n";
    }
}
