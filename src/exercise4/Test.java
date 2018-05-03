package exercise4;

public class Test {

	public static void main(String[] args) {
		Club club1 = new Club("Juventus", "Italy", 1897);
		Club club2 = new Club("Newcastle United", "United Kingdom", 1892);
		Club club3 = new Club("Barcelona", "Spain", 1899);
		Club club4 = new Club("Bayern München", "Germany", 1900);
		Club club5 = new Club("Paris Saint-Germain", "France", 1970);
		
		getClub(club1);
		getClub(club2);
		getClub(club3);
		getClub(club4);
		getClub(club5);
	}
	
	public static void getClub(Club club) {
		club.getName();
		club.getCountry();
		club.getEstYear();
		System.out.println(" ");
	}

}
