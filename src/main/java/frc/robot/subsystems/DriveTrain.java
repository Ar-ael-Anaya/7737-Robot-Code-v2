// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Robot;
import frc.robot.commands.MecanumDriver;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;

public class DriveTrain extends SubsystemBase {
  private PWMVictorSPX frontLeft = new PWMVictorSPX(Constants.Motors.DriveMotors.m_frontleft);
  private PWMVictorSPX reafLeft = new PWMVictorSPX(Constants.Motors.DriveMotors.m_rearleft);
  private PWMVictorSPX frontRight = new PWMVictorSPX(Constants.Motors.DriveMotors.m_frontRight);
  private PWMVictorSPX rearRight = new PWMVictorSPX(Constants.Motors.DriveMotors.m_rearRight);
  
  /** Creates a new DriveTrain. */
  public DriveTrain() {
    Robot.m_robotDrive = new MecanumDrive(frontLeft, reafLeft, frontRight, rearRight);
   // setDefaultCommand(new MecanumDriver());
  }

  @Override
  public void periodic() {
    
  }

  public void setMotorSpeed(double xAxis, double yAxis, double  zAxis){
    Robot.m_robotDrive.driveCartesian(xAxis, yAxis, zAxis, 0.0);
  }

  
 
}
