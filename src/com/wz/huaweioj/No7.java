//题目：写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。
//如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
//思路：有点投机取巧，round函数四舍五入
package com.wz.huaweioj;

import java.util.Scanner;

public class No7 {
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
    Float f1=in.nextFloat();
    int a=Math.round(f1);
    System.out.print(a);
	}
}
