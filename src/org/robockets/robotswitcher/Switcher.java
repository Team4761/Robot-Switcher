package org.robockets.robotswitcher;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Switcher {
	
	public int getRobot(){
		int currentRobot = (int) SmartDashboard.getNumber("RobotNumber");
		return currentRobot;
	}
	
	public void initRobotNumber(){
		SmartDashboard.putNumber("RobotNumber", 0);
	}	
	
	public static void main(String[] args){
		
	}
	
}
