package RooMateServices.adv_filters_service;

public class FlatProperties {
	private Address address;
	private int numberOfRooms;
	private int floor;
	private boolean balkon;
	private int surface;
	private boolean elevator; 
	private boolean parking;
	private boolean garden;
	private boolean guard;
	private int numberOfRoomMates;
	private int roomSurface;
	private int roomCaptivity;
	
	public FlatProperties(Address address, int numberOfRooms, int floor, boolean balkon, int surface, boolean elevator,
			boolean parking, boolean garden, boolean guard, int numberOfRoomMates, int roomSurface, int roomCaptivity) {
		super();
		this.address = address;
		this.numberOfRooms = numberOfRooms;
		this.floor = floor;
		this.balkon = balkon;
		this.surface = surface;
		this.elevator = elevator;
		this.parking = parking;
		this.garden = garden;
		this.guard = guard;
		this.numberOfRoomMates = numberOfRoomMates;
		this.roomSurface = roomSurface;
		this.roomCaptivity = roomCaptivity;
	}
	
	public FlatProperties() {
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public boolean isBalkon() {
		return balkon;
	}

	public void setBalkon(boolean balkon) {
		this.balkon = balkon;
	}

	public int getSurface() {
		return surface;
	}

	public void setSurface(int surface) {
		this.surface = surface;
	}

	public boolean isElevator() {
		return elevator;
	}

	public void setElevator(boolean elevator) {
		this.elevator = elevator;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public boolean isGarden() {
		return garden;
	}

	public void setGarden(boolean garden) {
		this.garden = garden;
	}

	public boolean isGuard() {
		return guard;
	}

	public void setGuard(boolean guard) {
		this.guard = guard;
	}

	public int getNumberOfRoomMates() {
		return numberOfRoomMates;
	}

	public void setNumberOfRoomMates(int numberOfRoomMates) {
		this.numberOfRoomMates = numberOfRoomMates;
	}

	public int getRoomSurface() {
		return roomSurface;
	}

	public void setRoomSurface(int roomSurface) {
		this.roomSurface = roomSurface;
	}

	public int getRoomCaptivity() {
		return roomCaptivity;
	}

	public void setRoomCaptivity(int roomCaptivity) {
		this.roomCaptivity = roomCaptivity;
	}
	
	
	
	
}
