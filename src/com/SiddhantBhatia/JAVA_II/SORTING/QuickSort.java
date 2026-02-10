package com.SiddhantBhatia.JAVA_II.SORTING;

import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int[]arr , int low , int high){
        if(low<high){
            int p = partition(arr , low , high);
            quickSort(arr , low , p-1);
            quickSort(arr , p+1 , high);
        }
    }
    public static int partition(int[] arr , int low , int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j = low ; j < high ; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr , 0 ,n-1);
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
