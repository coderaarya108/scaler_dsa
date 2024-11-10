package com.scaler.dsa.searching;

import java.util.List;

public class PeakElement {

    public static int getPeakElem(List<Integer> list){

        int left = 0;
        int right = list.size() -1;
        int mid;
        while( left <= right){
            mid = left + ((right - left) / 2);

            if( (mid -1 ) >= 0 && (mid + 1) < list.size() ){
                if( list.get(mid) > list.get(mid -1) && list.get(mid) > list.get(mid +1)){
                    return mid;
                } else if( list.get(mid-1) < list.get(mid) && list.get(mid) < list.get(mid+1)){
                    left = mid + 1;
                } else {
                    right = mid -1;
                }

            } else {
                return mid;
            }

           //System.out.println("left:  " + left + "  mid : " + mid + "  right : " + right);
        }
        return -1;
    }
}
