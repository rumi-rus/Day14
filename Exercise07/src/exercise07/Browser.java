package exercise07;

import java.util.Scanner;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BrowserHistory b=new BrowserHistory("fb.com");
        BrowserHistoryMap bMap=new BrowserHistoryMap(".com","fb.com");
        char choice;
        int option;
		Scanner sc = new Scanner(System.in);
		//Scanner s = new Scanner(System.in);
		do {
			System.out.println("\nA. List and Set\nB. Map\nEnter the choice\n");
			choice= sc.next().charAt(0);;
			if(choice=='A') {
	        System.out.println("\nTHE MENU:");
	        System.out.println("1.Visit url\n2.Deletion when index given\n3.Deletion when string given");
	        System.out.println("4.fetch history\n5.Search\n6.Update--------------------------\n Enter the option");
	        option= sc.nextInt();
	        System.out.println("--------------------------");
	        if(option==1) {
	        	String str;
	        	Scanner s = new Scanner(System.in);
	        	System.out.println("Enter the string to visit ");
	        	str= s.nextLine();
	        	b.visit(str);
	        	
	        }
	        else if(option==2) {
	        	int a;
	        	Scanner s = new Scanner(System.in);
	        	System.out.println("Enter the index to delete ");
	        	a= s.nextInt();
	        	b.deleteHistory(a);

	        		        }
	        else if(option==3) {
	        	
	        	String str;
	        	Scanner s = new Scanner(System.in);
	        	System.out.println("Enter the url to delete ");
	            str= s.nextLine();
	        	b.deleteHistory(str);
	        }
	        else if(option==4){ 
	        
	        	b.fetchHistory();
	                   }  
	        else if(option==5){
	        	String str;
	        	Scanner s = new Scanner(System.in);
	        	System.out.println("Enter the extension ");
	            str= s.nextLine();
	        	b.search(str);
	        }
	        else if(option==6) {
	        	int a;
	        	Scanner s = new Scanner(System.in);
	        	System.out.println("Enter the index update ");
	        	a= s.nextInt();
	        	b.updateHistory(a);
	        }
			}
			else if(choice=='B') {
				 System.out.println("\nTHE MENU:");
			     System.out.println("1.Visit url\n2.Fetch when extension given\n3.Deletion ");
			     System.out.println("4.size\n5.Search--------------------------\n Enter the option");
			     option= sc.nextInt();
			     System.out.println("--------------------------");
			     if(option==1) {
			        	String str,extension;
			        	Scanner s = new Scanner(System.in);
			        	System.out.println("Enter the string to visit ");
			        	str= s.nextLine();
			        	System.out.println("Enter the extension ");
			        	extension= s.nextLine();
			        	bMap.visit(extension,str);
			        }
			     else if(option==2) {
			        	String str;
			        	Scanner s = new Scanner(System.in);
			        	System.out.println("Enter the extension to fetch ");
			            str= s.nextLine();
			        	bMap.fetchHistory(str);
			        }
			     else if(option==3) {
			        	String str;
			        	Scanner s = new Scanner(System.in);
			        	System.out.println("Enter the extension to delete ");
			            str= s.nextLine();
			        	bMap.deleteHistory(str);
			        }
			     else if(option==4){ 
			        	String extension;
			        	Scanner s = new Scanner(System.in);
			        	System.out.println("Enter the extension to find the number");
			            extension= s.nextLine();
			        	bMap.sizeAction(extension);
			                   }
			     else if(option==5){
			        	String str;
			        	Scanner s = new Scanner(System.in);
			        	System.out.println("Enter the url to search ");
			            str= s.nextLine();
			        	bMap.searchWord(str);
			     }
			}
	        else {
	        	System.exit(0);
	        }
		    }while(true);
	}
}
