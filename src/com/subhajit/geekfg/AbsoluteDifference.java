package com.subhajit.geekfg;

import java.io.*;
//Absolute Difference 1. GeekforGeek problem
public class AbsoluteDifference {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		for(int i=1;i<=t;i++){
		    String size[] = br.readLine().split(" ");
		    String[] sr=br.readLine().split(" ");
		    int p=0;
		    StringBuffer sb=new StringBuffer();
		    for(int j=0;j<Integer.parseInt(size[0]);j++){
		      if(sr[j].length()==1||Long.parseLong(sr[j])>=Long.parseLong(size[1]))
		        continue;
		       else{
		           char[] ch=sr[j].toCharArray();
		           int  k=0,flag=0;
		           while(k<ch.length-1){
		               int s=ch[k]-ch[k+1];
		               if(s>1||s<-1||s==0){
		                    flag=0;
		                    break;
		               }
		               else{
		                   flag=1;
		               }
		               k++;
		           }
		           if(flag==1){
		               p=1;
		               sb.append(sr[j]+" ");
		          }
		       }
		    }
		    if(p==0)
		        sb.append(-1);
		  System.out.println(sb);
		}
	}
}
