// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.Chassis;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class Drive extends Command {
  private final Chassis subsystem;
  private final CommandXboxController controller;

  /** Creates a new Drive. */
  public Drive(Chassis m_Chassis, CommandXboxController drivecontroller) {
    subsystem = m_Chassis;
    addRequirements(subsystem);

    controller = drivecontroller;
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double forward = controller.getLeftY();
    double turn = controller.getRightX();

    forward = (Math.abs(forward) <= 0.1) ? 0 : forward;
    turn = (Math.abs(turn) <= 0.1) ? 0 : turn;

    double leftMSpeed = (forward - turn);
    double rightMSpeed = (forward + turn);

    subsystem.leftSpeed(leftMSpeed);
    subsystem.rightSpeed(rightMSpeed);
      

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
