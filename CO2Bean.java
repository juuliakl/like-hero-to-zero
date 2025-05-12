//package controller;

import jakarta.enterprise.context.RequestScoped;

import jakarta.inject.Named;
//import model.CO2Data;
import java.util.ArrayList;
import java.util.List;

@Named("cO2Bean")
@RequestScoped

public class CO2Bean {
	public String country;
	private List<CO2Data> dataList = new ArrayList<CO2Data>();

	public CO2Bean() {
	   
	}
   
	private CO2Data d = new CO2Data(country, 2022, 123.4);
	
	public void loadData() {
        dataList.clear();
        dataList.add(d);
    	}

    // Getter/Setter
    public String getCountry() { 
    	return country; 
    	}
    
    public void setCountry(String country) {
    	this.country = country; 
    	}
    
    public List<CO2Data> getDataList() {
    	return dataList; 
    	}
	

}