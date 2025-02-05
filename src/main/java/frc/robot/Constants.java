// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import java.net.http.HttpResponse.PushPromiseHandler;

import edu.wpi.first.wpilibj.PneumaticsModuleType;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class driveConstants {

    public static final int kDriverControllerPort = 0;

    public static final int leftMotorRear = 1;
    public static final int rightMotorRear = 14;
    public static final int leftMotorFront = 2;
    public static final int rightMotorFront = 13;

    public static final boolean invertLeftMotorRear = true;
    public static final boolean invertRightMotorRear = false;
    public static final boolean invertLeftMotorFront = true;
    public static final boolean invertRightMotorFront = false;

    public static final PneumaticsModuleType PCM = PneumaticsModuleType.CTREPCM;
    public static final int leftLowSol = 1;
    public static final int leftHighSol = 6;
    public static final int rightLowSol = 0;
    public static final int rightHighSol = 7;

    public static final int leftEncoderChanA = 0;
    public static final int leftEncoderChanB = 1;
    public static final int rightEncoderChanA = 2;
    public static final int rightEncoderChanB = 3;

  }

  public static final class joyStcikConstants {
    public static final int stickPort = 0;
    public static final int y_Axis = 1;
    public static final int x_Axis = 0;
    public static final int rotate = 2;
    public static final int slider = 3;
    public static final int trigger = 1;
    public static final int changeGear = 3;
    public static final int fuelCellSol = 4;
  }




}

