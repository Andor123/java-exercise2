package exercise4;

public class Club implements ClubInterface {
	
	String name;
	String country;
	int estYear;
	
	public Club(String name, String country, int estYear) {
		this.name = name;
		this.country = country;
		this.estYear = estYear;
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
	
}
