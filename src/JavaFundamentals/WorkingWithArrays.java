package JavaFundamentals;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WorkingWithArrays {
    public void Print(){
        int[] test = new int[] {3,8,4,5,9};
        //to print a regular array
        System.out.println(Arrays.toString(test));

        int[][] test1 = new int[][] {{5,4,8,2,9}, {9,7,2,1,8}};
        //to print two or more dimmensional arrays
        System.out.println(Arrays.deepToString(test1));
    }
}
