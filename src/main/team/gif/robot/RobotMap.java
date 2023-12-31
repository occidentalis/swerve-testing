package gif.robot;

public abstract class RobotMap {
    // Controllers
    public static final int DRIVER_CONTROLLER_ID = 0;
    public static final int AUX_CONTROLLER_ID = 1;
    public static final int TEST_CONTROLLER_ID = 2;

    // Drivetrain
    public static final int RIGHT_DRIVETRAIN_ONE = 11;
    public static final int RIGHT_DRIVETRAIN_TWO = 12;
    public static final int LEFT_DRIVETRAIN_ONE = 21;
    public static final int LEFT_DRIVETRAIN_TWO = 22;

    //SwerveDrivetrain
    public static final int FRONT_LEFT_DRIVE_MOTOR_PORT = 22;
    public static final int REAR_LEFT_DRIVE_MOTOR_PORT = 21;
    public static final int FRONT_RIGHT_DRIVE_MOTOR_PORT = 20;
    public static final int REAR_RIGHT_DRIVE_MOTOR_PORT = 23;
    public static final int FRONT_LEFT_CANCODER = 6;
    public static final int FRONT_RIGHT_CANCODER = 9;
    public static final int REAR_LEFT_CANCODER = 11;
    public static final int REAR_RIGHT_CANCODER = 7;

    public static final int FRONT_LEFT_TURNING_MOTOR_PORT = 18;
    public static final int REAR_LEFT_TURNING_MOTOR_PORT = 13;
    public static final int FRONT_RIGHT_TURNING_MOTOR_PORT = 17;
    public static final int REAR_RIGHT_TURNING_MOTOR_PORT = 10;

    // Arm
    public static final int ARM_MOTOR = 5;
    public static final int TELESCOPING_MOTOR = 16;

    // Pigeon
    public static final int PIGEON_TANK_PBOT = 12;
    public static final int PIGEON_COMP_PBOT = 42;

    // Elevator
    public static final int ELEVATOR_MOTOR_ID = 41;

    //Collector
    public static final int SOLENOID_COLLECTOR_FORWARD = 0;
    public static final int SOLENOID_COLLECTOR_REVERSE = 1;
    public static final int COLLECTOR_MOTOR = 43;

    // LED 28
    public static final int LED_PWM_PORT = 9;
    public static final int[] HP_LEDS = {0,1,2,3,4,5,   6,7,8,25,26,27}; // {0,1,2,9};
    public static final int[] GAME_PIECE_LEDS = {9,10,11,12,  21,22,23,24}; // {3,4,7,8};
    public static final int[] WHEEL_STATE_LEDS = {13,14,15,16,17,18,19,20}; // {5,6};

    // Compressors
    public static final int COMPRESSOR = 1;
    public static final int SENSOR_AIR_PRESSURE = 3;

}
