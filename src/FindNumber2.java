
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class FindNumber2{
	public static void main(String[] args){
		Integer[] array = {2,3,4,5,6,2,6,6,8,9};
		process(array);
	}

	private static void process(Integer[] array){
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0 ; i < array.length ; i ++){
			if(map.containsKey(array[i])){
				map.put(array[i],map.get(array[i]) + 1);
			}else{
				map.put(array[i],1);
			}
		}
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> keys = keySet.iterator();
		Integer key = null;
		while(keys.hasNext()){
			key = keys.next();
			if(!map.get(key).equals(1)){
				System.out.printf("'%d' 重复出现 %d次.\n",key,map.get(key));
			}
		}
	}
}
