package RooMateServices.adv_filters_service;

public class UserPreferences {

	private Preference smoking;
	
	private Preference animals;
	
	private Czestosc party;
	
	private Czestosc alkohol;

	
	
	public UserPreferences(Preference smoking, Preference animals, Czestosc party, Czestosc alkohol) {
		super();
		this.smoking = smoking;
		this.animals = animals;
		this.party = party;
		this.alkohol = alkohol;
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

	public Czestosc getAlkohol() {
		return alkohol;
	}

	public void setAlkohol(Czestosc alkohol) {
		this.alkohol = alkohol;
	}
	
	
	
}
