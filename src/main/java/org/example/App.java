package org.example;

import java.util.Arrays;

import static org.example.different_types_of_sorting.InsertionSort.realiseInartionSort;

/**
 * Hello world!
 *
 */
public class App 
{
    static void showArray(int[] arr){
        System.out.println(Arrays.toString(arr) + "\n");
    }
    public static void main( String[] args )
    {
    int[] arr = {124,235,456,123,756,476,285,998,379,108};
    realiseInartionSort(arr);
    showArray(arr);


    }
}
