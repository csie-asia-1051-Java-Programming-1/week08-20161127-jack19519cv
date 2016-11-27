package ex;
/*
 * Topic: 請用類別撰寫一個計算機，透過計算機物件可以計算 加、減、乘、除、平方、立方、開根號的功能
 * Date: 2016/11/21
 * Author: 105021059 王俊鑌
 */

import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		count ct = new count();
		System.out.print("請輸入要運算的運算符號:1.+2.-3.*4./5.平方6.立方7.開根號:");
		int a = scn.nextInt();
		if(a == 1||a == 2||a == 3||a == 4){
			System.out.print("請輸入兩個數字:");
			float n = scn.nextInt();
			float m = scn.nextInt();
		System.out.println(ct.count(n, m, a));
		}else if(a == 5||a == 6||a == 7){
			System.out.print("請輸入一個數字:");
			float n = scn.nextInt();
			System.out.println(ct.other(n, a));
		}else{
			System.out.println("輸入錯誤");
		}
	}
}
class count{
	public float count(float n , float m , int a){
		float sum = 0f;
		switch(a){
		case 1:
			sum=n+m;
			break;
		case 2:
			sum=n-m;
			break;
		case 3:
			sum=n*m;
			break;
		case 4:
			sum=n/m;
			break;
		}
		return sum;
	}
	public float other(float n , int a){
		float sum = 0f;
		switch(a){
		case 5:  
			sum=n*n;
			break;
		case 6:  
			sum=n*n*n;
			break;
		case 7:  
			sum=(float) Math.sqrt(n);
			break;
		}
		return sum;
	}
}
