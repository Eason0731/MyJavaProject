
public class MyJava20170106 {

	
	public static void myInt(int myInt){
		System.out.println(myInt);
		long myDouble = (long) myInt;
		myLong (myDouble);
		
	}
	
	public static void myDouble(double myDouble){
		System.out.println(myDouble);
		int myInt = (int) myDouble;
		myInt(myInt);
		
	}
	
	public static void myLong(long myLong){
		System.out.println(myLong);
		String myString = Long.toString(myLong);
		myString(myString);
		
	}
	
	public static void myString(String myString){
		System.out.println(myString);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = 3142566L;
		myDouble(a);
		
		String MyOSName = System.getProperty("os.name");
		System.out.println("========================");
		if (MyOSName.contains("Win")){
			System.out.println("This is Windows");
		}
		
		else if (MyOSName.contains("Mac")){
			System.out.println("This is Mac OS");
		}
		
		else {
			System.out.println(MyOSName);
		}
		
		System.out.println("You current operation  system is: " +MyOSName);

	}

}
