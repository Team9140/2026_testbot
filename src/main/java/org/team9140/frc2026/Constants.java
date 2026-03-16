package org.team9140.frc2026;

import static edu.wpi.first.units.Units.MetersPerSecond;

import org.team9140.frc2026.generated.TunerConstants;

public class Constants {
    
       public static class Drive {
        public static double MAX_TELEOP_VELOCITY = TunerConstants.kSpeedAt12Volts.in(MetersPerSecond);
        public static double MAX_TELEOP_ROTATION = Math.toRadians(360);

        public static double MIN_TELEOP_VELOCITY = 0.05;
        public static double MIN_TELEOP_ROTATION = Math.toRadians(2);
        public static double MIN_AUTON_VELOCITY = 0.05;
        public static double MIN_AUTON_ROTATION = Math.toRadians(2);

        public static final double X_CONTROLLER_P = 2.5 * 3.141592653589793238462643383279502884197169399375;
        public static final double X_CONTROLLER_I = 0.0;
        public static final double X_CONTROLLER_D = 0.015; // TODO: Raise value
        public static final double Y_CONTROLLER_P = X_CONTROLLER_P;
        public static final double Y_CONTROLLER_I = X_CONTROLLER_I;
        public static final double Y_CONTROLLER_D = X_CONTROLLER_D;
        public static final double HEADING_CONTROLLER_P = 8.0; // 8.0
        public static final double HEADING_CONTROLLER_I = 0.0;
        public static final double HEADING_CONTROLLER_D = 0.03; // 0.04

        public static final double REACHEDPOSE_DEBOUNCE = 0.5;
        public static final double BRAKE_IDLE_TIME = 6.0;

    }

}
