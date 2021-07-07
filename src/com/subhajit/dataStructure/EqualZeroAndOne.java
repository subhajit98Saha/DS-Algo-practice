package com.subhajit.dataStructure;

import java.util.HashMap;
import java.util.Map;

public class EqualZeroAndOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= //{0,0,1,0,1,0,0};
				{0,1,1,0,1,0,0,1,1,1,1,0,0,0,1,1,0,1,1,0};
		maximumSubarray(a);
	}

	private static void maximumSubarray(int[] a) {
		// TODO Auto-generated method stub
		int sum=0,endindex=0;
		int startindex=0;
		Map<Integer,Integer> mp=new HashMap<>();
		mp.put(0, -1);//To handle the case when sub array having maximum length start from index 0
		for(int i=0;i<a.length;i++) {
			sum +=(a[i]==0)?-1:1;
			if(mp.containsKey(sum)) {
				int l=mp.get(sum)+1;
				int r=i;
				if(r-l>endindex-startindex) {
					startindex=l;
					endindex=r;
				}
			}
			else {
				mp.put(sum, i);
			}
		}
		System.out.println("Maximum subarray-{ "+startindex+"...."+endindex+"}");
		for(int i=startindex;i<=endindex;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
