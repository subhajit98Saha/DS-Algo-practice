package com.subhajit.geekfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayPendulamArrangement {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());
		for(int i=1;i<=test;i++){
			int size=Integer.parseInt(br.readLine());
			String[] str=br.readLine().split(" ");
			int[] arr=new int[size];
			for(int j=0;j<size;j++) {
				arr[j]=Integer.parseInt(str[j]);
			}
			Arrays.sort(arr);
			int[] res=new int[size];
			int mid=(size-1)/2;
			int l=mid-1,r=mid+1;
			res[mid]=arr[0];
			for(int k=1;k<size;k++) {
				if(k%2==0) {
					res[l]=arr[k];
					l--;
				}else {
					res[r]=arr[k];
					r++;
				}	
			}
			for(int j=0;j<size;j++)
				System.out.print(res[j]+" ");
			System.out.println();
		}
	}
}
