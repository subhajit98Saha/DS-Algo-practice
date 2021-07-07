package com.subhajit.geekfg;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			int input=sc.nextInt();
			int k =1, s = 0, v = 0,counter=input;
			int m=input*(input+1);
			for (int i = 1; i <= input; i++)
			{
				if (i > 1)
				{
					s += 2;
					v = s;
					while (v >= 1)
					{
						System.out.print ("_");
						v--;
					}
				}
				for (int j = i; j <= input; j++)
				{
					System.out.print (k + "*");
					k++;
				}
				int a=(m-counter),x=a+1;
				while(x<=m) {
					if(x==m) {
						System.out.print(x);
						m=a;
						counter--;
						break;
					}
					else
						System.out.print (x + "*");
					x++;
				}
				System.out.println();
			}
			t--;
		}
		sc.close();
	}
}
