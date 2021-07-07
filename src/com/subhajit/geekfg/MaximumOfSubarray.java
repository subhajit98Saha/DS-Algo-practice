package com.subhajit.geekfg;

import java.io.*;
import java.util.*;

//public class MaximumOfSubarray {
//
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		int test=Integer.parseInt(br.readLine());
//		while(test>=1) {
//			String[] sr=br.readLine().split(" ");
//			String[] str=br.readLine().split(" ");
//			int a=0;int endIndex=Integer.parseInt(sr[1])-1,startIndex=a;
//			Map<Integer,Integer> map=new HashMap<>();
//			int max=0;
//			while(startIndex<=endIndex) {
//				if(map.containsKey(Integer.parseInt(str[startIndex]))){
//					max=max<Integer.parseInt(str[startIndex])?Integer.parseInt(str[startIndex]):max;
//					if(startIndex==endIndex) {
//						System.out.print(max+" ");
//						max=0;
//						endIndex++;
//						a++;
//						startIndex=a;
//					}else
//						startIndex++;
//				}
//				System.out.println();
//				test--;
//			}
//		}
//	}
//}

//
//
//
//
//
//
//
//Another approach for better time complexity.Using Deque
//
//
//
////Java Program to find the maximum for each and every contiguous subarray of size k. 
//
//import java.util.Deque; 
//import java.util.LinkedList; 
//
//public class MaximumOfSubarray 
//{ 
//	
//	// A Dequeue (Double ended queue) based method for printing maixmum element of 
//	// all subarrays of size k 
//	static void printMax(int arr[],int n, int k) 
//	{ 
//		// Create a Double Ended Queue, Qi that will store indexes of array elements 
//		// The queue will store indexes of useful elements in every window and it will 
//		// maintain decreasing order of values from front to rear in Qi, i.e., 
//		// arr[Qi.front[]] to arr[Qi.rear()] are sorted in decreasing order 
//		Deque<Integer> Qi = new LinkedList<Integer>(); 
//		
//		/* Process first k (or first window) elements of array */
//		int i; 
//		for(i = 0; i < k; ++i) 
//		{ 
//			// For every element, the previous smaller elements are useless so 
//			// remove them from Qi 
//			while(!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) 
//				Qi.removeLast(); // Remove from rear 
//			
//			// Add new element at rear of queue 
//			Qi.addLast(i); 
//		} 
//		
//		// Process rest of the elements, i.e., from arr[k] to arr[n-1] 
//		for( ;i < n; ++i) 
//		{ 
//			// The element at the front of the queue is the largest element of 
//			// previous window, so print it 
//			System.out.print(arr[Qi.peek()] + " "); 
//			
//			// Remove the elements which are out of this window 
//			while((!Qi.isEmpty()) && Qi.peek() <= i-k) 
//				Qi.removeFirst(); 
//			
//			// Remove all elements smaller than the currently 
//			// being added element (remove useless elements) 
//			while((!Qi.isEmpty()) && arr[i] >= arr[Qi.peekLast()]) 
//				Qi.removeLast(); 
//			
//
//			// Add current element at the rear of Qi 
//			Qi.addLast(i); 
//			
//		} 
//		
//		// Print the maximum element of last window 
//		System.out.print(arr[Qi.peek()]); 
//	} 
//	
//	// Driver program to test above functions 
//	public static void main(String[] args) 
//	{ 
//		Scanner sc=new Scanner(System.in);
//		int test=sc.nextInt();
//		while(test>=1) {
//			int n=sc.nextInt();
//			int k=sc.nextInt();
//			int[] arr=new int[n];
//			for(int i=0;i<n;i++) {
//				arr[i]=sc.nextInt();
//			}
//			printMax(arr, arr.length,k); 
//			System.out.println();
//			test--;
//		}
//		sc.close();
//	} 
//} 
////The above code is contributed by Sumit Ghosh 







public class MaximumOfSubarray  {
    public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());
		while(test>=1) {
			String[] sr=br.readLine().split(" ");
            String[] str=br.readLine().split(" ");
			printMax(str,Integer.parseInt(sr[0]),Integer.parseInt(sr[1])); 
			System.out.println();
			test--;
		}
	} 
	static void printMax(String arr[],int n, int k) 
	{ 
		Deque<Integer> Qi = new LinkedList<Integer>(); 
		int i; 
		for(i = 0; i < k; ++i) 
		{ 
		    while(!Qi.isEmpty() && Integer.parseInt(arr[i]) >= Integer.parseInt(arr[Qi.peekLast()]))
				Qi.removeLast();
			Qi.addLast(i); 
		} 
		for( ;i < n; ++i) 
		{ 
		    System.out.print(Integer.parseInt(arr[Qi.peek()]) + " "); 
			while((!Qi.isEmpty()) && Qi.peek() <= i-k) 
				Qi.removeFirst(); 
			while(!Qi.isEmpty() && Integer.parseInt(arr[i]) >= Integer.parseInt(arr[Qi.peekLast()])) 
				Qi.removeLast(); 
			Qi.addLast(i); 
		}
		System.out.print(Integer.parseInt(arr[Qi.peek()])); 
	} 
}
