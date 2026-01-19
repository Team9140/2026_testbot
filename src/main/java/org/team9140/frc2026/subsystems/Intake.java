package org.team9140.frc2026.subsystems;

import org.team9140.frc2026.Constants;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
    private static Intake instance;
    private final VictorSPX motor;

    private Intake() {
        this.motor = new VictorSPX(Constants.Ports.INTAKE_MOTOR);
    }

    public Command off() {
        return this.runOnce(() -> {
            this.motor.set(ControlMode.PercentOutput, 0);
        });
    }

    public Command on() {
        return this.runOnce(() -> {
            this.motor.set(ControlMode.PercentOutput, Constants.Intake.INTAKE_VOLTAGE / 12.0);
        });
    }

    public static Intake getInstance() {
        return instance == null ? instance = new Intake() : instance;
    }
}
