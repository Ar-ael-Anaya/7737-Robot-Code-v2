// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Shooter extends SubsystemBase {
  private PWMSparkMax topLeft = new PWMSparkMax(Constants.Motors.ShooterMotors.m_topLeft);
  private PWMSparkMax topRight = new PWMSparkMax(Constants.Motors.ShooterMotors.m_topRight);

  
  public Shooter() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void setMotorSpeed(double axis){
    topLeft.set(axis * Constants.m_limiter);
    topRight.set(axis * Constants.m_limiter);
  }

}
