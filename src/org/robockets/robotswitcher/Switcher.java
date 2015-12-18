package org.robockets.robotswitcher;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/** Used to get and initialize a SmartDashboard field for a robot number
 * 
 * 
 * @author Jake Backer
 * @version 	
v.1.sleepy.1.0.ocean.1450230474.7
 
 *
 *
 *
 *
 */
public class Switcher {
	
	/** Holds the value of the SmartDashboard field*/
	public int currentRobot;
	
	
	/** Initializes the currentRobot field*/
	public Switcher() {
		try{
		currentRobot = getRobot();
		}catch(DoesNotExistException e){
			e.printStackTrace();
		}
	}
	
	/**
	 * Stores the value of the field in SmartDashboard in currentRobot
	 * @return The value of currentRobot
	 * @throws DoesNotExistException Thrown if field on SmartDashboard does not exist
	 */
	public int getRobot() throws DoesNotExistException{
		currentRobot = (int) SmartDashboard.getNumber("RobotNumber");
		return currentRobot;
	}
	
	/** Initializes the field on SmartDashboard TEMPORARY*/
	public void initRobotNumber() {
		SmartDashboard.putNumber("RobotNumber", 0); //TEMP
	}	
	
}
