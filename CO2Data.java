//package model;

public class CO2Data {
	private String country;
	private int year;
	private double emission;
	
	public CO2Data(String country, int year, double emission) {
		this.country = country;
		this.year = year;
		this.emission = emission;
	}
	
	public String getCountry() {
		return country;
	}
	
	public int getYear() {
		return year;
	}
	
	public double getEmission() {
		return emission;
	}
	

}
