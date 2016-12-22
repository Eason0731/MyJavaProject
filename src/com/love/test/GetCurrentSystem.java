package com.love.test;

public class GetCurrentSystem {
	
	public static String GetCurrentOSName(){
		//System.out.println(System.getProperties().getProperty("os.name"));
		return System.getProperties().getProperty("os.name");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = GetCurrentOSName();
		if (a.contains("Win")) {
			System.out.println("This is a Windows System");
		}
		
		else if (a.contains("Mac")){
			System.out.println("This is a Mac OS X System");
		}
		
		System.out.print("Your Current OS is: "+a);
	}

}
