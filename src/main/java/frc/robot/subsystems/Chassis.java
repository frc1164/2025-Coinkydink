// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.driveConstants;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.Solenoid;






public class Chassis extends SubsystemBase {
  private VictorSPX leftFront, rightFront, leftBack, rightBack;
  private Solenoid leftHigh, leftLow, rightHigh, rightLow;
 






  /** Creates a new Chassis. */
  public Chassis() {
    leftFront = new VictorSPX(driveConstants.leftMotorFront);
    rightFront = new VictorSPX(driveConstants.rightMotorFront);
    leftBack = new VictorSPX(driveConstants.leftMotorRear);
    rightBack = new VictorSPX(driveConstants.rightMotorRear);

    leftHigh = new Solenoid(driveConstants.PCM, driveConstants.leftHighSol);
    leftLow = new Solenoid(driveConstants.PCM, driveConstants.leftLowSol);
    rightHigh = new Solenoid(driveConstants.PCM, driveConstants.rightHighSol);
    rightLow = new Solenoid(driveConstants.PCM, driveConstants.rightLowSol);

    leftFront.setInverted(driveConstants.invertLeftMotorFront);
    leftBack.setInverted(driveConstants.invertLeftMotorRear);
    rightFront.setInverted(driveConstants.invertRightMotorFront);
    rightBack.setInverted(driveConstants.invertRightMotorRear);


    leftBack.follow(leftFront);
    rightBack.follow(rightFront);
  }


  public void leftSpeed(double speed) {
    leftFront.set(ControlMode.PercentOutput, speed);

  }

  public void rightSpeed(double speed) {
    rightFront.set(ControlMode.PercentOutput, speed);

  }

  public void changeGear(boolean isHigh) {
    leftLow.set(!isHigh);
    rightLow.set(!isHigh);
    leftHigh.set(isHigh);
    rightHigh.set(isHigh);
  }







  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
