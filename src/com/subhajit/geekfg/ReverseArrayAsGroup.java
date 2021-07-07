package com.subhajit.geekfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ReverseArrayAsGroup {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=1;i<=t;i++) {//test case
			String sr[]=new String[2];//to take the only first two input array size and the size of each array group
			sr=br.readLine().split(" ");//array size and the size of each array group taken
			String input[]=br.readLine().split(" ");//to take the element of an array as an string input, and store each individual into 
													//the string array by using space separation(split(" "))
			StringBuffer sb=new StringBuffer();//to store the result as string
			int k=Integer.parseInt(sr[1]);//group size converted from string to integer
			int j=k-1,a=0,s=k ;
			while(j>=a&&s<=Integer.parseInt(sr[0])) {
				sb.append(input[j]+" ");
				if(j==a) {
					if(s==Integer.parseInt(sr[0]))
						break;
					a+=k;
					s+=k;
					j=s;
				}
				j--;
			}
			if(s>Integer.parseInt(sr[0])) {
				int r=Integer.parseInt(sr[0])-1;
				while(r>=a) {
					sb.append(input[r]+" ");
					r--;
				}
			}
			System.out.println(sb);
		}
	}
}
