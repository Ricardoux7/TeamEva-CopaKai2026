
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;


//Agradecimientos especiales
// Kalena Lugo


@TeleOp(name="Basic: Linear OpMode", group="Linear OpMode")
@Disabled
public class BasicOpMode_Linear extends LinearOpMode {

    DcMotor motorIzquierdo;
    DcMotor motorDerecho;
    DcMotor motorCanon;
    DcMotor motorRecogida;

    double poderIzquierdo, poderDerecho;

    @Override
    public void runOpMode() {

        motorIzquierdo = hardwareMap.get(DcMotor.class, "mI");
        motorDerecho = hardwareMap.get(DcMotor.class, "mD");
        motorCanon = hardwareMap.get(DcMotor.class, "mC");
        motorRecogida = hardwareMap.get(DcMotor.class, "mR");

        motorIzquierdo.setDirection(DcMotor.Direction.REVERSE);
        motorDerecho.setDirection(DcMotor.Direction.FORWARD);
        motorCanon.setDirection(DcMotor.Direction.FORWARD);
        motorRecogida.setDirection(DcMotor.Direction.FORWARD);



        waitForStart();



        while (opModeIsActive()) {

            double movimiento = -gamepad1.left_stick_y;
            double curva = gamepad1.right_stick_x;
            boolean disparo = gamepad1.left_trigger_pressed;
            boolean recogida = gamepad1.a;

            poderIzquierdo = Range.clip(movimiento + curva, -1.0, 1.0) ;
            poderDerecho = Range.clip(movimiento - curva, -1.0, 1.0) ;
            if(disparo){


                motorCanon.setPower(1.0);
            }

            if (recogida){

                motorRecogida.setPower(1.0);
            }




            motorIzquierdo.setPower(poderIzquierdo);
            motorDerecho.setPower(poderDerecho);

        }
    }
}
