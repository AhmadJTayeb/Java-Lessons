import java.util.ArrayList;

/**
 * for-each loop
 * By: Ahmad Tayeb
 * https://youtu.be/q_f38PKKcFA
 */

public class ForEachLoopExamples {

    public static void main(String[] args) {

        /*******************************************************
         *
         * 1-d array
         *
         *******************************************************/

        int arr[] = { 1, 2, 3, 4, 5 };

        System.out.println("[one-d array] for loop: ");
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            System.out.printf("%5d", x);
        }
        System.out.println();

        System.out.println("[one-d array] for-each loop: ");
        for (int x: arr) {
            System.out.printf("%5d", x);
        }
        System.out.println();

        /*******************************************************
         *
         * 2-d array
         *
         *******************************************************/

        int arr2[][] = {
                { 1, 2,  3,  4  },
                { 5, 6,  7,  8  },
                { 9, 10, 11, 12 }
        };

        System.out.println("[2-d array] for loop: ");
        for (int i = 0; i < arr2.length; i++) {
            int row[] = arr2[i];
            for (int j = 0; j < row.length; j++) {
                int value = arr2[i][j];
                System.out.printf("%5d", value );
            }
            System.out.println();
        }

        System.out.println("[2-d array] for-each loop: ");
        for (int[] row: arr2) {
            for (int value: row) {
                System.out.printf("%5d", value );
            }
            System.out.println();
        }

        /*******************************************************
         *
         * Collection: ArrayList
         *
         *******************************************************/

        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);

        System.out.println("[Collection: ArrayList] for loop: ");
        for (int i = 0; i < arrList.size(); i++) {
            int x = arrList.get(i);
            System.out.println(x);
        }

        System.out.println("[Collection: ArrayList] for-each loop: ");
        for (int x : arrList) {
            System.out.println(x);
        }
    }

}
