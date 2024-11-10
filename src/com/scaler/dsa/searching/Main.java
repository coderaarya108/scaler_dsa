package com.scaler.dsa.searching;

import com.scaler.dsa.sorting.SortingUtils;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = SortingUtils.getInputList();
        //System.out.println("Enter number to search in list : ");
        //int numToSearch = new Scanner(System.in).nextInt();

        //Find given number index in given list
        //int index = BinarySearchDistinctElem.search(list , numToSearch);
        //System.out.println("Index of given number is : " + index);


        // Get Frequency of given number in list which can include duplicate elements
        //int freq = BinarySearchDupElem.findFrequencyOfNum(list , numToSearch);
        //System.out.println("Frequency of given number is : " + freq);

        List<String> strings = List.of("I", " am" , " a", " list" , " of" , " strings" );
        Stream<String> stream = strings.stream();
        //strings.forEach();
        System.out.println(PeakElement.getPeakElem(list));
    }
}
