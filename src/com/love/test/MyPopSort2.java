package com.love.test;

public class MyPopSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Honda[] = {4,66,21,1,5,7,3};
		for (int i = 0 ; i < Honda.length; i++){
			for(int j = i+1 ; j < Honda.length; j++){
				if(Honda[i] < Honda[j]){
					int temp;
					temp = Honda[i];
					Honda[i] = Honda [j];
					Honda[j] = temp;
				}
			}
			
			System.out.println(Honda[i]);
		}
		
	}

}
