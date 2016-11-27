package hw;
/*
 * Topic: 請寫一個 遞迴函式)進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author:105021059 王俊鑌
 */
import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入一個數字:");
		int n = scn.nextInt();
		String s = new StringBuilder(F(n)).reverse().toString();
		System.out.println("二進制:"+s);

	}
	public static String F(int n){
		int a = 0;
		String str ="";
		if(n == 0){
			return str;
		}else{
			a = n % 2;
			return a+str+F(n/2);
		}
	}
}
