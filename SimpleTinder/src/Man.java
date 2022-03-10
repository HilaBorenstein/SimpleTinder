
public class Man extends Person{
	
	protected String Height;
	
	public Man(String Full_Name,String Gender,int Age,String Profession,String Dominant_attribute,String Preferred_Gender,
			                     int Max_age_preferration,String Preferred_Profession,String Preferred_Dominant_attribute,String Height)
	{
		super(Full_Name,Gender,Age,Profession,Dominant_attribute, Preferred_Gender, Max_age_preferration, Preferred_Profession, Preferred_Dominant_attribute);
		this.Height=Height;
	}

	@Override
	public  void DoSomethingUnique (Person P) {}

	
	

	
	  public String toString() {
		  StringBuilder sb= new StringBuilder();
		  sb.append(super.toString());
		  sb.deleteCharAt(sb.length()-1);
		  sb.append(", Height: "+this.Height+"}");
		  return sb.toString();

		  }

}
