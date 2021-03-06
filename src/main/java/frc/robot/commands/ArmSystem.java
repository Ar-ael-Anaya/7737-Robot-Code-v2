// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class ArmSystem extends CommandBase {
 double time = Timer.getFPGATimestamp() ;


  public ArmSystem() {
   addRequirements(Robot.m_arm);
  }

  @Override
  public void initialize() {}

  
  @Override
  public void execute() {
      Robot.m_arm.ArmDetector(time);
    
    }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
