/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    interface Drivetrain {
        interface Ports {
            int LEFT_TOP_MOTOR = 2;
            int LEFT_MIDDLE_MOTOR = 3;
            int LEFT_BOTTOM_MOTOR = 1;
        
            int RIGHT_TOP_MOTOR = 6;
            int RIGHT_MIDDLE_MOTOR = 7;
            int RIGHT_BOTTOM_MOTOR = 5;
        
            int GEAR_SHIFT = 0;
        }

        interface Encoder {
            int LEFT_CHANNEL_A = 2;
            int LEFT_CHANNEL_B = 3;
        
            int RIGHT_CHANNEL_A = 0;
            int RIGHT_CHANNEL_B = 1;
        }

        interface Motor {
            double WHEEL_DIAMETER = 6;
            double WHEEL_INCHES_PER_REVOLUTION = WHEEL_DIAMETER * Math.PI;

            double NEO_ENCODER_EMPIRICAL_MULTIPLIER = 1;
            double NEO_ENCODER_RAW_MULTIPLIER = WHEEL_INCHES_PER_REVOLUTION * NEO_ENCODER_EMPIRICAL_MULTIPLIER;

            double RAMP_RATE = 0.3;
        }

        interface Greyhill {
            double PULSES_PER_REVOLUTION = 256 * 4.0;
            double OUTER_GEAR_RATIO = 24.0 / 60.0;
            double ENCODER_EMPIRICAL_MULTIPLIER = 1.3;
            double INCHES_PER_PULSE = ((Motor.WHEEL_INCHES_PER_REVOLUTION * Motor.DRIVETRAIN_OUTER_GEAR_RATIO) / PULSES_PER_REVOLUTION) * ENCODER_EMPIRICAL_MULTIPLIER;

            int CURRENT_LIMIT = 65;
        }

        interface Command {        // Prints Information to Smartdashboard
            boolean SMARTDASHBOARD_DEBUG = true;
    
            interface Pipeline {
                int DRIVER = 0;
                int CV = 1;
            }
        
            interface CV { 
            }
    
            interface TurnSpeed {
                // Max speed robot should turn
                // Every value after this is effectivly 
                // multiplied by this value
                double MAX = 2.0 / 3.0;
    
                // Speed at which robot moves during nudging
                double NUDGE = 1.0/3.0;
            }
    
            interface QuickTurn {
                // Speed at which curvature drive enables quick turn
                double THRESHOLD = 0.04;
    
                // Speed at which drivetrain turns when using quick turn
                double SPEED = 2.0/3.0;
            }
    
            // What percent that quickturn speeds up (Higher = Slower)
            interface SmoothTurn {
                // Enables or Disables "Smooth Turn"
                boolean ENABLED = false;
    
                double ACCEL = 36;
                double DECEL = 2;
            }
    
            interface Controls {
                // Scaling joysticks and triggers using exponents
                int JOYSTICK_SCALAR = 3;
                int TRIGGER_SCALAR = 2;
            }
        }
    }
}
