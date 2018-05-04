package exercise4;

public class Test {

	public static void main(String[] args) {
		Club club1 = new EnglishClub("Manchester City F.C.", "England", 1880, "Premier League");
		Club club2 = new GermanClub("FC Bayern München", "Germany", 1900, "Bundesliga");
		Club club3 = new SpanishClub("FC Barcelona", "Spain", 1899, "La Liga");
		Club club4 = new ItalianClub("Juventus F.C.", "Italy", 1897, "Serie A");
		Club club5 = new FrenchClub("Paris Saint-Germain F.C.", "France", 1970, "Ligue 1");
		Club club6 = new EnglishClub("Wolverhampton Wanderers F.C.", "England", 1877, "Championship");
		Club club7 = new GermanClub("Fortuna Düsseldorf", "Germany", 1895, "2. Bundesliga");
		Club club8 = new SpanishClub("Rayo Vallecano", "Spain", 1924, "Segunda División");
		Club club9 = new ItalianClub("Empoli F.C.", "Italy", 1920, "Serie B");
		Club club10 = new FrenchClub("Stade de Reims", "France", 1931, "Ligue 2");
		
		getClub(club1);
		getClub(club2);
		getClub(club3);
		getClub(club4);
		getClub(club5);
		getClub(club6);
		getClub(club7);
		getClub(club8);
		getClub(club9);
		getClub(club10);
	}
	
	public static void getClub(Club club) {
		club.getName();
		club.getCountry();
		club.getEstYear();
		club.getLeague();
	}

}
