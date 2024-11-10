package com.scaler.dsa.sorting.selectionsort;

import com.scaler.dsa.sorting.Sortable;
import com.scaler.dsa.sorting.SortingUtils;

import java.util.List;

public class SelectionSort implements Sortable {

    public static List<Integer> sort( List<Integer> listToSort){
        int size = listToSort.size();
        for( int idx1 = 0 ; idx1 < size ; idx1++){
            int idxToSwap = getIdxOfMinNumInList(listToSort , idx1);
            SortingUtils.swap(listToSort , idx1 , idxToSwap);
        }

        return listToSort;
    }

    private static int getIdxOfMinNumInList( List<Integer> listToSort, int startIdx){
        int minElement = listToSort.get(startIdx);
        int minElementIdx = startIdx;
        int size = listToSort.size();
        for (int idx = startIdx + 1 ; idx < size ; idx++) {
            if( minElement > listToSort.get(idx)){
                minElement = listToSort.get(idx);
                minElementIdx = idx;
            }
        }

        return minElementIdx;
    }
}
