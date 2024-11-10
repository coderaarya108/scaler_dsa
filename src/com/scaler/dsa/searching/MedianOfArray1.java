package com.scaler.dsa.searching;

import com.scaler.dsa.sorting.SortingUtils;

import java.util.List;

public class MedianOfArray1 {

    // This is TC : O( log(A[rangeOfElements])*( log N + log M) ) => ~~ log^2 approach

    public static int medianOfArray( List<Integer> list1  , List<Integer> list2 ){

        int list1Size = list1.size();
        int list2Size = list2.size();

        int leftVal = Math.min(list1.get(0) , list2.get(0));
        int rightVal = Math.max(list1.get(list1Size -1) , list2.get(list2Size-1));
        int midVal ;

        int left = 0;
        int right = list1Size + list2Size -1;
        int mid = (left + right) / 2;
        int medianElement = (left + right) / 2;

        int noOfElemLessThanMidVal_list1 = 0;
        int noOfElemLessThanMidVal_list2 = 0;

        while( leftVal <= rightVal){
            //System.out.println("leftVal : " + leftVal + "  rightVal : " + rightVal);
            midVal = (leftVal + rightVal) / 2;
            noOfElemLessThanMidVal_list1 = cntNumLessThanMid(list1 , midVal);
            noOfElemLessThanMidVal_list2 = cntNumLessThanMid(list2, midVal);
            //System.out.println(noOfElemLessThanMidVal_list1 + " ::: " + noOfElemLessThanMidVal_list2);

            int totalCntLessThanMidVal = noOfElemLessThanMidVal_list1 + noOfElemLessThanMidVal_list2;

            if( totalCntLessThanMidVal > mid){
                rightVal = midVal - 1;
            } else {
                medianElement = midVal;
                leftVal = midVal +1;
            }
        }

        return medianElement;
    }

    public static int cntNumLessThanMid( List<Integer> list , int num){

        int left = 0;
        int right = list.size() -1;
        int mid ;
        int ans = -1;

        while( left <= right){
            mid = (left + right) / 2;

            if( list.get(mid) < num){
                left = mid + 1;
            } else {
                ans = mid ;
                right = mid -1;
            }
        }

        return  ans;
    }

    public static void main(String[] args) {
        List<Integer> list1 = SortingUtils.getInputList();
        List<Integer> list2 = SortingUtils.getInputList();

        System.out.println(medianOfArray(list1, list2));
    }
}
