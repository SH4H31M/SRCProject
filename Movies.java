
public class Movies extends Programme {
	
	private String rating;
	private DateReleased date;

	//
	public Movies() {
		super();
		rating="";
		date=new DateReleased();
	}
	//
	public Movies(String desc,String cc,String MS,String T,String L,String rating,DateReleased date )
	{
		super(desc,cc,MS,T,L);
		this.rating=rating;
		this.date=date;
	}
	//
	public Movies(Movies m) {
	
		super(m);
		this.rating=m.rating;
		this.date=m.date;
	}
}
