package org.firstinspires.ftc.teamcode.Season_Robots.Tests.Failed_Tests;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp(name="Mech_Test_2", group="Failed_Tests")
public class Mech_Test_2 extends OpMode {


    /**
     * This file provides basic Telop driving for a simple mecanum drive robot.
     * <p>
     * This OpMode uses the T_DrivetrainOnlyHardware hardware class to define the devices on the robot.
     * <p>
     * All device access is managed through the T_DrivetrainOnlyHardware class.
     * <p>
     * This particular OpMode executes a code to run the mecanum wheels to allow for them to work correctly
     * <p>
     * Remove or comment out the @Disabled line to add this opmode to the Driver Station OpMode list
     */

        /* Declare OpMode members. */

        Mech_Test_2_Hardware robot = new Mech_Test_2_Hardware(); // use the class created to define a robot's hardware



        /*

         * Code to run ONCE when the driver hits INIT

         */

        @Override

        public void init() {

            /* Initialize the hardware variables.

             * The init() method of the hardware class does all the work here

             */

            robot.init(hardwareMap);


            // Send telemetry message to signify robot waiting;

            telemetry.addData("Say", "Hello Tester");    //

        }



        /*

         * Code to run REPEATEDLY after the driver hits INIT, but before they hit PLAY

         */

        @Override

        public void init_loop() {

        }



        /*

         * Code to run ONCE when the driver hits PLAY

         */

        @Override

        public void start() {

        }



        /*

         * Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP

         */

        @Override

        public void loop() {

            double rightX_G1;

            double rightY_G1;

            double leftX_G1;

            double leftY_G1;

            double leftX_G2;

            double leftY_G2;

            double rightX_G2;

            double rightY_G2;


            rightX_G1 = gamepad1.right_stick_x;

            rightY_G1 = -gamepad1.right_stick_y;

            leftX_G1 = -gamepad1.left_stick_x;

            leftY_G1 = -gamepad1.left_stick_y;

            leftX_G2 = gamepad2.left_stick_x;

            leftY_G2 = gamepad2.left_stick_y;

            rightX_G2 = gamepad2.right_stick_x;

            rightY_G2 = gamepad2.right_stick_y;



        /*

        <<<<DRIVETRAIN>>>>

        */

            /**

             * Drivetrain uses mecanum wheels that move laterally

             * on the x and y plane, allowing for more agile movement

             * while staying inside the same parameters are typical wheels.

             * The motors respond differently to each input from

             * the user's control, utilizing the normal maneuvers seen

             * from regular wheels in a tank drive, while also being

             * able to move side to side by reversing the front

             * right motor and the rear left motor from the front

             * left motor and the rear right motor.

             */

            robot.frontLeftMotor.setPower(leftY_G1 + rightX_G1 - leftX_G1);

            robot.rearLeftMotor.setPower(leftY_G1 + rightX_G1 + leftX_G1);

            robot.rearRightMotor.setPower(leftY_G1 - rightX_G1 + leftX_G1);

            robot.frontRightMotor.setPower(leftY_G1 - rightX_G1 - leftX_G1);



            /*

             * Code to run ONCE after the driver hits STOP

             */

        }

    }
