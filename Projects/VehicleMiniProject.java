package com.digit.javaTraining.Projects;

class vehicle {
	private String name;
	private int currentSpeed;
	private int currentDirection;

	vehicle(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.currentSpeed = 0;
		this.currentDirection = 0;
	}

	public void steer(int direction) {
		this.currentDirection += direction;
		System.out.println("the current direction is" + currentDirection + "degree");
	}

	void move(int direction, int speed) {
		currentSpeed = speed;
		currentDirection = direction;

		System.out
				.println("move method called : moving at speed  " + currentSpeed + " is direction " + currentDirection);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public int getCurrentDirection() {
		return currentDirection;
	}

	public void setCurrentDirection(int currentDirection) {
		this.currentDirection = currentDirection;
	}

	public void stop() {
		this.currentSpeed = 0;
		System.out.println("Vehicle is stopped.....");
	}
}

class car extends vehicle {

	private int gear;
	private int door;
	private boolean isManual;
	private String type;
	private int currentGear;

	public car(String name, int gear, int door, boolean isManual, String type) {
		super(name);
		this.gear = gear;
		this.door = door;
		this.isManual = isManual;
		this.type = type;
		currentGear = 1;
	}

	void changeGear(int newGear) {
		this.currentGear = newGear;
		System.out.println("change gear is " + this.currentGear + " Gear");
	}

	void changeSpeed(int newSpeed, int newDirection) {
		move(newSpeed, newDirection);
		System.out.println("change gear method is called change to " + newSpeed + " direction is " + newDirection);
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public boolean isManual() {
		return isManual;
	}

	public void setManual(boolean isManual) {
		this.isManual = isManual;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCurrentGear() {
		return currentGear;
	}

	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
	}

}

class suv extends car {

	public suv(String name, boolean isManual) {
		super(name, 5, 6, isManual, "suv");
	}

	void accelerate(int rate) {
		int newSpeed = getCurrentSpeed() + rate;

		if (newSpeed == 0) {
			stop();
			changeGear(1);
		} else if (newSpeed > 0 && newSpeed <= 10) {
			changeGear(1);
		} else if (newSpeed > 10 && newSpeed <= 20) {
			changeGear(2);
		} else if (newSpeed > 20 && newSpeed <= 30) {
			changeGear(3);
		} else if (newSpeed > 30 && newSpeed <= 50) {
			changeGear(4);
		} else if (newSpeed > 50 && newSpeed <= 700) {
			changeGear(5);
		} else {
			changeGear(6);
		}

		if (newSpeed > 0) {
			changeSpeed(newSpeed, getCurrentDirection());
		}
	}
}

public class VehicleMiniProject {
	public static void main(String[] args) {
		suv fortuner = new suv("fortuner", false);
		fortuner.move(0, 40);
//	fortuner.accelerate(20);
		fortuner.accelerate(0);

		System.out.println("Current gear " + fortuner.getCurrentGear());
		System.out.println("Current speed " + fortuner.getCurrentSpeed());

//	suv fortuner2 = new suv("fortuner",false);
//	fortuner2.move(0, 80);
	}
}
