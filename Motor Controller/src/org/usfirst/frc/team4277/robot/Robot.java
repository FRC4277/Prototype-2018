/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4277.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;

/**
 * This sample program shows how to control a motor using a joystick. In the
 * operator control part of the program, the joystick is read and the value is
 * written to the motor.
 *
 * <p>Joystick analog values range from -1 to 1 and speed controller inputs also
 * range from -1 to 1 making it easy to work together.
 * Comment change
 */
public class Robot extends IterativeRobot {
	private static final int leftTopPort = 0;
	private static final int rightTopPort = 1;
	private static final int leftBackPort = 2;
	private static final int rightBackPort = 3;
	private static final int joystickPort = 0;

	private SpeedController leftTopMotor;
	private SpeedController rightTopMotor;
	private SpeedController leftBackMotor;
	private SpeedController rightBackMotor;
	private Joystick joyStick;

	@Override
	public void robotInit() {
		leftTopMotor = new Talon(leftTopPort);
		rightTopMotor = new Victor(rightTopPort);
		leftBackMotor = new Talon(leftBackPort);
		rightBackMotor = new Victor(rightBackPort);
		joyStick = new Joystick(joystickPort);
	}

	@Override
	public void teleopPeriodic() {
		double joystickValue = joyStick.getY();
		System.out.println(joystickValue);
		leftTopMotor.set(joystickValue);
		rightTopMotor.set(-joystickValue);
		leftBackMotor.set(joystickValue);
		rightBackMotor.set(-joystickValue);
		
		
	}
}
