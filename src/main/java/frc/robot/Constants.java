/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.subsystems.Drivetrain;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public class Constants {
	
	//Talons
	public static final int DRIVETRAIN_LEFT_FRONT_TALON = 0;
	public static final int DRIVETRAIN_LEFT_BACK_TALON = 1;
	public static final int DRIVETRAIN_RIGHT_FRONT_TALON = 2;
	public static final int DRIVETRAIN_RIGHT_BACK_TALON = 3;

	//public static final int Robot_ = 0;
	//public static int java;

	//Joystick
	public static final int RobotContainer_DRIVER_CONTROLLER = 0;
	public static final String DRIVER_cONTROLLER_ROTATE_AXIS = null;
	public static final String DRIVER_CONTROLLER_MORVE_AXIS = null;

	public class Robot extends TimedRobot {

		public static Drivetrain m_drivetrain = null;
		public static RobotContainer m_RobotContainer;
	
	@Override
		public void robotInit() {
			m_drivetrain = new Drivetrain();
			m_RobotContainer = new RobotContainer();
			
			//m_chooser.addDefault("Default Auto", New ExampleCommand());
			//SmartDashboard.putData("Auto mode", m_chooser);
		}
	}
}

