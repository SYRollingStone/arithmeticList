package com.shiyang.arithmetic;

import java.util.Arrays;
import java.util.List;

/**
 * InsertionSort 直接插入排序 温世洋
 * */
public class InsertionSort {

    public static void main(String[] args) {
        List<Integer> valueList = Arrays.asList(3,5,7,1,2,4,9,6,8);

        List<Integer> sortResultList = InsertionSort.sort(valueList);

        for (Integer value : sortResultList) {
            System.out.println(value);
        }
    }

    public static List<Integer> sort(List<Integer> valueList){
        if(valueList == null || valueList.size() == 0){
            return null;
        }

        Integer [] valueArray = (Integer[]) valueList.toArray();

        for (int i = 1; i < valueArray.length; i++) {
            Integer temp = valueArray[i];
            for (int j = 0; j < i; j++) {
                if(valueArray[i] < valueArray[j]){
                    // temp小于有序数组中的元素，有序数组后移一个位置，然后插入。
                    // 老的有序数组是从下标0~i-1 ,temp比valueArray[j]小，将下标为j~i-1的所有数字挨个向后移动一个位置。然后在j位置插入temp。
                    for (int k = i; k > j; k--) {
                        valueArray[k] = valueArray[k-1];
                    }

                    valueArray[j] = temp;
                }
            }
        }

        return Arrays.asList(valueArray);
    }

}
