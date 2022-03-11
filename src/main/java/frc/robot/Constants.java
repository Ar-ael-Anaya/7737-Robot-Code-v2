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
// values change depending on wiring
    public final class IntakeShooterMotors{
        public static final int m_intakeShooterMotor = 4;
    }

    public class ArmMotors{
        public static final int m_armMotor = 5;
    }
   
  }
  public  static class ArmValues{

    public  static double armHoldUp = 0.08;
    public  static double armHoldDown = 0.13;
    public  static double armTravel = 0.5;
  
    public  static double armTimeUp = 0.5;
    public static double armTimeDown = 0.35;  
    
    public static double lastBurstTime = 0;
  public static  boolean armUp = true;
    
         
} 
  
  
   public final class Autonomous{
        public static final double m_autonomousTime = 40;
}

   public final class Controller{

    public static final int m_controller = 0;
    
        public final class Buttons{
            public static final int m_xButton = 3;
            public static final int m_yButton = 4;
            public static final int m_aButton = 1;
            public static final int m_bButton = 2;
    }
      public final class Joystick{

       public static final int m_leftStickY = 1;
       public static final int m_leftStickX = 0;
       public static final int m_rightStickX = 4;

       //check value in driver station
       public static final int m_leftTrigger = 2; 
       public static final int m_rightTrigger = 3; 
       

    //public static final int m_rightStickY = 5;
  
    }
   }
  

    public static final double m_autonomousXSpeed = .25;

    public static final double m_autonomousYSpeed = .25;

    public static final double m_autonomousZSpeed = .25;

   

    

    public static final double m_limiter = .35;
}
