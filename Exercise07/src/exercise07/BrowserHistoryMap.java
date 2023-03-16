package exercise07;
import java.util.*;

public class BrowserHistoryMap {
	HashMap<String,String> map=new HashMap<String,String>();
	
	Map<String,String> treeMap=new TreeMap<String,String>();
	BrowserHistoryMap(String extension,String url){
		map.put(extension, url);
	}
	void visit(String extension,String url){
		map.put(extension,url);
		treeMap.put(extension,url);
		for(Map.Entry m:map.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      } 
		for(Map.Entry m:treeMap.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      } 
}
	void fetchHistory(String extension) {
		int a =extension.length(),f=0;
		String str;
		Set<String> set=map.keySet();
		 for(String key:set) {
			 str=map.get(key);
		str=str.substring(str.length()-a);
		if((str.equals(extension))) {
			System.out.println(map.get(key));
			f=1;
		}
		}
		 if(f==0) {
			 System.out.println("No url with that extension");
		 }
	}
	void deleteHistory(String extension) {
		int a =extension.length(),f=0;
		String str;
		Set<String> set=map.keySet();
		 for(String key:set) {
			 str=map.get(key);
		str=str.substring(str.length()-a);
		if((str.equals(extension))) {
			map.remove(map.get(key));
			f=1;
		}
		}
		 if(f==0) {
			 System.out.println("No url with that extension");
		 }
	}
	void sizeAction(String extension) {
		int a =extension.length(),f=0;
		String str;
		Set<String> set=map.keySet();
		 for(String key:set) {
			 str=map.get(key);
		str=str.substring(str.length()-a);
		if((str.equals(extension))) {
			f++;
		}
		}
		 if(f==0) {
			 System.out.println("No url with that extension");
		 }
		 else {
			 System.out.println("There are "+f+" urls with this extension");
		 }
	}
	void searchWord(String search) {
		Set<String> set=map.keySet();
		if(map.containsValue(search)) {
			 for(String key:set) {
				 if(map.get(key).equals(search)) {
					 System.out.println(map.get(key)); 
				 }
			 }
		}
		else {
			System.out.println("No word present");
		}
	}
}
