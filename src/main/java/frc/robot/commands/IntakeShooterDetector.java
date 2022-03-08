// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;
import frc.robot.subsystems.Intake;

public class IntakeShooterDetector extends CommandBase {
  /** Creates a new IntakeShooterDetector. */
  public IntakeShooterDetector() {
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double leftTrigger = (Robot.m_robotContainer.GetDriverRawAxis(Constants.Controller.Joystick.m_leftTrigger)) * (Constants.m_limiter);
    double rightTrigger = (Robot.m_robotContainer.GetDriverRawAxis(Constants.Controller.Joystick.m_rightTrigger)) * (Constants.m_limiter);

    if (leftTrigger != 0){
      Robot.m_intake.setMotorSpeed(leftTrigger);
    }
    else if (rightTrigger != 0){
      Robot.m_shooter.setMotorSpeed(rightTrigger);
    }
    else{
      Robot.m_intake.setMotorSpeed(0);
      Robot.m_shooter.setMotorSpeed(0);
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
