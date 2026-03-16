// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.team9140.frc2026;

import org.team9140.frc2026.commands.AutonomousRoutines;
import org.team9140.frc2026.generated.TunerConstants;
import org.team9140.frc2026.subsystems.CommandSwerveDrivetrain;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class RobotContainer {
  private final CommandSwerveDrivetrain drivetrain = TunerConstants.createDrivetrain();
  private final CommandXboxController controller = new CommandXboxController(0);
  private final SwerveTelemetry logger = new SwerveTelemetry(drivetrain, Constants.Drive.MAX_TELEOP_VELOCITY);
  private final AutonomousRoutines autoRoutines;
  private final Command driveCommand;

  public RobotContainer() {
    driveCommand = drivetrain.teleopDrive(controller::getLeftX, controller::getLeftY,
        controller::getRightX);

    configureBindings();

    autoRoutines = AutonomousRoutines.getInstance(drivetrain);
  }

  private void configureBindings() {  
    drivetrain.setDefaultCommand(driveCommand);
    this.drivetrain.registerTelemetry(logger::telemeterize);
    this.controller.a().onTrue(drivetrain.reset());
  }

  Command autonomousRoutine = null;

  public Command getAutonomousCommand() {
    return autoRoutines.getCommand();
  }
}