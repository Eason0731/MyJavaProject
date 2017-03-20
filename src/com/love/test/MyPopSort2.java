package com.love.test;

import java.util.Scanner;

public class MyPopSort2 {
	
	public static void PopByDESC(int myNumberList[]){
		int tmp;
		System.out.println("DESC order is: ");
		for (int i=0 ; i<myNumberList.length; i++){
			for (int j=i+1; j<myNumberList.length; j++){
				if (myNumberList[i] < myNumberList[j]){
					tmp = myNumberList[i];
					myNumberList[i] = myNumberList[j];
					myNumberList[j] = tmp;
				}
			}
			System.out.println( myNumberList[i]);	
		}
		System.out.println("================================");
		
	}
	
	public static void PopByASC(int[] myNumberList){
		int tmp;
		System.out.println("ASC order is: ");
		for (int i=0 ; i<myNumberList.length; i++){
			for (int j=i+1; j<myNumberList.length; j++){
				if (myNumberList[i] > myNumberList[j]){
					tmp = myNumberList[i];
					myNumberList[i] = myNumberList[j];
					myNumberList[j] = tmp;
				}
			}
			System.out.println( myNumberList[i]);	
		}
		System.out.println("================================");
	}

	public static void main(String[] args) {
		//int myNumberList[] = {21,8,5,1,7,3,14};		
		
		System.out.println("你想输入几个数字?");
		Scanner scanner_sz =new Scanner(System.in);
		int sz =scanner_sz.nextInt();
		
		int i;
		System.out.println("请输入" +sz+ "个整数 (每输入完一个数字请打回车)");
		int[] myNumberList = new int[sz];
		
		for(i=0;i<sz;i++){
			Scanner scanner_NumberList=new Scanner(System.in);
			myNumberList[i]=scanner_NumberList.nextInt();		
		}
	
		PopByASC(myNumberList);
		PopByDESC(myNumberList);
		
	}

}
