package com.subhajit.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
//Program to find out the 2nd largest frequent character in a string
// for example input:ssuiabjwsb   output:b 2
public class SecondFrequent {

//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		char[] input=br.readLine().toCharArray();
//		Map<Character,Integer> mp=new HashMap<>();
//		for(int i=0;i<input.length;i++) {
//			if(mp.containsKey(input[i])){
//				mp.put(input[i], mp.get(input[i])+1);
//			}else
//				mp.put(input[i], 1);
//		}
//		Integer maxValue=0,maxval=-1;
//		for(Map.Entry<Character, Integer> entry:mp.entrySet()) {
//			if(maxValue<entry.getValue()){
//				maxval=maxValue;
//				maxValue=entry.getValue();
//			}else if(maxval<entry.getValue()&&maxValue!=entry.getValue()) {
//					maxval=entry.getValue();
//			}
//		}
//		for(Map.Entry<Character, Integer> entry:mp.entrySet()) {
//			if(maxval.equals(entry.getValue()))
//				System.out.println(entry.getKey()+" "+maxval);
//		}
//	}
	
	
	//program for find the second most frequent string
	//for example input:geeks for geeks for geeks ccc    output:for
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t>0){
		    int length=Integer.parseInt(br.readLine());
    		String[] input=br.readLine().split(" ");
    		Map<String,Integer> mp=new HashMap<>();
    		for(int i=0;i<input.length;i++) {
    			if(mp.containsKey(input[i])){
    				mp.put(input[i], mp.get(input[i])+1);
    			}else
    				mp.put(input[i], 1);
    		}
    		Integer maxValue=0,maxval=-1;
    		for(Map.Entry<String, Integer> entry:mp.entrySet()) {
    			if(maxValue<entry.getValue()){
    				maxval=maxValue;
    				maxValue=entry.getValue();
    			}else if(maxval<entry.getValue()&&maxValue!=entry.getValue()) {
    					maxval=entry.getValue();
    			}
    		}
    		for(Map.Entry<String, Integer> entry:mp.entrySet()) {
    			if(maxval.equals(entry.getValue()))//we can also write- if(Objects.equals(maxval,entry.getValue()))
    				System.out.println(entry.getKey());
    		}
    		t--;
		}
	}
}
