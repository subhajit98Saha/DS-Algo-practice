package com.subhajit.dataStructure;

import java.util.HashMap;
import java.util.Map;

public class findPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {8,2,7,5,3,1};
		int sum=10;
		Map<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<ar.length;i++) {
			if(map.containsKey(sum-ar[i])) {
				print(map.get(sum-ar[i]),ar[i]);
			}
			map.put(ar[i], ar[i]);
		}
	}

	private static void print(Integer integer, int i) {
		// TODO Auto-generated method stub
		System.out.println("Pair found pair is=("+integer+"+"+i+")");
	}

}
