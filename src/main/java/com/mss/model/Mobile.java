package com.mss.model;

import java.util.List;

public class Mobile {

	private String brand;
	private String model;
	private List<String> features;
	public Mobile(String brand, String model, List<String> features) {
		super();
		this.brand = brand;
		this.model = model;
		this.features = features;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public List<String> getFeatures() {
		return features;
	}
	public void setFeatures(List<String> features) {
		this.features = features;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", model=" + model + ", features=" + features + "]";
	}
}
