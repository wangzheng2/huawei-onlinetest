//�����ַ������һ�����ʵĳ��ȣ���indexof�ҳ����һ���ո��λ�ã�Ȼ������
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
