package com.subhajit.geekfg;
import java.util.Scanner;
import java.util.*;

public class CountELements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
			//int k = sc.nextInt();

			GfG g = new GfG();
			g.countDistinct(a,k,n);			
			System.out.println();

			t--;
		}
		sc.close();
	}
}

/*Please note that it's Function problem i.e.
	you need to write your solution in the form of Function(s) only.
	Driver Code to call/invoke your function is mentioned above.*/

/*You are required to complete below method */
class GfG
{
	void countDistinct(int A[], int k, int n)
	{
		// Your code here
		int i,a=0;
		i=a;
		Set<Integer> set=new HashSet<Integer>();
		while(i<k&&k<=n){
			set.add(A[i]);
			if(i==k-1){
				System.out.print(set.size()+" ");
				a++;
				i=a;
				k+=1;
				set.clear();
			}
			else
				i++;
		}
	}
}



