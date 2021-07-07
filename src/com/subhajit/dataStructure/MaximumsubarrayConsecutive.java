package com.subhajit.dataStructure;
import java.util.*;

public class MaximumsubarrayConsecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a =// {0,1,5,9,7,8,1,2,6,3,11};
				{2,1,2,0,4,3,5,1,7,0};
		maximumsubarrayConsecutive(a);
	}
	public static void maximumsubarrayConsecutive(int[] a){
		int k = 0;
		int maxvalue = 0;
		int minvalue = 0;
		int maxend=-1;
		int maxstart=-1;
		int length = -1;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if(a[i] > a[maxvalue])
				maxvalue=i;
			if(a[i] < a[minvalue])
				minvalue=i;
			if(map.containsKey(a[i])){
				if(map.get(a[i]) < k ){
					map.put(a[i],i);
					continue;
				}
				if((a[maxvalue]-a[minvalue]) == (i-1-k)){
					if(length < (i-k)){
						length = i-k;
						maxstart = k;
						maxend = i-1;
					}						
				}
				k = map.get(a[i]) +1;
				if(maxvalue < k)
					maxvalue = k;
				if(minvalue < k)
					minvalue = k;
			}
			map.put(a[i],i);
		}
 
 
		if((a[maxvalue] - a[minvalue]) == (a.length-1)){
			System.out.println(a.length);
			System.out.println(Arrays.toString(a));
		}else{
			System.out.println(length);
			System.out.print("{");
			for (int i = maxstart; i <= maxend; i++) {
				if(i==maxend)
					System.out.print(a[i]);
				else
					System.out.print(a[i]+",");
			}
			System.out.print("}");
			System.out.println();
		}
	}
}



