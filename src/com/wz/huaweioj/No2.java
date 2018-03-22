//写出一个程序，接受一个有字母和数字以及空格组成的字符串,
//和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
//思路：既然不区分大小写，那么把字符都转换为大写，再进行比较
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

