package com.shiyang.arithmetic;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr={6,3,8,2,9,1};
        bubbleSort(arr);

        for (int i: arr) {
            System.out.println(i);
        }
    }

    private static void bubbleSort(int [] arr){
        if(arr == null || arr.length<1){
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
