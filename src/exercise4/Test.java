package exercise4;

public class Test {

	public static void main(String[] args) {
		Club club1 = new EnglishClub("Manchester City F.C.", "England", 1880, "Premier League");
		Club club2 = new GermanClub("FC Bayern München", "Germany", 1900, "Bundesliga");
		Club club3 = new SpanishClub("FC Barcelona", "Spain", 1899, "La Liga");
		Club club4 = new ItalianClub("Juventus F.C.", "Italy", 1897, "Serie A");
		Club club5 = new FrenchClub("Paris Saint-Germain F.C.", "France", 1970, "Ligue 1");
		Club club6 = new PortugueseClub("FC Porto", "Portugal", 1893, "Primeira Liga");
		Club club7 = new RussianClub("FC Lokomotiv Moskva", "Russia", 1923, "Russian Premier League");
		Club club8 = new UkrainianClub("FC Shakhtar Donetsk", "Ukraine", 1936, "Ukrainian Premier League");
		Club club9 = new BelgianClub("Club Brugge KV", "Belgium", 1891, "Belgian First Division A");
		Club club10 = new SwissClub("BSC Young Boys", "Switzerland", 1898, "Swiss Super League");
		Club club11 = new EnglishClub("Wolverhampton Wanderers F.C.", "England", 1877, "Championship");
		Club club12 = new GermanClub("Fortuna Düsseldorf", "Germany", 1895, "2. Bundesliga");
		Club club13 = new SpanishClub("Rayo Vallecano", "Spain", 1924, "Segunda División");
		Club club14 = new ItalianClub("Empoli F.C.", "Italy", 1920, "Serie B");
		Club club15 = new FrenchClub("Stade de Reims", "France", 1931, "Ligue 2");
		Club club16 = new PortugueseClub("C.D. Nacional", "Portugal", 1910, "LigaPro");
		Club club17 = new RussianClub("FC Orenburg", "Russia", 1974, "Russian FNL");
		Club club18 = new UkrainianClub("FC Poltava", "Ukraine", 2007, "Ukrainian First League");
		Club club19 = new BelgianClub("Cercle Brugge K.S.V.", "Belgium", 1899, "Belgian First Division B");
		Club club20 = new SwissClub("Neuchâtel Xamax", "Switzerland", 1912, "Swiss Challenge League");
		
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
		getClub(club11);
		getClub(club12);
		getClub(club13);
		getClub(club14);
		getClub(club15);
		getClub(club16);
		getClub(club17);
		getClub(club18);
		getClub(club19);
		getClub(club20);
	}
	
	public static void getClub(Club club) {
		club.getName();
		club.getCountry();
		club.getEstYear();
		club.getLeague();
	}

}
