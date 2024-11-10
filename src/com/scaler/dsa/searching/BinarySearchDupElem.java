package com.scaler.dsa.searching;

import com.scaler.dsa.sorting.SortingUtils;

import java.util.List;
import java.util.Scanner;

public class BinarySearchDupElem {

    public static int findFrequencyOfNum(List<Integer> list, int noToSearch){

        int leftIdx = 0;
        int rightIdx = list.size() -1;
        int mid = -1; // Initialization

        //Get leftMost index where number is present
        int leftEleIdx = -1;
        while( leftIdx <= rightIdx){

            // Reason we are deriving mid this way is , if integer input
            // is in 10^9 range , then left + right might get out of integer range
            mid = leftIdx + ( (rightIdx - leftIdx) / 2);
            int num = list.get(mid);
            if( num == noToSearch){
                leftEleIdx = mid;
                rightIdx = mid -1;
            } else if( num > noToSearch){
                rightIdx = mid -1;
            } else {
                leftIdx = mid + 1;
            }
        }

        //Get rightMost index where number is present
         leftIdx = 0;
         rightIdx = list.size() -1;
        int rightEleIdx = rightIdx;
        while( leftIdx <= rightIdx){

            // Reason we are deriving mid this way is , if integer input
            // is in 10^9 range , then left + right might get out of integer range
            mid = leftIdx + ( (rightIdx - leftIdx) / 2);
            int num = list.get(mid);
            if( num == noToSearch){
                rightEleIdx = mid;
                leftIdx = mid +1;
            } else if( num > noToSearch){
                rightIdx = mid -1;
            } else {
                leftIdx = mid + 1;
            }
        }


        return rightEleIdx - leftEleIdx + 1;
    }

    public static void main(String[] args) {
        List<Integer> list = SortingUtils.getInputList();
        System.out.println("Enter number you need to get frequency for in list : ");
        int targetNum = new Scanner(System.in).nextInt();

        int freq = findFrequencyOfNum(list , targetNum);
        System.out.println("Frequency of num is : " + freq);
    }
}
