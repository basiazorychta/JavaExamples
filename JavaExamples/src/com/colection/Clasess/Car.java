package com.colection.Clasess;

public class Car {
	
	private String type;
	private String color;
	private int model;
	private int maxSpeed;
	private int numbersDoors;
	private int cost;
	
	Car (String _type, String _color, int _model, int _maxSpeed, int _numbersDoors, int _cost){
		
		type = _type;
		color = _color;
		model = _model;
		maxSpeed = _maxSpeed;
		numbersDoors = _numbersDoors;
		cost = _cost;
	}
	
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getNumbersDoors() {
		return numbersDoors;
	}
	public void setNumbersDoors(int numbersDoors) {
		this.numbersDoors = numbersDoors;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public String info () {
		String description = "For seeling : Type :" + type + ", Model " + model + ", Color: " + color  
				+ ", " + numbersDoors + " doors, max speed:" + maxSpeed + ". Cost : " + cost + " kr.";
		return description;
	}
	

}
