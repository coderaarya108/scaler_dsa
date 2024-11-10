package com.scaler.dsa.sorting.countsort;

import com.scaler.dsa.sorting.Sortable;
import com.scaler.dsa.sorting.SortingUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountSort implements Sortable {

    public static List<Integer> sort(List<Integer> listToSort){

        //Get max element in the list and make int array of that size + 1 length
        int max = listToSort.get(0);
        for(int num : listToSort){
            if(num > max){
                max = num;
            }
        }

        int[] freqArr = new int[max+1];

        for( int idx = 0 ; idx < listToSort.size() ; idx++){
            freqArr[listToSort.get(idx)]++;
        }

        List<Integer> sorterdList = new ArrayList<>();
        for( int idx = 0 ; idx < freqArr.length ; idx++){
            if( freqArr[idx] > 0){
                while( freqArr[idx] > 0){
                    sorterdList.add(idx);
                    freqArr[idx]--;
                }
            }
        }

        return sorterdList;

    }

    public static List<Integer> sortWithNegNumber(List<Integer> list , int minNum){

        int max = list.get(0);
        for(int num : list){
            if(num > max){
                max = num;
            }
        }
        max = max - minNum;

        int[] freqArr = new int[max+1];

        for( int idx = 0 ; idx < list.size() ; idx++){
            freqArr[list.get(idx) - minNum]++;
        }

        List<Integer> sorterdList = new ArrayList<>();
        for( int idx = 0 ; idx < freqArr.length ; idx++){
            if( freqArr[idx] > 0){
                while( freqArr[idx] > 0){
                    sorterdList.add(idx + minNum);
                    freqArr[idx]--;
                }
            }
        }

        return sorterdList;
    }
}
