package com;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] A={10,11,13,12,45,82,92,40,31,14};
        bubble(A);
        System.out.println(Arrays.toString(A));
    }

    public static void bubble(int[] a){
        int last = 0;
        for (int i = 0; i < a.length; i++) {
            last = a.length-i-1 ;
            swap(a, last);
        }
    }

    public static void swap(int[] a, int last){
        for (int i = 0; i <last; i++) {
            if(a[i]>a[i+1]){
                int temp = a[i+1];
                a[i+1] = a[i];
                a[i] = temp;
            }
        }
    }
}
