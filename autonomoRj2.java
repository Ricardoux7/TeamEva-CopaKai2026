package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;


//Agradecimientos especiales
// Kalena Lugo


@Autonomous(name="Autonomo Alianza Roja Abajo")

public class autonomoRj2 extends LinearOpMode {

    DcMotor leftDrive;
    DcMotor rightDrive;
    DcMotor shootMotor;
    DcMotor intakeMotor;
    CRServo servoShooter1, servoShooter2;

    @Override
    public void runOpMode() {

        leftDrive = hardwareMap.get(DcMotor.class, "mI");
        rightDrive = hardwareMap.get(DcMotor.class, "mD");
        shootMotor = hardwareMap.get(DcMotor.class, "mS");
        intakeMotor = hardwareMap.get(DcMotor.class, "mR");
        servoShooter1 = hardwareMap.get(CRServo.class, "s1");
        servoShooter2 = hardwareMap.get(CRServo.class, "s2");

        leftDrive.setDirection(DcMotorSimple.Direction.REVERSE);
        rightDrive.setDirection(DcMotorSimple.Direction.FORWARD);
        shootMotor.setDirection(DcMotorSimple.Direction.FORWARD);


        waitForStart();



        if (opModeIsActive()) {

            leftDrive.setPower(1.0);
            rightDrive.setPower(1.0);
            sleep(800);

            leftDrive.setPower(1.0);
            rightDrive.setPower(0.0);
            sleep(200);

            leftDrive.setPower(1.0);
            rightDrive.setPower(1.0);
            sleep(500);

            leftDrive.setPower(0.0);
            rightDrive.setPower(1.0);
            sleep(100);

            servoShooter1.setPower(1.0);
            servoShooter2.setPower(1.0);
            intakeMotor.setPower(1.0);
            shootMotor.setPower(1.0);
            sleep(5000);

            leftDrive.setPower(1.0);
            rightDrive.setPower(0.0);
            servoShooter1.setPower(0.0);
            servoShooter2.setPower(0.0);
            intakeMotor.setPower(0.0);
            shootMotor.setPower(0.0);
            sleep(200);

            leftDrive.setPower(1.0);
            rightDrive.setPower(1.0);
            sleep(200);

            leftDrive.setPower(1.0);
            rightDrive.setPower(0.0);
            sleep(100);

            leftDrive.setPower(1.0);
            rightDrive.setPower(1.0);
            intakeMotor.setPower(1.0);
            sleep(1000);


            leftDrive.setPower(-1.0);
            rightDrive.setPower(-1.0);
            intakeMotor.setPower(0.0);
            sleep(1000);

            leftDrive.setPower(1.0);
            rightDrive.setPower(0.0);
            sleep(700);

            leftDrive.setPower(1.0);
            rightDrive.setPower(0.0);
            sleep(600);

            leftDrive.setPower(1.0);
            rightDrive.setPower(1.0);
            sleep(600);

            leftDrive.setPower(0.0);
            rightDrive.setPower(1.0);
            sleep(300);

            leftDrive.setPower(1.0);
            rightDrive.setPower(1.0);
            intakeMotor.setPower(1.0);
            sleep(1000);

            leftDrive.setPower(0.0);
            rightDrive.setPower(0.0);
            intakeMotor.setPower(0.0);
            sleep(1000);
        }
    }
}

