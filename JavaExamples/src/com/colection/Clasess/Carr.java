package com.colection.Clasess;

public class Carr implements CarrInterface {
	
	private String type;
	private String color;
	private int model;
	private int doors;
	private int currantspeed;
	private int maxspeed;
	private int cost;
	
	Carr (String type, String color, int model, int doors, int currantspeed, int maxspeed, int cost){
	
	this.type = type;
	this.color = color;
	this.model = model;
	this.doors = doors;
	this.currantspeed = currantspeed;
	this.maxspeed = maxspeed;
	this.cost = cost;
	
	}

	public int getCurrantspeed() {
		return currantspeed;
	}

	public void setCurrantspeed(int currantspeed) {
		this.currantspeed = currantspeed;
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

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public String info () {
		
		String discription = "Car: " + type + "\nColor: " + color + "\nModel: " + model + 
							"\nDoors: " + doors + "\nCurrant Speed: " + currantspeed + 
							"\nMax speed: " + maxspeed  + " km/h"+ "\nCost: " + cost + " krk";
		return discription;
	}
	@Override
	public void engineStart() {
		System.out.println("wroooooo....");
		
	}
	@Override
	public void engineStop() {
		System.out.println("grrrrr....ssss");
		
	}
	@Override
	public void moveForward() {
		System.out.println("Car is moving forward");
		
	}
	@Override
	public void moveBack() {
		System.out.println("Car is moving back");
		
	}
	@Override
	public void turnLeft() {
		System.out.println("Car is turning left");
		
	}
	@Override
	public void turnRight() {
		System.out.println("Car is turning right");
		
	}
	@Override
	public void indicateRight() {
		System.out.println("click...click...click .... right light");
		
	}
	@Override
	public void indicateLeft() {
		System.out.println("click...click...click .... left light");
		
	}
	@Override
	public void increaseSpeed(int speed) {
		
		if ((currantspeed + speed) <= maxspeed) {
			currantspeed += speed;
		}
		
		
	}
	@Override
	public void decreaseSpeed(int speed) {
		
		if ((currantspeed - speed) <= 0) {
			currantspeed = 0;
		}
		else {
		currantspeed -= speed;
		}
	}
	

}
