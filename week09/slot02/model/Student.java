package week09.slot02.model;

public class Student {

	// Inside Plain Old Java Class (POJO)
	// 	Instance Variables
	// 	Constructors
	// 	Getter and Setter Methods
	
	private String id, firstName, lastName, icNumber, icColour, gender;
	private boolean active;
	
	public Student(String id, String firstName, String lastName, String icNumber, String icColour, String gender,
			boolean active) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.icNumber = icNumber;
		this.icColour = icColour;
		this.gender = gender;
		this.active = active;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIcNumber() {
		return icNumber;
	}

	public void setIcNumber(String icNumber) {
		this.icNumber = icNumber;
	}

	public String getIcColour() {
		return icColour;
	}

	public void setIcColour(String icColour) {
		this.icColour = icColour;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return id + ", " + firstName + ", " + lastName;
	}
	
}
