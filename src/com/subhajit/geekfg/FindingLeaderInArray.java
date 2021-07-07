package com.subhajit.geekfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class FindingLeaderInArray {

	public static void main(String[] args) throws  IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());
		for(int i=1;i<=test;i++) {
			long size=Integer.parseInt(br.readLine());
			String[] str=br.readLine().split(" ");
			printLeader(str,size);
		}
	}

	private static void printLeader(String[] str, long size) {
		StringBuffer sb=new StringBuffer();
		ArrayList<Integer> res=new ArrayList<>();
		long i=0;
		int max=Integer.MIN_VALUE;
		for( i=size-1;i>=0;i--) {
			if(Integer.valueOf(str[(int)i])>=max) {
				max=Integer.valueOf(str[(int)i]);
				res.add(max);
			}
		}
		for(int j=res.size()-1;j>=0;j--) {
			sb.append(res.get(j)+" ");
		}
		System.out.println(sb);
	}

}
