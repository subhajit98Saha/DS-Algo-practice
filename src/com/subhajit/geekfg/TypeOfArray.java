package com.subhajit.geekfg;

//import java.io.*;
import java.util.*;

public class TypeOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		//int t = Integer.parseInt(br.readLine().trim());
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=1;j<=t;j++){
			int size = sc.nextInt();
			long[] input=new long[size];
			long[] given=new long[size];
			StringBuffer sb=new StringBuffer();
			int maxIndex=0;long max=0;
			for(int i=0;i<size;i++) {
				input[i]=sc.nextLong();
				if(max<input[i]) {
					max=input[i];
					maxIndex=i;
				}
				given[i]=input[i];
			}
			Arrays.sort(input);
			int k;
			if(maxIndex+1==size)
				 k=size-maxIndex;
			if(input[0]==given[0])
				sb.append(input[size-1]+" "+1);
			if(input[size-1]==given[0])
				sb.append(input[size-1]+" "+2);
			if(given[maxIndex-1]==input[0])
				sb.append(input[size-1]+" "+3);
			if(given[maxIndex+1]==input[0])
				sb.append(input[size-1]+" "+4);
			System.out.println(sb);
		}
		sc.close();
	}
}
