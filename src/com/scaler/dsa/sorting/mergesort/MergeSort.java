package com.scaler.dsa.sorting.mergesort;

import com.scaler.dsa.sorting.Sortable;

import java.util.List;

public class MergeSort implements Sortable {

    public static List<Integer> sort(List<Integer> listToSort , int startIdx , int endIdx){

        if(startIdx == endIdx){
            return listToSort;
        }

        int mid = (startIdx + endIdx)/2;

        sort(listToSort , startIdx , mid);
        sort(listToSort, mid+1 , endIdx);


        return Sort2ContinousSubArrays.sortPartOfArray(listToSort , startIdx , mid , endIdx);
    }
}
