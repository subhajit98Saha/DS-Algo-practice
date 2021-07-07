package com.subhajit.geekfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DialpadCombination {
	public static Map<Integer,String> mp=new HashMap<>();
	public static int size;
	public static void main(String[] args) throws IOException{
		mp.put(2,"abc");
		mp.put(3,"def");
		mp.put(4,"ghi");
		mp.put(5,"jkl");
		mp.put(6,"mno");
		mp.put(7,"pqrs");
		mp.put(8,"tuv");
		mp.put(9,"wxyz");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());
		while(test>=1) {
			size=Integer.parseInt(br.readLine());
			String[] str=br.readLine().split(" ");
			StringBuffer res=new StringBuffer();
			combine(str,0,0,res);
			System.out.println();
			test--;
		}
	}
	//here we have only recursion,here i indicating  
	private static void combine(String[] str,int i,int j,StringBuffer res) {
		if(i==size) {
			System.out.print(res+" ");
			return;
		}
		if(j==mp.get(Integer.parseInt(str[i])).length())
			return;
		res.append(mp.get(Integer.parseInt(str[i])).charAt(j));		
		combine(str,i+1,0,res);
		res.deleteCharAt(i);
		combine(str,i,j+1,res);
	}
}
