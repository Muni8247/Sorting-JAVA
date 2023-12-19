package com.company.linear_serach;
import java.util.Arrays;
import java.util.Scanner;

public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("Enter the value of an array: ");
		n=sc.nextInt();
		int[] arr=new int[n];
		
		System.out.println();
		
		System.out.print("Enter the input array: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		//output
		
		System.out.print("Your array is: "+Arrays.toString(arr));
		System.out.println();
		
		//Logic selection sort
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
				
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		System.out.print("After sorting the array is: "+Arrays.toString(arr));
		
		
		
		

	}

}
