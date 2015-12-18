package org.robockets.robotswitcher;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Switcher {
	public int currentRobot;
	
	public Switcher() {
		currentRobot = getRobot();
	}
	
	public int getRobot() {
		currentRobot = (int) SmartDashboard.getNumber("RobotNumber");
		return currentRobot;
	}
	
	public void initRobotNumber() {
		SmartDashboard.putNumber("RobotNumber", 0); //TEMP
	}	
	
}
