package com.wz.huaweioj;
//�����ơ�i am a boy�� ת���ɡ�boy a am i��,ϸ�����һ���ַ����û�пո�
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