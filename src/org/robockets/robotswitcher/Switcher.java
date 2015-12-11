package org.robockets.robotswitcher;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Switcher {
	
	@SuppressWarnings("deprecation")
	public int getRobot(){
		int currentRobot = SmartDashboard.getInt("RobotNumber");
		return currentRobot;
	}
	
	@SuppressWarnings("deprecation")
	public void initRobotNumber(){
		SmartDashboard.putInt("RobotNumber", 0);
	}	
	
}
