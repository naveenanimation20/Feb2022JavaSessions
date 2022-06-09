package ConstructorConcept;

public class Company {

	String name;
	String hq;
	int empCount;
	boolean isActive;
	double sharePrice;

	public Company(String name, String hq) {
		this.name = name;
		this.hq = hq;
	}

	public Company(String name, String hq, int empCount) {
		this.name = name;
		this.hq = hq;
		this.empCount = empCount;
	}

	public Company(String name, double sharePrice) {
		this.name = name;
		this.sharePrice = sharePrice;
	}

	public Company(String name, String hq, int empCount, boolean isActive, double sharePrice) {
		this.name = name;
		this.hq = hq;
		this.empCount = empCount;
		this.isActive = isActive;
		this.sharePrice = sharePrice;
	}

}
