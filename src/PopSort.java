import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PopSort {

	public static void pop(){
		int mylist[] = {5,14,7,8,21,1,3};
		int i,j,temp;
		for (i=0; i<mylist.length; i++){
			for (j=i+1; j<mylist.length ; j++){
				if (mylist[i] < mylist[j]){
					temp = mylist[i];
					mylist[i] = mylist [j];
					mylist[j] = temp;
				}
			}
			System.out.println(mylist[i]);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pop();
		pop();
		
	}

}
