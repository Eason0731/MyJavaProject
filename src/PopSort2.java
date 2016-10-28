
public class PopSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int list[] = {8,7,9,4,5};
		int temp;
		for (int i=0; i < list.length; i++){
			for (int j=i+1;j < list.length; j++){
				if (list[i] < list [j]){
					temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
			
		}
		
		for (int k=0 ; k< list.length ; k++){
			System.out.println(list[k]);
		}
		

	}

}
