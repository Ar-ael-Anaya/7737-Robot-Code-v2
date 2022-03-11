// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;

public class ArmValueUpdater extends CommandBase {
  /** Creates a new ArmValueUpdater. */
  public ArmValueUpdater() {
    addRequirements(Robot.m_arm);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    
      if(!(Constants.ArmValues.armUp)){
        Constants.ArmValues.lastBurstTime = Robot.m_armSystem.time;
        Constants.ArmValues.armUp = true;
      }
      else if(Constants.ArmValues.armUp){
        Constants.ArmValues.lastBurstTime = Robot.m_armSystem.time;
        Constants.ArmValues.armUp = false;
      }  
    }
 
  @Override
  public void end(boolean interrupted) {}

 
  @Override
  public boolean isFinished() {
    return false;
  }
}
