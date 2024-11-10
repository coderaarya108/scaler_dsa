package com.scaler.dsa.sorting.quicksort;

import com.scaler.dsa.sorting.Sortable;
import com.scaler.dsa.sorting.SortingUtils;

import java.util.List;

public class QuickSort implements Sortable {

    public static List<Integer> sort(List<Integer> listToSort){

        quickSort(listToSort , 0 , listToSort.size() -1);
        return listToSort;
    }

    public static void quickSort(List<Integer> list , int start , int end){
        if( start >= end){
            return;
        }

        int ptr = partition(list , start , end);

        quickSort(list , start , ptr -1);
        quickSort(list , ptr + 1 , end);
    }

    public static int partition(List<Integer> list , int start , int end){

        int pivot = list.get(end);
        int ptr = start;

        for( int idx = start ; idx < end ; idx++){
            if( list.get(idx) < pivot){
                SortingUtils.swap(list , idx , ptr);
                ptr++;
            }
        }

        SortingUtils.swap(list , end , ptr);

        return ptr;
    }
}
