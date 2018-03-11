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

        for (int i = 0; i < 4; i++) {
            list.add(i, rand.nextInt(((5 - 1) + 1) + 1));
        }


        ArrayList<Integer> newList = multiplyArray(list);

        System.out.println("Old list: ");
        for (Integer aList : list) {
            System.out.print(aList + " ");
        }
        System.out.println("\n\nNew list: ");
        for (Integer aNewList : newList) {
            System.out.print(aNewList + " ");
        }

    }

    private static ArrayList<Integer> multiplyArray(ArrayList<Integer> list) {

        //create a new list
        ArrayList<Integer> newList = new ArrayList<>();


        //for each element in the original list
        for (int i = 0; i < list.size(); i++) {

            int multipliedValue = 0;
            boolean notInitialized = true;

            //look at all the other elements of the original list (other than the current one)
            for (int j = 0; j < list.size(); j++) {


                if (j != i) {

                    //if this is the first element after multipliedValue was created
                    if (notInitialized) {

                        multipliedValue = list.get(j);
                        notInitialized = false;
                        continue; //and go to the next loop

                    }

                    multipliedValue *= list.get(j);

                }


            }

            //after all other positions have been multiplied into multipliedValue
            newList.add(i, multipliedValue);

        }

        return newList;

    }


}
