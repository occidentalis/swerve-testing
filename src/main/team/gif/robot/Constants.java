// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package gif.robot;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.util.Units;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean
 * constants. This class should not be used for any other purpose. All constants
 * should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static class OperatorConstants {
        public static final int kDriverControllerPort = 0;
    }

    public static class DrivetrainConstants {
        public static final boolean invertFrontLeftDriveMotor = true;
        public static final boolean invertFrontRightDriveMotor = false;
        public static final boolean invertRearLeftDriveMotor = true;
        public static final boolean invertRearRightDriveMotor = false;

        public static final boolean invertFrontLeftTurnMotor = true;
        public static final boolean invertFrontRightTurnMotor = false;
        public static final boolean invertRearLeftTurnMotor = false;
        public static final boolean invertRearRightTurnMotor = false;

        public static final boolean invertFrontLeftDriveEncoder = false;
        public static final boolean invertFrontRightDriveEncoder = false;
        public static final boolean invertRearLeftDriveEncoder = false;
        public static final boolean invertRearRightDriveEncoder = false;

        public static final boolean invertFrontLeftTurnEncoder = false;
        public static final boolean invertFrontRightTurnEncoder = true;
        public static final boolean invertRearLeftTurnEncoder = true;
        public static final boolean invertRearRightTurnEncoder = true;

        public static final boolean invertGyro = false;

        // Chosen Constants
        public static final double maxDriveSpeed = 1.0; // m/s
        public static final double maxDriveAccel = 1.0; // m/s^2

        // Physical Constants
        public static final double driveGearRatio = 6.5;
        public static final double turnGearRatio = 4.0; // TODO: VERIFY!

        public static final double frontLeftTurnEncoderZeroPosition = 82.089; // TODO: Measure
        public static final double frontRightTurnEncoderZeroPosition = -138.25195;
        public static final double rearLeftTurnEncoderZeroPosition = -20.3906;
        public static final double rearRightTurnEncoderZeroPosition = 157.85156;

        // Distance between centers of left and right wheels on robot
        public static final double TRACK_WIDTH = Units.inchesToMeters(25.0);

        // Distance between front and back wheels on robot
        public static final double TRACK_LENGTH = Units.inchesToMeters(21.4375);

        public static final Translation2d frontLeftModulePosition = new Translation2d(TRACK_LENGTH / 2.0, TRACK_WIDTH / 2.0);
        public static final Translation2d frontRightModulePosition = new Translation2d(TRACK_LENGTH / 2.0, -TRACK_WIDTH / 2.0);
        public static final Translation2d backLeftModulePosition = new Translation2d(-TRACK_LENGTH / 2.0, TRACK_WIDTH / 2.0);
        public static final Translation2d backRightModulePosition = new Translation2d(-TRACK_LENGTH / 2.0, -TRACK_WIDTH / 2.0);
    }

}
