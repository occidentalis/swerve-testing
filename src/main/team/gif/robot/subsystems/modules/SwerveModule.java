package gif.robot.subsystems.modules;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.ctre.phoenix.sensors.CANCoder;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.math.controller.HolonomicDriveController;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.math.controller.ProfiledPIDController;
import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.wpilibj.motorcontrol.Spark;

public class SwerveModule {

    private TalonFX driveMotor;
    private CANSparkMax turnMotor;
    private CANCoder turnEncoder;

    private double drive_kV; 
    private double drive_kA;
    private double drive_kS;
    private double drive_kP;
    private double drive_kI;
    private double turn_kP;
    private double turn_kD;
    private double turn_kV;
    private double turn_kA;
    private double turn_kS;
    
    public SwerveModule(
        int driveMotorID,
        int turnMotorID,
        int turnEncoderID
        // boolean invertDrive,
        // boolean invertTurn,
        // boolean invertTurnEncoder,
        ) {

    }

    /**
     * Sets the model and controller constants for the drive motor system.
     * @param kV
     * @param kA
     * @param kS
     * @param kP
     * @param kI
     */
    public void setDriveParams(double kV, double kA, double kS, double kP, double kI) {

        driveMotor.
        drive_kV = kV;
        drive_kA = kA;
        drive_kS = kS;
        drive_kP = kP;
        drive_kI = kI;
    }

    /**
     * Sets tje model and controller constants for the turn motor system.
     * @param kV
     * @param kA
     * @param kS
     * @param kP
     * @param kD
     */
    public void setTurnParams(double kV, double kA, double kS, double kP, double kD) {
        turn_kV = kV;
        turn_kA = kA;
        turn_kS = kS;
        turn_kP = kP;
        turn_kD = kD;
    }
    
    
    public void setVelocity(double velocity);
    public void setAngle(double angle);
    public double getVelocity();
    public double getAngle();
}
