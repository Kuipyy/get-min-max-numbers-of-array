import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    // show the list with the members
    public static void showList(ArrayList<Integer> list) {
        System.out.print("[ ");
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.print("]\n");
    }

    // get the min member of the array
    public static int getMin(ArrayList<Integer> list) {
        int min = list.getFirst();
        for (int i : list) {
            if (i < min) {
                min = i;
            } else {
                continue;
            }
        }
        return min;
    }

    // get the max member of the array
    public static int getMax(ArrayList<Integer> list) {
        int max = list.getFirst();
        for (int i : list) {
            if (i > max) {
                max = i;
            } else {
                continue;
            }
        }
        return max;
    }

    public static void printListDetails(ArrayList<Integer> list) {
        int minNumber = getMin(list);
        int maxNumber = getMax(list);

        System.out.println("List is: ");  showList(list);
        System.out.println("Minimum number of the array is: " + minNumber);
        System.out.println("Maximum number of the array is: " + maxNumber);
    }

    public static void main(String[] args) {

        // variables
        int number;
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        // create the list with prompt
        System.out.println("Enter the integer numbers to add the array:");
        System.out.println("Press -1 to exit");
        number = input.nextInt();
        while (number != -1) {
            list.add(number);
            number = input.nextInt();
        }

        printListDetails(list);


    }
}