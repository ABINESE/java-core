package com.learning.core.day3;
import java.util.ArrayList;
public class D03P14 {
	public static int[] findUnion(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        
        while (i < arr1.length && j < arr2.length) {
            if (i > 0 && arr1[i] == arr1[i-1]) {
                i++;
                continue;
            }
            if (j > 0 && arr2[j] == arr2[j-1]) {
                j++;
                continue;
            }
            if (arr1[i] < arr2[j]) {
                list.add(arr1[i++]);
            } else if (arr1[i] > arr2[j]) {
                list.add(arr2[j++]);
            } else {
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        
        while (i < arr1.length) {
            if (i == 0 || arr1[i] != arr1[i-1]) {
                list.add(arr1[i]);
            }
            i++;
        }
        
        while (j < arr2.length) {
            if (j == 0 || arr2[j] != arr2[j-1]) {
                list.add(arr2[j]);
            }
            j++;
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    
    public static int[] findIntersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        
        while (i < arr1.length && j < arr2.length) {
            if (i > 0 && arr1[i] == arr1[i-1]) {
                i++;
                continue;
            }
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 2, 3};
        int[] arr2 = {2, 2, 3, 4};

        int[] union = findUnion(arr1, arr2);
        System.out.print("Union: ");
        for (int num : union) {
            System.out.print(num + " ");
        }

        System.out.println();

        int[] intersection = findIntersection(arr1, arr2);
        System.out.print("Intersection: ");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }
}
