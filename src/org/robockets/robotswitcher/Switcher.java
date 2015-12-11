package org.robockets.robotswitcher;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Switcher {
	
	public int getRobot(){
		int currentRobot = SmartDashboard.getInt("RobotNumber");
		return currentRobot;
	}
	
	public void setRobotNumber(int robotNumber){
		
	}	
	
}
