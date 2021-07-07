package com.subhajit.dataStructure;

import java.util.HashMap;
import java.util.Map;
//print all the sub array with given sum zero using Hash map for better time complexity
public class PrintSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {3,4,-7,3,1,3,1,-4,-2,-2};
		findZeroSum(ar);
	}

	private static void findZeroSum(int[] ar) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> mp=new HashMap<>();
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum+=ar[i];
			if(sum==0) {
				print(ar,0,i);
			}
			if(mp.get(sum)!=null) {
				print(ar,mp.get(sum)+1,i);
			}
			mp.put(sum, i);
		}
	}

	private static void print(int[] ar, int i, int j) {
		// TODO Auto-generated method stub
		System.out.print("Subarray->");
		while(i<=j) {
			System.out.print(ar[i]+" ");
			i++;
		}
		System.out.println();
	}

}
