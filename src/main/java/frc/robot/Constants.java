// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

public final class Constants {
 public class Motors{
    public  class DriveMotors{
        public static final int m_frontleft = 0;
        public static final int m_rearleft = 1;
        public static final int m_frontRight = 2;
        public static final int m_rearRight = 3;
  
    }
/*
    public final class IntakeMotors{
        public static final int m_bottomFront = 0;
        public static final int m_bottomBack = 4;
    }

    public final class ShooterMotors{
        public static final int m_topLeft = 5;
        public static final int m_topRight = 3;
    } 
  */  
  }
  
   public final class Autonomous{
        public static final double m_autonomousTime = 1800;
}

   public final class Controller{

    public static final int m_controller = 0;

    public final class Joystick{

     public static final int m_leftStickY = 1;
     public static final int m_leftStickX = 0;
    
     public static final int m_rightStickX = 4;
    //public static final int m_rightStickY = 0;
   // public static final int m_rightStickZ = 0;
    }
   }
  

    public static final double m_autonomousXSpeed = .25;

    public static final double m_autonomousYSpeed = .25;

    public static final double m_autonomousZSpeed = .25;

   

    public final class Buttons{
        public static final int m_xButton = 0;
    }

    public static final double m_limiter = .5;
}
