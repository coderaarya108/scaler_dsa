package com.scaler.dsa.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortingUtils {

    public static void swap(List<Integer> listToSort , int idx1 , int idx2){
        int temp = listToSort.get(idx2);
        listToSort.set(idx2, listToSort.get(idx1));
        listToSort.set(idx1, temp);
    }

    public static List<Integer> getInputList(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of list to sort : ");
        int listSize =  sc.nextInt();

        System.out.println("Please enter list elements : ");
        List<Integer> listToSort = new ArrayList<>();
        for( int idx = 0  ; idx < listSize ; idx++ ){
            listToSort.add( sc.nextInt());
        }

        return listToSort;
    }
}
