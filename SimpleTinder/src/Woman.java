
public class Woman extends Person {

	protected String Hair_Color;

	
	public Woman(String Full_Name,String Gender,int Age,String Profession,String Dominant_attribute,String Preferred_Gender,
			                     int Max_age_preferration,String Preferred_Profession,String Preferred_Dominant_attribute,String Hair_Color)
	{
		super(Full_Name,Gender,Age,Profession,Dominant_attribute, Preferred_Gender, Max_age_preferration, Preferred_Profession, Preferred_Dominant_attribute);
		this.Hair_Color=Hair_Color;
	}
	
	@Override
	public  void DoSomethingUnique (Person P) {}

	
	  public String toString() {
		  StringBuilder sb= new StringBuilder();
		  sb.append(super.toString());
		  sb.deleteCharAt(sb.length()-1);
		  sb.append(", Hair_Color: "+this.Hair_Color+"}");
		  return sb.toString();

		  }
}
