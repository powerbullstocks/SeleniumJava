package nopcommerceV001_cucumber;

public class Kirthiga {

//	public Kirthiga(int a) {
//		
//	}
	
	
	public static void main(String args[]) {
		System.out.println("here " + args[0]);
		
		Kirthiga k = new Kirthiga();
		int a = k.testMethod(args[0]);
		
		System.out.println(a);
		
	}
	
	public int testMethod(String a) {
		if(a == "test") 
			return 10;
		else
			return 20;
	}
}
