/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
  
  
    TalonSRX leftFrontTalon = null;
    TalonSRX leftBackTalon = null;
    TalonSRX rightFrontTalon = null;
    TalonSRX rightBackTalon = null;

    DifferentialDrive differentialDrive = null;

  public Drivetrain() {

    leftFrontTalon = new TalonSRX(Constants.DRIVETRAIN_LEFT_FRONT_TALON);
    leftBackTalon = new TalonSRX(Constants.DRIVETRAIN_LEFT_BACK_TALON);
    rightFrontTalon = new TalonSRX(Constants.DRIVETRAIN_RIGHT_FRONT_TALON);
    rightBackTalon = new TalonSRX(Constants.DRIVETRAIN_RIGHT_BACK_TALON);

    SpeedControllerGroup leftMotors = new SpeedControllerGroup(leftFrontTalon, leftBackTalon);
    SpeedControllerGroup rightMotors = new SpeedControllerGroup(rightFrontTalon, rightBackTalon);

    differentialDrive = new DifferentialDrive(leftMotors, rightMotors);
 }
  public void tankDrive(double moveSpeed, double rotateSpeed) {
    differentialDrive.tankDrive(moveSpeed, rotateSpeed);
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
