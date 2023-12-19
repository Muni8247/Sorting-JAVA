package com.company.linear_serach;
import java.util.*;

public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("Enter the size of an array: ");
		n=sc.nextInt();
		System.out.println();
		
		int[] arr=new int[n];
		System.out.print("Enter the array inputs: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println();
		System.out.print("Your unsorted array is: "+Arrays.toString(arr));
		
		//Insertion sort Logic
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		System.out.println();
		System.out.print("Your unsorted array is: "+Arrays.toString(arr));

	}

}
