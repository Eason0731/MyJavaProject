
public class MyPopSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberlist[] = {7,9,5,4,3,6,5,4,10,21};
		for (int i = 0 ; i < numberlist.length ; i++ ){
			for (int j = i+1 ; j < numberlist.length ; j++ ){
				int temp;
				if (i < j){
					temp = numberlist[i];
					numberlist[j] = numberlist[i];
					numberlist[i] = temp;
				}
			
				
			}
			
			System.out.println(numberlist[i]);
		}
		

	}

}
