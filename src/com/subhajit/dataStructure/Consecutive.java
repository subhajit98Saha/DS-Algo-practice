package com.subhajit.dataStructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Consecutive {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int a[]= {2,0,2,4,1,3,7,1,5,4};
		findLargest(a);
	}

	private static void findLargest(int[] a) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> st=new HashMap<>();
		Map<Integer,Integer> res=new HashMap<>();
		int startIndex=0,endIndex=-1,max=0,min=Integer.MAX_VALUE;
		//int maxLength=0;
		for(int i=0;i<a.length;i++) {
			if(st.containsKey(a[i])) {
				if((endIndex-startIndex)==max-min) {
					res.put(startIndex, (endIndex-startIndex));
					startIndex=endIndex+1;
					max=a[startIndex];
					min=a[startIndex];
					}
				else {
					startIndex=st.get(a[i])+1;
					max=a[startIndex];
					min=a[startIndex];
				}
			}
			st.put(a[i], i);
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
			endIndex++;
		}
		Integer maxKey=0;
		int maxLength=0;
		Set<Integer> key=res.keySet();
		Iterator<Integer> it=key.iterator();
		while(it.hasNext()) {
			if(maxLength<res.get(it.next()).intValue()) {
			maxLength=res.get(it.next()).intValue();
			maxKey=it.next();
			}
		}
	print(maxKey.intValue(),res.get(maxKey).intValue(), a);
	}

	private static void print(int maxKey, int integer,int[] a) {
		// TODO Auto-generated method stub
		while(maxKey<(integer+maxKey)) {
			System.out.println(a[maxKey]);
			maxKey++;
		}
	}
}
