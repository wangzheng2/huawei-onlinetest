//д��һ�����򣬽���һ������ĸ�������Լ��ո���ɵ��ַ���,
//��һ���ַ���Ȼ����������ַ����к��и��ַ��ĸ����������ִ�Сд��
//˼·����Ȼ�����ִ�Сд����ô���ַ���ת��Ϊ��д���ٽ��бȽ�
package com.wz.huaweioj;

import java.util.Scanner;

public class No2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner in=new Scanner(System.in);
	        String str=in.nextLine().toUpperCase();
	        char[] c=in.nextLine().toUpperCase().toCharArray();
	        getCount(str,c[0]);
	    }
	    public static void getCount(String str,char ch){
	        int count=0;
	        for(int i=0;i<str.length();i++){
	            if(ch==str.charAt(i))
	                count++;
	        }
	        System.out.print(count);
	    }
	}

