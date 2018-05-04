package exercise4;

public abstract class Club implements ClubInterface {
	
	String name;
	String country;
	int estYear;
	String league;
	
	public Club(String name, String country, int estYear, String league) {
		this.name = name;
		this.country = country;
		this.estYear = estYear;
		this.league = league;
	}
	
	public void getName() {
		System.out.println("Club name: " + name);
	}
	
	public void getCountry() {
		System.out.println("Club country: " + country);
	}
	
	public void getEstYear() {
		System.out.println("Club establishment year: " + estYear);
	}
	
	public abstract void getLeague();
	
}
