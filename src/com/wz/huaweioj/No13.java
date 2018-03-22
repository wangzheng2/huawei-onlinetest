package com.wz.huaweioj;
//将类似“i am a boy” 转换成“boy a am i”,细节最后一个字符后边没有空格
import java.util.Scanner;
public class No13 {
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner in=new Scanner(System.in);
			String str=in.nextLine();
			String str2=rever(str);
			System.out.println(str2);
		}
			public static String rever(String str){
			String[] arr=str.split(" ");
			int len=arr.length;
			StringBuffer sb=new StringBuffer();
			for(int i=len-1;i>0;i--){
				sb.append(arr[i]+" ");
			}
	            sb.append(arr[0]);
			return sb.toString();
			}
}