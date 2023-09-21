// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.math.estimator.SwerveDrivePoseEstimator;
import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.kinematics.SwerveDriveOdometry;
import edu.wpi.first.math.kinematics.SwerveModuleState;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DrivetrainConstants;
import frc.robot.subsystems.modules.SwerveModule;;

public class Drivetrain extends SubsystemBase {

    // Hardware
    private SwerveModule frontLeftModule;
    private SwerveModule frontRightModule;
    private SwerveModule backLeftModule;
    private SwerveModule backRightModule;

    WPI_TalonFX frontLeftDrive;

    // Kinematics Helper
    private SwerveDriveKinematics kinematics = new SwerveDriveKinematics(
        DrivetrainConstants.frontLeftModulePosition,
        DrivetrainConstants.frontRightModulePosition,
        DrivetrainConstants.backLeftModulePosition,
        DrivetrainConstants.backRightModulePosition
    );

    SwerveDrivePoseEstimator poseEstimator = new SwerveDrivePoseEstimator(kinematics, null, null, null);

    SwerveDriveOdometry

    // Sensor Data
    public double gyroAngleDegrees;
    public double gyroAngleRads; 

    private Drivetrain() {
        super();
    }

    private static Drivetrain instance; 

    public static Drivetrain getInstance() {
        if (instance == null) {
            instance = new Drivetrain();
        }
        return instance;
    }

    public void driveRelative(ChassisSpeeds relativeVelocities) {
        SwerveModuleState[] moduleStates = kinematics.toSwerveModuleStates(relativeVelocities);
        
    }

    /**
     * Example command factory method.
     *
     * @return a command
     */
    public CommandBase exampleMethodCommand() {
        // Inline construction of command goes here.
        // Subsystem::RunOnce implicitly requires `this` subsystem.
        return runOnce(
            () -> {
            /* one-time action goes here */
            });
    }

    /**
     * An example method querying a boolean state of the subsystem (for example, a digital sensor).
     *
     * @return value of some boolean subsystem state, such as a digital sensor.
     */
    public boolean exampleCondition() {
        // Query some boolean state, such as a digital sensor.
        return false;
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run during simulation
    }
}
