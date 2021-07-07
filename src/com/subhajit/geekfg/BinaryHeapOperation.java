package com.subhajit.geekfg;
import java.util.*;
public class BinaryHeapOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int a=sc.nextInt();
			MinHeap h=new MinHeap(a);
			for(int i=0;i<a;i++)
			{
				int c=sc.nextInt();
				int  n;
				if(c==1)
				{  n=sc.nextInt();

				h.insertKey(n);
				}
				if(c==2)
				{  n=sc.nextInt();
				h.deleteKey(n);
				} 
				if(c==3)
				{ 
					System.out.print(h.extractMin()+" ");
				}

			}
			System.out.println();
		}
		sc.close();
	}

}
