package exercise07;

import java.util.*;


public class BrowserHistory {
	ArrayList<String> browserArray=new ArrayList<String>();
	LinkedList<String> list =new LinkedList<String>();
	TreeSet<String> set=new TreeSet<String>();
	HashSet<String> hashset=new HashSet<String>();
	
	BrowserHistory(String url){
		browserArray.add(url);
		list.add(url);
		set.add(url);
		hashset.add(url);
	}
	void visit(String url){
		browserArray.add(url);
		list.add(url);  
		set.add(url);
		hashset.add(url);
		browserArray.sort(null);
		list.sort(null);
		TreeSet<String> treeSet = new TreeSet<String>(hashset);
		System.out.println(browserArray);
		System.out.println(list);
		System.out.println(set);
		System.out.println(treeSet);
	}	
	void deleteHistory(int index) {
		browserArray.remove(index);
		list.remove(index);
		//set.remove(index);
	}
	void deleteHistory(String url) {
		browserArray.remove(url);
		list.remove(url);
		set.remove(url);
		hashset.remove(url);
	}
	void fetchHistory() {
		System.out.println("The arraylist is : ");
		for(int i=0;i<browserArray.size();i++) {
			System.out.println(browserArray.get(i));
		}
		System.out.println("The linkedlist is : ");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("The set is : ");
		for(String s:set) {
			System.out.println(s);
		}
		System.out.println("The hashset is : ");
		for(String s:hashset) {
			System.out.println(s);
		}
	}
	void search(String extension) {
		String str;
		int a =extension.length(),f=0;
		System.out.println("Searching a string in arraylist");
		for(int i=0;i<browserArray.size();i++) {
			str=browserArray.get(i);
		str=str.substring(str.length()-a);
		if((str.equals(extension))) {
			System.out.println(browserArray.get(i));
			f=1;
		}
		}
		if(f==0) {
			System.out.println("No url in arraylist");
		}f=0;
		System.out.println("Searching a string in linkedlist");
		for(int i=0;i<list.size();i++) {
			str=list.get(i);
		str=str.substring(str.length()-a);
		if((str.equals(extension))) {
			System.out.println(list.get(i));
			f=1;
		}
		}
		if(f==0) {
			System.out.println("No url in linkedlist");
		}f=0;
		System.out.println("Searching a string in treeset");
		for(String s:set) {
			str=s;
			s=s.substring(s.length()-a);
			if((s.equals(extension))) {
				System.out.println(str);
				f=1;
			}
		}
		if(f==0) {
			System.out.println("No url in treeset");
		}f=0;
		System.out.println("Searching a string in hashset");
		for(String s:set) {
			str=s;
			s=s.substring(s.length()-a);
			if((s.equals(extension))) {
				System.out.println(str);
				f=1;
			}
		}
		if(f==0) {
			System.out.println("No url in hashset");
		}
	}
	void updateHistory(int index) {
		String str;
		String oldUrl = browserArray.get(index);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the new url : ");
		str= sc.nextLine();
		browserArray.set(index,str);
		list.set(index, str);
		set.remove(oldUrl); 
		set.add(str);
		hashset.remove(oldUrl);
		hashset.add(str);
	}
}
