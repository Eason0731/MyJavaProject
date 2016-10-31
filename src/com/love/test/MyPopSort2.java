package com.love.test;

public class MyPopSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int McLaren[] = {4,66,21,1,5,7,3};
		for (int i = 0 ; i < McLaren.length; i++){
			for(int j = i+1 ; j < McLaren.length; j++){
				if(McLaren[i] < McLaren[j]){
					int temp;
					temp = McLaren[i];
					McLaren[i] = McLaren [j];
					McLaren[j] = temp;
				}
			}
			
			System.out.println(McLaren[i]);
		}
		
	}

}
