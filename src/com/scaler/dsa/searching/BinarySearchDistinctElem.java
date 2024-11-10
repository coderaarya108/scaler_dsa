package com.scaler.dsa.searching;

import java.util.List;

public class BinarySearchDistinctElem {

    public static int search(List<Integer> list, int noToSearch){

        int leftIdx = 0;
        int rigthIdx = list.size() -1;
        int mid = -1; // Initialization

        while( leftIdx <= rigthIdx){

            // Reason we are deriving mid this way is , if integer input
            // is in 10^9 range , then left + right might get out of integer range
            mid = leftIdx + ( (rigthIdx - leftIdx) / 2);
            int num = list.get(mid);
            if( num == noToSearch){
                return  mid;
            } else if( num > noToSearch){
                rigthIdx = mid -1;
            } else {
                leftIdx = mid + 1;
            }
        }

        return -1;
    }
}
