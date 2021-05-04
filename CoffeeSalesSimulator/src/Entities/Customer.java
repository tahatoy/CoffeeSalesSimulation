package Entities;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String identityNumber;
	private int starPoint;
	
	public Customer(int id, String firstName, String lastName, String identityNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
	}


	public Customer(int id, String firstName, String lastName, int starPoint,String identityNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.starPoint = starPoint;
		this.identityNumber=identityNumber;
	}
	
	
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getIdentityNumber() {
		return identityNumber;
	}
	public int getStarPoint() {
		return starPoint;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setStarPoint(int starPoint) {
		this.starPoint = starPoint;
	}
	public void setIdentityNumber(String identityNumber) {
		this.identityNumber=identityNumber;
	}

	
	
}
