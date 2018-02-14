package com.java.patterns.builder;

public interface RobotBuilder {

	RobotBuilder buildHead();
	RobotBuilder buildTorso();
	RobotBuilder buildArms();
	RobotBuilder buildLegs();
	Robot getRobot();
}

class MyRobotBuilder implements RobotBuilder{
	
	private Robot robot;
	
	MyRobotBuilder(){
		robot= new Robot();
	}

	@Override
	public RobotBuilder buildHead() {
		robot.setHead(1);
		return this;
	}

	@Override
	public RobotBuilder buildTorso() {
		robot.setTorso(1);
		return this;
	}

	@Override
	public RobotBuilder buildArms() {
		robot.setArms(2);
		return this;
	}

	@Override
	public RobotBuilder buildLegs() {
		robot.setLegs(2);
		return this;
	}

	

	@Override
	public Robot getRobot() {
		return robot;
	}
	
	
	
}

class RobotEngineer{
	
	RobotBuilder builder;
	
	RobotEngineer(RobotBuilder builder){
		this.builder= builder;
	}
public Robot buildRobot() {
		
		return builder.buildArms().buildHead().buildLegs().buildTorso().getRobot();
	
	}
}