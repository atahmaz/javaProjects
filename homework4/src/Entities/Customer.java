package Entities;

import java.time.LocalDate;

public class Customer {
	public int id;
	public String firstName;
	public String lastName;
	public LocalDate dateOfBirth; 
	public Long nationatilyId;
	
	public Customer () {
		
	}
	
	public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, Long nationatilyId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationatilyId = nationatilyId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Long getNationatilyId() {
		return nationatilyId;
	}
	public void setNationatilyId(Long nationatilyId) {
		this.nationatilyId = nationatilyId;
	}
	

}
