package ex;

import java.util.Scanner;

/*
 * Topic: 請寫一個函式 (不是遞迴) 進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021059  王俊鑌
 */

public class ex01 {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
         int n= scn.nextInt();
         int v1=n;
         String s="";
         while(v1>0){
        	 s=s+v1%2;
        	 v1=v1/2;
        	 
         }
        String a=new StringBuilder(s).reverse().toString();
	System.out.println(a);
	
	}
}
