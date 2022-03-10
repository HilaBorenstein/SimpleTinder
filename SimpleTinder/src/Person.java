
public abstract class Person {
	
	protected String Full_Name;
	protected String Gender;
	protected int Age;
	protected String Profession;
	protected String Dominant_attribute;
	
	protected String Preferred_Gender;
	protected int Max_age_preferration;
	protected String Preferred_Profession;
	protected String Preferred_Dominant_attribute;

	public Person(String Full_Name,String Gender,int Age,String Profession,String Dominant_attribute,String Preferred_Gender,int Max_age_preferration,String Preferred_Profession,String Preferred_Dominant_attribute)
	{
		this.Full_Name=Full_Name;
		this.Gender=Gender;
		this.Age=Age;
		this.Profession=Profession;
		this.Dominant_attribute=Dominant_attribute;
		this.Preferred_Gender=Preferred_Gender;
		this.Max_age_preferration=Max_age_preferration;
		this.Preferred_Profession=Preferred_Profession;
		this.Preferred_Dominant_attribute=Preferred_Dominant_attribute;		
	}
	
	public abstract void DoSomethingUnique (Person P);
	

	
	/*************************************************************
	//this method return -1 if there cannot be match per request Gander
	 * 
	 * 
	 * @param P
	 * @return
	 ******************************************************/
	public  double checkMatch (Person P)
	{
		if((!this.Preferred_Gender.equals("Both")) && (!this.Preferred_Gender.equals(P.Gender)) )
			return -1;	
		if((!P.Preferred_Gender.equals("Both"))&& (!P.Preferred_Gender.equals(this.Gender)))
			return -1;
		//the maximum score is 6
		int score=0;
		//age check
		if(this.Age<P.Max_age_preferration)
			score++;
		if(P.Age<this.getMax_age_preferration())
			score++;
		//attributes check
		if(this.Preferred_Dominant_attribute.equals(P.getDominant_attribute()))
			score++;
		if(P.getPreferred_Dominant_attribute().equals(this.Dominant_attribute))
			score++;
		//check Profession
		if(this.Preferred_Profession.equals(P.getProfession()))
			score++;
		if(P.getPreferred_Profession().equals(this.Profession))
			score++;
			
		return score*16.65;
	}
	
	//getters
	public String getFullName()
	{
		return this.Full_Name;
	}
	
	public String getFirstName()
	{
		String [] splitted= this.Full_Name.split("\\s+");
		return splitted[0];
	}
	
	public String getLastName()
	{
		String [] splitted= this.Full_Name.split("\\s+");
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<splitted.length;i++)
		{
			sb.append(splitted[i]);
		}
			
		return sb.toString();
	}
	
	public String getGender()
	{
		return this.Gender;
	}
	
	public int getAge()
	{
		return this.Age;
	}
	
	public String getProfession()
	{
		return this.Profession;
	}
	
	public String getDominant_attribute()
	{
		return this.Dominant_attribute;
	}
	
	
	public String getPreferred_Gender()
	{
		return this.Preferred_Gender;
	}
	
	public int getMax_age_preferration()
	{
		return this.Max_age_preferration;
	}
	
	public String getPreferred_Profession()
	{
		return this.Preferred_Profession;
	}
	
	public String getPreferred_Dominant_attribute()
	{
		return this.Preferred_Dominant_attribute;
	}

	//setters
	// I am giving the option to change only part of attributes
	public void setProfession(String Profession)
	{
		this.Profession=Profession;
	}
	
	public void setPreferred_Gender(String Preferred_Gender)
	{
		this.Preferred_Gender=Preferred_Gender;
	}
	
	public void setMax_age_preferration(int Max_age_preferration)
	{
		this.Max_age_preferration=Max_age_preferration;
	}
	
	public void setPreferred_Profession(String Preferred_Profession)
	{
		this.Preferred_Profession=Preferred_Profession;
	}
	
	public void setPreferred_Dominant_attribute(String Preferred_Dominant_attribute)
	{
		this.Preferred_Dominant_attribute=Preferred_Dominant_attribute;
	}

	  public String toString() {
			StringBuilder s=new StringBuilder();
			s.append("{Full Name:"+this.Full_Name+", Gender: "+this.Gender+", Age: "+this.Age+", Dominant_attribute: "+this.Dominant_attribute+", Profession: "+this.Profession+"}");
			return	(s.toString()); 
		  }
}

