package exercise4;

public class BelgianClub extends Club {

	public BelgianClub(String name, String country, int estYear, String league) {
		super(name, country, estYear, league);
	}
	
	public void getLeague() {
		System.out.println("Club's league: " + league + "\n");
	}

}
