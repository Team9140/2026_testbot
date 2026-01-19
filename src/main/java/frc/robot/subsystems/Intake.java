package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
    private final TalonSRX motor;

    public Intake() {
        this.motor = new TalonSRX(0);
    }

    public Command off(){
        return this.runOnce(() -> {
            this.motor.set(ControlMode.PercentOutput, Constants.Intake.OFF);
        });
    }

    public Command on(){
        return this.runOnce(() -> {
            this.motor.set(ControlMode.PercentOutput, Constants.Intake.ON);
        });
    }
}
