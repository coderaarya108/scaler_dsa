package com.scaler.dsa.sorting.heapsort;

import java.util.Scanner;

public class RunnerMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println(MedianInIntegerStream.getMedianFromStreamingIntegers(scanner.nextInt()));
        }
    }
}
