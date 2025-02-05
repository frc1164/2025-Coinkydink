// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.driveConstants;
import frc.robot.Constants.fuelCellConstants;

/** Add your docs here. */
public class FuelCell extends SubsystemBase {
    private final Solenoid fuelCellRetract;
    private final Solenoid fuelCellExtend;


    public FuelCell() {
        fuelCellExtend = new Solenoid(driveConstants.PCM, fuelCellConstants.fuelCellSolenoidExtend);
        fuelCellRetract = new Solenoid(driveConstants.PCM, fuelCellConstants.fuelCellSolenoidRetract);

    }

    public void fuelCellRaise(boolean raise) {
        fuelCellExtend.set(raise);
        fuelCellRetract.set(!raise);

    }
        
    @Override
    public void periodic(){

    }

}
