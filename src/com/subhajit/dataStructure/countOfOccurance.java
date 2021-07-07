package com.subhajit.dataStructure;

import java.util.Scanner;

public class countOfOccurance {

	public static void main(String[] args) {
		// count of occurance of an element in a sorted array using binarySearch for o(logn) complexity
		int ar[]= {1,3,3,3,4,4,5,5,5,5,5,7,7,9,9,9,9};
		System.out.println("Enter the number want to count");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		countOfOccurance ob=new countOfOccurance();
		int firstIndex=ob.binarySearch(ar,a,true);
		if(firstIndex==-1) {
			System.out.println("Count of "+a+" is 0");
		}
		else {
			int lastIndex=ob.binarySearch(ar, a, false);
			System.out.println("Count of "+a+" is "+(lastIndex-firstIndex+1));
		}
		sc.close();
	}
	public int binarySearch(int[] ar,int x,boolean flag) {
		int result=-1,low,high,mid;
		low=0;high=ar.length-1;
		while(low<=high) {
			mid=(low+high)/2;
			if(ar[mid]==x) {
				result=mid;
				if(flag) high=mid-1;
				else
					low=mid+1;
			}
			else if(x<ar[mid])
				high=mid-1;
			else
				low=mid+1;
		}
		return result;
	}
}
