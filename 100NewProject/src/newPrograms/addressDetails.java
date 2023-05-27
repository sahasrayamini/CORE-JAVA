package newPrograms;

public class addressDetails {
	private  int Streetnumber;
	private String Streetname;
	private String city;
	private String state;
	private int Postalcode;
	
	public addressDetails() {
		// TODO Auto-generated constructor stub
	}

	public addressDetails(int streetnumber, String streetname, String city, String state, int postalcode) {
		super();
		Streetnumber = streetnumber;
		Streetname = streetname;
		this.city = city;
		this.state = state;
		Postalcode = postalcode;
	}
	
	
	public void display() {
		System.out.println( Streetnumber);
		System.out.println(Streetname);
		System.out.println(city);
		System.out.println(state);
		System.out.println(Postalcode);
		
	}
	public static void main(String[] args) {
		addressDetails ad=new addressDetails(100,"sahasra","khammam","khammam",507001);
	ad.display();
	
	}
	
	

}
