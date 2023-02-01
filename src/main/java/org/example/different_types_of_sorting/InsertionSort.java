package org.example.different_types_of_sorting;

public class InsertionSort {
    public static void realiseInartionSort(int arr[]){
        int count = 0;
        int n = arr.length;
        for(int i =1; i<n;i++){
            int keyItem = arr[i];
            int j = i - 1;
            while (j >=0 && arr[j] > keyItem){
                arr[j+1] = arr[j];
                j = j -1;
                count++;
            }
            arr[j+1] = keyItem;
        }
    }
}
