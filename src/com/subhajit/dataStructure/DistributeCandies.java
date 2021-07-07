package com.subhajit.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine().trim());
		for(int i=1;i<=test;i++) {
			int size=Integer.parseInt(br.readLine().trim());
			String[] sr=br.readLine().split(" ");
			Set<String> st=new HashSet<String>();
			int count=0;
			for(int j=0;j<size;j++) {
				if(st.contains(sr[j])) {
					continue;
				}
				else {
					st.add(sr[j]);
					count++;
				}
			}
			int s=size/2;
			if(count>s)
				System.out.println(s);
			else
				System.out.println(count);
		}
	}
}
