// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;

public class ArmSystem extends CommandBase {

  public double lastBurstTime = 0;
  public  boolean armUp = true; 
  //Arm initialized to up because that's how it would start a match
  /** Creates a new ArmSystem. */
  public ArmSystem() {
   addRequirements(Robot.m_arm);
  }

  @Override
  public void initialize() {}

  
  @Override
  public void execute() {

    if(armUp){
      if(Timer.getFPGATimestamp() - lastBurstTime < Constants.ArmValues.armTimeUp){
        Robot.m_arm.setArmMotorSpeed(Constants.ArmValues.armTimeUp);
      }
      else{
        Robot.m_arm.setArmMotorSpeed(Constants.ArmValues.armHoldUp);
      }
    }
    else{
      if(Timer.getFPGATimestamp() - lastBurstTime < Constants.ArmValues.armTimeDown){
        Robot.m_arm.setArmMotorSpeed(-(Constants.ArmValues.armTravel));
      }
      else{
        Robot.m_arm.setArmMotorSpeed(-(Constants.ArmValues.armHoldDown));
      }
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
