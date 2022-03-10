
public class Main {

	
	

	public static void main(String[] args)
	{
		String CSV_file="matchingApp.csv";
		TinderApp myTinder=new TinderApp(CSV_file);
		myTinder.createMatchingCouples();
		System.out.println("myTinder"); 
		System.out.println(myTinder); 

	}
}
