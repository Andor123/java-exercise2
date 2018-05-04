package exercise4;

public class GermanClub extends Club {
	
	public GermanClub(String name, String country, int estYear, String league) {
		super(name, country, estYear, league);
	}

	public void getLeague() {
		System.out.println("Club's league: " + league + "\n");
	}

}
