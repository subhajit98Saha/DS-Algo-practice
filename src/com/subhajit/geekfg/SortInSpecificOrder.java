package com.subhajit.geekfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class SortInSpecificOrder {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());
		for(int i=1;i<=test;i++) {
			int size=Integer.valueOf(br.readLine().trim());
			String[] sr=br.readLine().split(" ");
			ArrayList<Integer> even=new ArrayList<>();
			ArrayList<Integer> odd=new ArrayList<>();
			for(int j=0;j<size;j++) {
				if(Integer.parseInt(sr[j])%2==0) {
					even.add(Integer.parseInt(sr[j]));
				}
				else
					odd.add(Integer.parseInt(sr[j]));
			}
			Collections.sort(even);
			Collections.sort(odd);
			for(int k=odd.size()-1;k>=0;k--)
				System.out.print(odd.get(k)+" ");
			for(int k=0;k<even.size();k++)
				System.out.print(even.get(k)+" ");
			System.out.println();
		}
	}
}
