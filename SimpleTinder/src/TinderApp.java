import java.io.*;
import java.util.*;

public class TinderApp {
	

	private ArrayList<Person> Person_list;
	//to have all couple in list
	private ArrayList<Couple> All_Couple_list;
	//to track duplicates couples
	private HashMap<Person,Person> All_Couples_found;
	
	
	public TinderApp (String CSV_file)//will read the CSV File and fill the lists
	{

		Person_list=new ArrayList<Person>();
		
		String line = "";  
		String splitBy = ",";  
		try   
		{  
		//parsing a CSV file into BufferedReader class constructor  
		BufferedReader br = new BufferedReader(new FileReader(CSV_file));
		line = br.readLine();
		while ((line = br.readLine()) != null)   //returns a Boolean value  
		{	
		String[] person = line.split(splitBy);    // use comma as separator 	
		if(person[1].equals("Male"))//create male and add to men_list
			{	
			//System.out.println(line);
			this.Person_list.add(new Man(person[0],person[1],Integer.valueOf(person[2]),person[3],person[4],person[5],Integer.valueOf(person[6]),person[7],person[8],person[9]));
			}
		else
			{
			this.Person_list.add(new Woman(person[0],person[1],Integer.valueOf(person[2]),person[3],person[4],person[5],Integer.valueOf(person[6]),person[7],person[8],person[9]));
			}
		}		
		br.close();
		}   
		catch (IOException e)   
		{  
			//e.printStackTrace();  
			System.out.println("ERROR!! File corrupted..");
		}  
		

	}
	

//create the couples in list
	
	public void createMatchingCouples()
	{
		this.All_Couple_list=new ArrayList<Couple>();
		//for tracking duplicates couples
		this.All_Couples_found=new HashMap<Person,Person>();
		
		
		//calculate for men
		for(int i=0;i<this.Person_list.size();i++)
		{
			searchList(this.Person_list.get(i) , this.Person_list,i+1);
		}
		
		Collections.sort(this.All_Couple_list,Collections.reverseOrder());
		
	}
	
	
	private void searchList(Person p, ArrayList<Person> persons,int index)
	{
		for(int i=index;i<persons.size();i++)
		{
			Person p2=persons.get(i);
			if(p!=p2)
			{
				double score= p.checkMatch(p2);
				if(score>=0)
				{
					if ( (this.All_Couples_found.containsKey(p))&& (this.All_Couples_found.get(p)==p2)) {}//do nothing -p and p2 exists in the couple list
					else if ( (this.All_Couples_found.containsKey(p2))&& (this.All_Couples_found.get(p2)==p)) {}//do nothing -p and p2 exists in the couple list
					//shallow copying-careful
					else {
						this.All_Couple_list.add(new Couple(p,p2,score));
						this.All_Couples_found.put(p,p2);
						//this.All_Couples_found.put(p2,p);
					}
					
				}
			}
			
		}
		
	}

	
	  public String toString() {
			StringBuilder s=new StringBuilder();
			s.append(this.All_Couple_list);
			return	(s.toString()); 
		  }

}
