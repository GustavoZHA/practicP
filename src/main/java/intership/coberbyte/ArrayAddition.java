package intership.coberbyte;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class ArrayAddition {
    /**
     * Have the function (arr) take the
     * array of numbers stored in arr and return the string
     * "true" if any combination of numbers in the array
     * (excluding the largest number) can be added up to
     * equal the largest number in the array, Otherwtse return
     * the string "false", For example: if arr contains 14. 6.23,
     * 10, 1.31 the output should return "true" because 4 6
     * 10 +3 : 23. The array will not be empty. will not
     * contain all the same elements. and may contain
     * negative numbers,
     */
    public void arrayAddition(int[] arr){


        int largest = Arrays.stream(arr).max().getAsInt();
        arr = ArrayUtils.removeElement(arr, largest);
        System.out.println(Arrays.toString(arr));
        System.out.println( isContains(arr,largest));
    }

    private boolean isContains(int[] arr, int target) {
        if ( arr.length == 0){
            return target==0;
        }

        int current = arr[0];
        int[] remaining = ArrayUtils.removeElement(arr, current);
        return isContains(remaining,target- current) ||isContains(remaining,target);
    }

}
