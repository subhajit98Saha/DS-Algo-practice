package com.subhajit.dataStructure;

import java.util.*;
import java.io.*;
//Sliding window approach to find the maximum length of sub array having given sum
public class MaximumSubarryGivenSum {
//	public static void findSubarray(int[] a,int given) {
//		int StartWindow=0,EndWindow=0;
//		int sum=0;
//		Map<Integer,Integer> mp=new HashMap<>();
//		for(int i=0;i<a.length;i++) {
//			sum +=a[i];
//			if(sum<given) {
//				EndWindow=i;
//			}
//			if(sum>given) {
//				EndWindow=i;
//				sum -=a[StartWindow];
//				StartWindow+=1;
//			}
//			if(sum==given) {
//				EndWindow=i;
//				mp.put(StartWindow, (EndWindow-StartWindow));
//			}
//		}
//		int maxLength=0;
//		int maxKey=0;
//		//Map.Entry<Integer, Integer> entryS;
//		for(Map.Entry<Integer, Integer> entry:mp.entrySet()) {
//			if(maxLength<entry.getValue()) {
//				maxLength=entry.getValue();
//				maxKey=entry.getKey();
//			}
//		}
//		maxLength=maxLength+maxKey;
//		System.out.println("Maximum length of Subarray = { "+maxKey+"..."+maxLength+"}");
//		System.out.print("Subarray->");
//		while(maxKey<=maxLength) {
//			System.out.print(a[maxKey]+" ");
//			maxKey++;
//		}
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] ar= {1,2,3,4,5,6,7,8,9,10};
//	//{5,6,3,4,-2,1,-2,4,7-5,5,3,5};
//		findSubarray(ar,12);
//		
//	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		for(int i=1;i<=test;i++) {
			int size=sc.nextInt();
			int sumation=sc.nextInt();
			int[] arr=new int[size];
			for(int j=0;j<size;j++) {
				arr[j]=sc.nextInt();
			}
			int count=0,startWindow=0,endWindow=0,sum=0, max=0,start=0,end=0;
			for(int j=0;j<size;j++) {
				sum+=arr[j];
				if(arr[j]==0)
					count+=1;
				if(sum<sumation&&sum!=0) {
					count+=1;
					endWindow=j;
				}
				if(sum>sumation) {
					endWindow=j;
					while(sum>sumation) {
					sum-=arr[startWindow];
					startWindow+=1;
					count-=1;
					}
					count+=1;
				}
				if(sum==sumation) {
					endWindow=j;
					if(max<count) {
						max=count;
						start=startWindow+1;
						end=endWindow+1;
					}
				}
			}
			if(max==0)
				System.out.print(-1);
			else
				System.out.print(start+" "+end);
			System.out.println();
		}
		sc.close();
	}
}
