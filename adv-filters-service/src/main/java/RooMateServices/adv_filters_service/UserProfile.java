package RooMateServices.adv_filters_service;

public class UserProfile {
	
	private int id;
	private String name;
	private String surname;
	private int age;
	private int phone;
	private String address;
	private String email;
	private String nationality;
	private String plec;
	private String aboutMe;
	
	public UserProfile(int id, String name, String surname, int age, int phone, String address, String email,
			String nationality, String plec, String aboutMe) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.nationality = nationality;
		this.plec = plec;
		this.aboutMe = aboutMe;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPlec() {
		return plec;
	}

	public void setPlec(String plec) {
		this.plec = plec;
	}

	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}
	
	
	
	
}
