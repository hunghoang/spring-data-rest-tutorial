package com.standford;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Staff {

	
	@Id
	@SequenceGenerator(name="seq-gen",sequenceName="staff_seq", initialValue=205, allocationSize=1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq-gen")
	private long staffId;
	private String lastName;
	private String firstName;
	
	private long departmentId;

	public Staff() {

	}

	public Staff(String firstName, String lastName, long departmentId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.departmentId = departmentId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "staffId = " + staffId + ", firstname = " + firstName + ", lastname = " + lastName + ", departmentId = " + departmentId;
	}

	public long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

}
