package com.scaler.dsa.sorting.countsort;

import com.scaler.dsa.sorting.Sortable;
import com.scaler.dsa.sorting.SortingUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountSortNegativeNums implements Sortable {

    public static List<Integer> sort(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("List can contain -ve number ? (Y/N) : ");
        String response = scanner.nextLine();
        List<Integer> listToSort = new ArrayList<>();
        int minNum = 0;
        int maxNum = 0;
        if( response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("yes")){
            System.out.println("Please specify smallest -ve number possible : ");
             minNum = scanner.nextInt();
             while(minNum >= 0){
                 System.out.println("Min num should be negative number.");
                 System.out.println("Please try again");
                 minNum = scanner.nextInt();
             }
             listToSort = SortingUtils.getInputList();

             return sortWithNegNumber(listToSort , minNum);
        }

        listToSort = SortingUtils.getInputList();
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
