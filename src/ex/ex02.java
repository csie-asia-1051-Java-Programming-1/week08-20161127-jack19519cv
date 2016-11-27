package ex;
/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換

 * Date: 2016/11/21
 * Author: 105021059 王俊鑌
 */

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入進制:");
		int de=scn.nextInt();
		System.out.println("請輸入進制的數字:");
		int n=scn.nextInt();
		int sum = 0;
		for(int i = 1 ; n > 0 ; i*=de){
			sum = sum + ((n % 10)*i);
			n = n / 10 ; 	
		}
		System.out.println("請輸入要轉變的進制:");
      int a=scn.nextInt();
      String str=new StringBuilder(changeDecimal(sum,a)).reverse().toString();
      System.out.println(str);
        
	}
public static String   changeDecimal(int s,int a) {
	Scanner scn = new Scanner(System.in);
	int c= 0;
	String str="";
	while(s>0){
		c=s % a;
		str=str+""+c;
		s = s / a ; 	
	}
	return str;
	}

}
