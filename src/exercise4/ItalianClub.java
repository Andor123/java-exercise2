package exercise4;

public class ItalianClub extends Club {
	
	public ItalianClub(String name, String country, int estYear, String league) {
		super(name, country, estYear, league);
	}

	public void getLeague() {
		System.out.println("Club's league: " + league + "\n");
	}

}
