package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.*;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;


//Agradecimientos especiales
// Kalena Lugo

//ELECTROSHARKS SOS DE LA B
//AUDAZ MORISTE EN MADRID


@Autonomous(name="Autonomo Alianza Azul Arriba")

public class autonomoAz1 extends LinearOpMode {

    DcMotor leftDrive;
    DcMotor rightDrive;
    DcMotor shootMotor;
    DcMotor intakeMotor;
    CRServo servoShooter1, servoShooter2;


    @Override
    public void runOpMode() {

        leftDrive = hardwareMap.get(DcMotor.class, "mI");
        rightDrive = hardwareMap.get(DcMotor.class, "mD");
        shootMotor = hardwareMap.get(DcMotor.class, "mC");
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
            sleep(700);

            servoShooter1.setPower(1.0);
            servoShooter2.setPower(-1.0);
            shootMotor.setPower(1.0);
            //aqui ira que se mueva todo el intake
            sleep(3000);

            rightDrive.setPower(1.0);
            leftDrive.setPower(0.0);
            servoShooter1.setPower(0.0);
            servoShooter2.setPower(0.0);
            shootMotor.setPower(0.0);

            sleep(100);

            leftDrive.setPower(1.0);
            rightDrive.setPower(1.0);
            //intake activado

            sleep(700);

            leftDrive.setPower(1.0);
            rightDrive.setPower(0.0);
            sleep(700);

            leftDrive.setPower(1.0);
            rightDrive.setPower(1.0);
            sleep(700);

            leftDrive.setPower(0.0);
            rightDrive.setPower(1.0);
            sleep(100);

            servoShooter1.setPower(1.0);
            servoShooter2.setPower(-1.0);
            shootMotor.setPower(1.0);

            sleep(3000);




        }
    }
}

