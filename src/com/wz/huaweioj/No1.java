//计算字符串最后一个单词的长度，用indexof找出最后一个空格的位置，然后做差
package com.wz.huaweioj;
import java.util.Scanner;
public class No1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input=new Scanner(System.in);
		    String str=input.nextLine();
		    int p=str.lastIndexOf(" ");
		    int size=str.length()-1-p;
		    System.out.println(size);
	}
}
