package com.scaler.dsa.sorting.mergesort;

import java.util.ArrayList;
import java.util.List;

public class Sort2ContinousSubArrays {

    public static List<Integer> sortPartOfArray(List<Integer> listToSort , int leftIdx , int midIdx, int rightIdx){

        System.out.println("Initial list received : " + listToSort);
        List<Integer> tempList = new ArrayList<>();

        int ptr1 = leftIdx;
        int ptr2 = midIdx+1;


        while( ptr1 <= midIdx && ptr2 <= rightIdx){
            if(listToSort.get(ptr1) < listToSort.get(ptr2)){
                tempList.add(listToSort.get(ptr1));
                ptr1++;
            } else {
                tempList.add(listToSort.get(ptr2));
                ptr2++;
            }
        }

        while(ptr1 <= midIdx ){
            tempList.add(listToSort.get(ptr1));
            ptr1++;
        }

        while(ptr2 <= rightIdx){
            tempList.add(listToSort.get(ptr2));
            ptr2++;
        }

        System.out.println(tempList);
        int tempIdx=0;
        for (int idx = leftIdx; idx <= rightIdx ; idx++) {
            listToSort.set(idx, tempList.get(tempIdx++));
        }

        return listToSort;

    }
}
