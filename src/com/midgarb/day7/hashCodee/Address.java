package com.midgarb.day7.hashCodee;

public class Address {
	private String city;
	private String street;
	private int house;

	public Address(String city,String street,int house){
		if(city == null || street==null || house == 0){
			throw new IllegalStateException("Parametres should not containts null");
		}
		this.city = city;
		this.house = house;
		this.street = street;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Address){
			Address a = (Address)obj;
			if(city.equals(a.getCity()) && street.equals(a.getStreet()) && house == a.getHouse()){
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int result = 25;
		result = 37*result +city.hashCode();
		result = 37*result + street.hashCode();
		result = 37*result + house;
		return result;
	}
	public String getCity() {
		return city;
	}
	public String getStreet() {
		return street;
	}
	public int getHouse() {
		return house;
	}

}
