package com.company.linear_serach;
import java.util.Arrays;
import java.util.Scanner;

public class Bubble_sort {
	public static void main(String args[]) {
		int arr[]= {4,3,1,5,10,2};
		System.out.print("Array is: "+Arrays.toString(arr));
		System.out.println();
		
		//Bubble sort logic
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.print("After sorted: "+Arrays.toString(arr));
	}

	

}

