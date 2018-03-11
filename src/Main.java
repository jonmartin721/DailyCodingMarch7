import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

//        Given an array of integers, return a new array such that each element at index i of the new array is the
//        product of all the numbers in the original array except the one at i. Solve it without using division and in O(n) time.

//        For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input
//        was [3, 2, 1], the expected output would be [2, 3, 6].


        //defining the array to modify
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(i, rand.nextInt(((5-1)+ 1 ) + 1));
        }

        multiplyArray(list);

    }

    public static void multiplyArray(ArrayList<Integer> list) {

        ArrayList<Integer> newList = new ArrayList<>();

    }


}
