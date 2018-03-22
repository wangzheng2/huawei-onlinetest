package com.wz.huaweioj;
//问题：字符串反转：思路1和n，2和n-1,3和n-2位置互换
import java.util.Scanner;
public class NO12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String str=in.next();
		int len=str.length();
		char[] ch=str.toCharArray();
		int i=0;
		int j=len-1;
		char temp=0;
		while(i<j){
			temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		String str1=ch.toString();
        System.out.println(ch);
	}
}
