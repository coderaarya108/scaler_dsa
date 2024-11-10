package com.scaler.dsa.sorting.insertionsort;

import com.scaler.dsa.sorting.Sortable;

import java.util.List;

public class InsertionSort implements Sortable {

    public static List<Integer> sort(List<Integer> listToSort){

        int size = listToSort.size();
        for(int ptrIdx = 1 ; ptrIdx < size ;ptrIdx++){

            int innerLoopPtr = ptrIdx;
            while( innerLoopPtr > 0 && listToSort.get(innerLoopPtr-1) > listToSort.get(innerLoopPtr) ){
                swap(listToSort, innerLoopPtr -1 , innerLoopPtr);
                innerLoopPtr--;
            }
        }

        return listToSort;
    }

    public static void swap(List<Integer> list , int idx1 , int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
}
