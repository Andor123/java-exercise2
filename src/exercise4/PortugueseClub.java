package exercise4;

public class PortugueseClub extends Club {

	public PortugueseClub(String name, String country, int estYear, String league) {
		super(name, country, estYear, league);
	}

	public void getLeague() {
		System.out.println("Club's league: " + league + "\n");
	}

}
