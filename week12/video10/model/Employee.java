package week12.video10.model;

import java.util.Calendar;

public class Employee {

	private int id;
	private String icNumber;
	private String name;
	private double salary;
	private Calendar startDate;
	
	public Employee(int id, String icNumber, String name, double salary, Calendar startDate) {
		super();
		this.id = id;
		this.icNumber = icNumber;
		this.name = name;
		this.salary = salary;
		this.startDate = startDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIcNumber() {
		return icNumber;
	}

	public void setIcNumber(String icNumber) {
		this.icNumber = icNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Calendar getStartDate() {
		return startDate;
	}

	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}
	
}
