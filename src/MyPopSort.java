
public class MyPopSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberlist[] = {8,3,4,5,25,6,7,11};
		for (int i = 0 ; i < numberlist.length ; i++ ){
			for (int j = i+1 ; j < numberlist.length ; j++ ){
				int temp;
				if (numberlist[i] < numberlist[j]){
					temp = numberlist[i];
					numberlist[i] = numberlist[j];
					numberlist[j] = temp;
				}
			
				
			}
			
			System.out.println(numberlist[i]);
		}
		
	

	}

}
