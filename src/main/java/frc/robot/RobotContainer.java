// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.Button; 
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Sequences.AutonomousSequence;
import frc.robot.commands.MecanumDriver;


public class RobotContainer {
  private final SendableChooser<Command> m_chooser = new SendableChooser<>();

  XboxController controller = new XboxController(Constants.Controller.m_controller);
  Button xButton = new JoystickButton(controller, Constants.Controller.Buttons.m_xButton);
  Button yButton = new JoystickButton(controller, Constants.Controller.Buttons.m_yButton);
  Button bButton = new JoystickButton(controller, Constants.Controller.Buttons.m_aButton);
  Button aButton = new JoystickButton(controller, Constants.Controller.Buttons.m_bButton);


  public double GetDriverRawAxis(int axis){
    return controller.getRawAxis(axis);
  }

  private void configureButtonBindings() {
    Robot.m_driveTrain.setDefaultCommand(new MecanumDriver());

    m_chooser.setDefaultOption("Run Forward", new AutonomousSequence());
    //m_chooser.addOption("Auto Routine Time", new AutonomousTime());
    SmartDashboard.putData(m_chooser);
  }
  public RobotContainer() {
    //xButton.whenPressed(new AutonomousSequence());
    // Configure the button bindings
    configureButtonBindings();
  }
  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
 
  public Command getAutonomousCommand() {
    //An ExampleCommand will run in autonomous
    return m_chooser.getSelected();
  }
  
}
