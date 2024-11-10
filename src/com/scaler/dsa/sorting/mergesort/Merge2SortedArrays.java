package com.scaler.dsa.sorting.mergesort;

import java.util.ArrayList;
import java.util.List;

public class Merge2SortedArrays {

    public static List<Integer> sortedListOfArrays(List<Integer> list1 , List<Integer> list2){
        int list1_size = list1.size();
        int list2_size = list2.size();

        List<Integer> sortedList = new ArrayList<>();
        int lst1Ptr = 0;
        int lst2Ptr = 0;

        while( lst1Ptr < list1_size && lst2Ptr < list2_size ){

            if( list1.get(lst1Ptr) > list2.get(lst2Ptr) ){
                sortedList.add(list2.get(lst2Ptr));
                lst2Ptr++;
            } else {
                sortedList.add(list1.get(lst1Ptr));
                lst1Ptr++;
            }

        }

        while( lst1Ptr < list1_size){
            sortedList.add(list1.get(lst1Ptr));
            lst1Ptr++;
        }

        while( lst2Ptr < list2_size){
            sortedList.add(list2.get(lst2Ptr));
            lst2Ptr++;
        }

        return sortedList;
    }
}
