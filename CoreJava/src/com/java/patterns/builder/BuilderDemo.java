package com.java.patterns.builder;
//Want to create objects from bunch of other objects and object creation must be independent of main object
public class BuilderDemo {

	public static void main(String[] args) {
		RobotEngineer eng= new RobotEngineer(new MyRobotBuilder());
		Robot robot=eng.buildRobot();
		System.out.println(robot.getArms());
		

	}

}
