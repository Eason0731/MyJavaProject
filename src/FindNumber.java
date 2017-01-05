import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindNumber {

	public static void main(String[] args) {
		 String [] arry = {"1","1","1","1","1","2","2","2","2","2","3","3","3","3",};  
		    Map<String,Integer> map = new HashMap<String, Integer>();  
		    for(int i =0 ;i<arry.length;i++){  
		        if(null!= map.get(arry[i])){  
		            map.put(arry[i], map.get(arry[i-1])+1); //value+1  
		        }else{  
		            map.put(arry[i],1);  
		        }  
		    }  
		      
		    Iterator it = map.entrySet().iterator();    
		    while(it.hasNext()){  
		        Map.Entry entry = (Map.Entry) it.next();     
		        String  key  =  entry.getKey().toString();        
		        int  value  =  Integer.parseInt(entry.getValue().toString());  
		        System.out.println("key is :"+key+"---value :"+value);  
		    }   
	}
}


