package com.java.patterns;

import java.util.Scanner;

//Choose from more than 1 child class based on an argument
//when before-hand we don't know which class object we need.

public class FactoryPatternDemo {

	public static void main(String args[]) {
		System.out.println("Enter name of ship");
		Scanner sc = new Scanner(System.in);
		EnemyShip es = null;
		if(sc.hasNextLine())
			 es= EnemyShipFactory.getEnemyShip(sc.nextLine());
es.enemyShipShoots();
	}

}

abstract class EnemyShip {
	String name;
	double amtDamage;

	void followHeroShip() {
		System.out.println(name + " is follwing hero");
	}

	void enemyShipShoots() {
		System.out.println(name + " does damage and shoots " + amtDamage);
	}

	void setDamage(double amtDamage) {
		this.amtDamage = amtDamage;
	}

	double getDamage() {
		return amtDamage;
	}


}

class UFOEnemyShip extends EnemyShip {

	UFOEnemyShip(){
		this.name = "UFO";

	}

}

class RocketEnemyShip extends EnemyShip {

	RocketEnemyShip() {
		this.name = "Rocket";

	}

}

class EnemyShipFactory {
	EnemyShip ship;

	public static EnemyShip getEnemyShip(String name) {
		if (name.equalsIgnoreCase("ufo")) {
			return new UFOEnemyShip();
		} else {
			return new RocketEnemyShip();
		}
	}
}