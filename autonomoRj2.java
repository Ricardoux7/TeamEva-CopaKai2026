package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

// Agradecimientos especiales
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

        // 1. Mapeo de Hardware
        leftDrive = hardwareMap.get(DcMotor.class, "mI");
        rightDrive = hardwareMap.get(DcMotor.class, "mD");
        shootMotor = hardwareMap.get(DcMotor.class, "mS"); // Ojo: Aquí usaste "mS" en vez de "mC"
        intakeMotor = hardwareMap.get(DcMotor.class, "mR");
        servoShooter1 = hardwareMap.get(CRServo.class, "s1");
        servoShooter2 = hardwareMap.get(CRServo.class, "s2");

        // 2. Configuración de Dirección (Si se va chueco, invierte el FORWARD/REVERSE aquí)
        leftDrive.setDirection(DcMotorSimple.Direction.REVERSE);
        rightDrive.setDirection(DcMotorSimple.Direction.FORWARD);
        shootMotor.setDirection(DcMotorSimple.Direction.FORWARD);

        // Frenar los motores cuando la potencia sea 0
        leftDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        waitForStart();

        if (opModeIsActive()) {

            // --- PASO 1: Ir hacia adelante por ~2.00 metros ---
            leftDrive.setPower(1.0);
            rightDrive.setPower(1.0);
            sleep(2000);

            // Detener el chasis para estabilizar la inercia
            leftDrive.setPower(0.0);
            rightDrive.setPower(0.0);
            sleep(300);

            // --- PASO 2: Girar 45 grados a la izquierda ---
            // Motor derecho adelante, motor izquierdo atrás
            leftDrive.setPower(-1.0);
            rightDrive.setPower(1.0);
            sleep(400); // 400ms es un buen estimado para 45 grados

            // Detener el chasis
            leftDrive.setPower(0.0);
            rightDrive.setPower(0.0);
            sleep(300);

            // --- PASO 3: Avanzar hacia adelante ~1.00 metro ---
            leftDrive.setPower(1.0);
            rightDrive.setPower(1.0);
            sleep(1000);

            // Detener el chasis antes de disparar
            leftDrive.setPower(0.0);
            rightDrive.setPower(0.0);
            sleep(300);

            // --- PASO 4: Disparar (Shooter, Servos e Intake) ---
            shootMotor.setPower(1.0);
            intakeMotor.setPower(1.0);
            servoShooter1.setPower(1.0);
            servoShooter2.setPower(1.0);
            // Mantener encendido por 5 segundos
            sleep(5000);

            // --- PASO 5: Apagar todo y terminar ---
            shootMotor.setPower(0.0);
            intakeMotor.setPower(0.0);
            servoShooter1.setPower(0.0);
            servoShooter2.setPower(0.0);

            sleep(500);
        }
    }
}