// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
public class IntakeShooter extends SubsystemBase {
 PWMSparkMax intakeMotorOne = new PWMSparkMax(Constants.Motors.IntakeMotors.m_bottomLeft);
 PWMSparkMax intakeMotorTwo = new PWMSparkMax(Constants.Motors.IntakeMotors.m_bottomRight);
  public IntakeShooter() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void setIntakeShooterMotorSpeed(double axis){
    intakeMotorOne.set(axis);
    intakeMotorTwo.set(axis);
  }
  

}

