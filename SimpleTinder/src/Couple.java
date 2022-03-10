import java.text.DecimalFormat;

public class Couple implements Comparable {
	
	private Person p1;
	private Person p2;
	double score;
	
	public Couple(Person p1, Person p2,double score)
	{
		this.p1=p1;
		this.p2=p2;
		this.score= score;
	}
	
	
	public Person GetP1()
	{
		return this.p1;
	}
	
	public Person GetP2()
	{
		return this.p2;
	}
	
	public double GetScore()
	{
		return this.score;
	}
	
	 public String toString() {
		DecimalFormat num= new DecimalFormat("#.00");
		StringBuilder s=new StringBuilder();
		s.append("*** WE HAVE MATCH WITH SCORE: "+num.format(this.score)+"% ****\n");
		s.append(p1.getFullName()+" + "+ p2.getFullName()+"\n");
		s.append("** Data for the match: **\n");
		s.append(p1.toString());
		s.append(" + ");
		s.append(p2.toString());
		s.append("                 *******\n\n");
		return	(s.toString()); 
	}


	@Override
	public int compareTo(Object o) {
		if(this.score< ((Couple)o).GetScore())
			return -1;
		else if (this.score> ((Couple)o).GetScore())
			return 1;
		return 0;
	}



}
