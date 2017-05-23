package RooMateServices.adv_filters_service;

public class Filters {
	
	private Plec plec;
	
	int minAge;
	int maxAge;
	
	double minRoomPrice;
	double maxRoomPrice;
	
	private Preference smoking;
	
	private Preference animals;
	
	private Czestosc party;
	
	private Czestosc alkohol;
	
	private String district;

	
	public Filters(Plec plec, int minAge, int maxAge, double minRoomPrice, double maxRoomPrice, Preference smoking,
			Preference animals, Czestosc party, Czestosc alkohol, String district) {
		super();
		this.plec = plec;
		this.minAge = minAge;
		this.maxAge = maxAge;
		this.minRoomPrice = minRoomPrice;
		this.maxRoomPrice = maxRoomPrice;
		this.smoking = smoking;
		this.animals = animals;
		this.party = party;
		this.alkohol = alkohol; 
		this.district = district;
	}
	
	public Filters(){
		this.plec = Plec.doesntMatter;
		this.minAge = 0;
		this.maxAge = 100;
		this.minRoomPrice = 0;
		this.maxRoomPrice = 10000;
		this.smoking = Preference.doesntMatter;
		this.animals = Preference.doesntMatter;
		this.party = null;
		this.alkohol = null; 
		this.district = null;
	}

	public Plec getPlec() {
		return plec;
	}

	public void setPlec(Plec plec) {
		this.plec = plec;
	}

	public int getMinAge() {
		return minAge;
	}

	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	public double getMinRoomPrice() {
		return minRoomPrice;
	}

	public void setMinRoomPrice(double minRoomPrice) {
		this.minRoomPrice = minRoomPrice;
	}

	public double getMaxRoomPrice() {
		return maxRoomPrice;
	}

	public void setMaxRoomPrice(double maxRoomPrice) {
		this.maxRoomPrice = maxRoomPrice;
	}

	public Preference getSmoking() {
		return smoking;
	}

	public void setSmoking(Preference smoking) {
		this.smoking = smoking;
	}

	public Preference getAnimals() {
		return animals;
	}

	public void setAnimals(Preference animals) {
		this.animals = animals;
	}

	public Czestosc getParty() {
		return party;
	}

	public void setParty(Czestosc party) {
		this.party = party;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Czestosc getAlkohol() {
		return alkohol;
	}

	public void setAlkohol(Czestosc alkohol) {
		this.alkohol = alkohol;
	}
	
	
	
}
