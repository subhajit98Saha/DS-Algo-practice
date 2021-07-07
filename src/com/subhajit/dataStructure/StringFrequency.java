package com.subhajit.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class StringFrequency {
	//Approach 1
//	public static void main(String[] args)throws IOException {
//		// TODO Auto-generated method stub
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter a string");
//		String str=br.readLine();
//		int[] stack=new int[123];
//		char[] ch=new char[str.length()];
//		ch=str.toCharArray();
//		int max=0;	char result=0;
//		System.out.println(result);
//		for(int i=0;i<str.length();i++) {
//			if(stack[ch[i]]<1)
//			stack[ch[i]]=1;
//			else
//				stack[ch[i]] +=stack[ch[i]];
//			if(max<stack[ch[i]])
//				result=ch[i];
//		}
//		System.out.println(result);
//	}

	//Another Easiest approach 2
//		public static void main(String[] args) {
//		// Set text in a string
//		String text = "GoodmorningclassHaveagoodlearningclassEnjoylearningwithfun";
//		// Create a TreeMap to hold words as key and count as value
//		TreeMap<Character, Integer> map =new TreeMap<Character, Integer>();//treeMap used to get the result in sorted order.
//		char[] words = text.toLowerCase().toCharArray(); //Splitting sentance based on String 
//		for (int i = 0; i < words.length; i++) {
//			Character key = words[i];
//			if (map.get(key) == null) {
//				map.put(key, 1);
//			} else {
//				int value = map.get(key).intValue();
//				value++;
//				map.put(key, value);
//			}
//		}
//		System.out.println(map);
//	}
	
	public static void main(String[] args) throws IOException {
		// Set text in a string
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Create a TreeMap to hold words as key and count as value
		String[] str=br.readLine().split(" ");
		TreeMap<Integer, Integer> map =new TreeMap<Integer, Integer>();//treeMap used to get the result in sorted order.
		 //Splitting sentance based on String 
		for (int i = 0; i < str.length; i++) {
			Integer key =Integer.parseInt(str[i]) ;
			if (map.get(key) == null) {
				map.put(key, 1);
			} else {
				int value = map.get(key).intValue();
				value++;
				map.put(key, value);
			}
		}
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(str.length);
	}
}
