package sprin;

public class Address {

	
	//street, city, state, zip, country
	private String street;
	private String city;
	private String state;
	private String country;
	private int zip;
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}
	public int getZip() {
		return zip;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", country=" + country + ", zip="
				+ zip + "]";
	}
	 
	
	
	
	
}
