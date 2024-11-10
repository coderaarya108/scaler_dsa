package com.scaler.dsa.sorting.bubblesort;

import com.scaler.dsa.sorting.Sortable;
import com.scaler.dsa.sorting.SortingUtils;

import java.util.List;

public class BubbleSort implements Sortable {

    public static List<Integer> sort(List<Integer> listToSort){

        int size = listToSort.size();
        int endIdx = 0;

        for (int idx = 0; idx < size; idx++) {
            BubbleSort.bubbleMinToFirst(listToSort, endIdx);
            endIdx++;
        }

        return listToSort;
    }

    public static void bubbleMinToFirst( List<Integer> listToSort , int endIdx ){
        int size = listToSort.size();
        int startIdx = size -2;
        int minElement = listToSort.get(size-1);
        int minElementIdx = size -1;

        for (int idx = startIdx; idx >= endIdx ; idx--) {
            if ( listToSort.get(idx) > minElement) {
                SortingUtils.swap(listToSort, minElementIdx, idx);
                minElementIdx = idx;
            } else {
                minElement = listToSort.get(idx);
                minElementIdx = idx;
            }
        }
    }

}
