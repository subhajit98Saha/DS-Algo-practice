package com.subhajit.geekfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayRotation {

	public static void main(String[] args) throws  IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());
		for(int i=1;i<=test;i++) {
			int size=Integer.parseInt(br.readLine());
			String[] str=br.readLine().split(" ");
			int d=Integer.parseInt(br.readLine());
			rotate(str,size,d);
		}
	}

	private static void rotate(String[] str, int size,int d) {
		StringBuffer sb=new StringBuffer();
		for(int i=d;i<size;i++) {
			sb.append(str[i]+" ");
		}
		for(int i=0;i<d;i++) {
			sb.append(str[i]+" ");
		}
		System.out.println(sb.toString());
	}

}
