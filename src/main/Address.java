package main;

public class Address {
	
	private int plot;
	private String city;
	
	public Address(int plot, String city) {
		super();
		this.plot = plot;
		this.city = city;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public int getPlot() {
		return plot;
	}

	public void setPlot(int plot) {
		this.plot = plot;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [plot=" + plot + ", city=" + city + "]";
	}
	
	

}
