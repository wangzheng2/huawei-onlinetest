package com.wz.huaweioj;
//���⣺�ַ�����ת��˼·1��n��2��n-1,3��n-2λ�û���
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
