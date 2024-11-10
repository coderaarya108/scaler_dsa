package com.scaler.dsa.sorting.heapsort;

import com.sun.management.GcInfo;

import java.util.*;

public class MedianInIntegerStream {

    private static Queue<Integer> priorityQMaxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    private static Queue<Integer> priorityQMinHeap = new PriorityQueue<>();

    private  static List<Integer> medianList = new ArrayList<>();
    public static List<Integer> getMedianFromStreamingIntegers(  int incomingNumber ){

        int middle;

        if( priorityQMaxHeap.isEmpty() && priorityQMinHeap.isEmpty()){
            priorityQMaxHeap.add(incomingNumber);
        } else {
            middle = (priorityQMaxHeap.size() + priorityQMinHeap.size()) / 2;
            try{
                if( incomingNumber > priorityQMaxHeap.peek()){
                    priorityQMinHeap.add(incomingNumber);
                } else {
                    priorityQMaxHeap.add(incomingNumber);
                }
            } catch (NullPointerException ex){
                System.out.println("NullPointer thrown. Handling gracefully . Exception text :  " + ex.getMessage());
            }

            if( priorityQMaxHeap.size() > (middle + 1) ){
                priorityQMinHeap.add(priorityQMaxHeap.poll());
            } else if( priorityQMinHeap.size() > middle ) {
                priorityQMaxHeap.add(priorityQMinHeap.poll());
            }

            medianList.add(priorityQMaxHeap.peek());
            return medianList;

        }

        medianList.add(incomingNumber);
        return medianList;
    }
}
