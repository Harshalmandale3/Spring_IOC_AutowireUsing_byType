package main;

public class Student {
	
	private int roll;
	private String name;
	private Address address;
	
	public Student() {
		super();
		
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}


	public Student(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Student(Address address) {
		super();
		this.address = address;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public Student(int roll) {
		super();
		this.roll = roll;
	}

	public Student(int roll, String name, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}

}
