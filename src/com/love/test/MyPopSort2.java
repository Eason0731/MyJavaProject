package com.love.test;

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
		int myNumberList[] = {21,8,5,1,7,3,14};		
		PopByASC(myNumberList);
		PopByDESC(myNumberList);

		
	}

}
