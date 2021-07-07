package com.subhajit.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AllSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		int[] ar=new int[5];
		for(int i=0;i<5;++i) {
			ar[i]=sc.nextInt();
					//Integer.parseInt(br.readLine().trim());
		}
		int[] arr=Arrays.copyOfRange(ar, 1, 3);
		for(int n:arr)
			System.out.print(n+" ");
		List<List<Integer>> result=new ArrayList<>();
		result.add(new ArrayList<>());
		for(int i=0;i<5;i++) {
			int size=result.size();
			for(int j=0;j<size;j++) {
				List<Integer> subset=new ArrayList<>(result.get(j));
				subset.add(ar[i]);
				Collections.sort(subset);
				int max=2;
				if(subset.size()==2)
					result.add(subset);
			}
		}
		System.out.println(result);
		System.out.println(result.size());
		sc.close();
	}
}
