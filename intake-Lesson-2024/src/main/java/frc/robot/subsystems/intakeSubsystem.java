package frc.package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.MotorSetPoints;

public class intake extends SubsystemBase {

  private CANSparkMax intakeMotor1;
  private CANSparkMax intakeMotor2;
  private CANSparkMax intakeMotor3;

  public void Intake() {
    intakeMotor1 = new CANSparkMax(4, MotorType.kBrushless);
    intakeMotor2 = new CANSparkMax(5, MotorType.kBrushless);
    intakeMotor3 = new CANSparkMax(6, MotorType.kBrushless);

    // Reset motor controller to factory defaults
    intakeMotor1.restoreFactoryDefaults();
    intakeMotor2.restoreFactoryDefaults();
    intakeMotor3.restoreFactoryDefaults();

    intakeMotor1.setIdleMode(IdleMode.kCoast);
    intakeMotor2.setIdleMode(IdleMode.kCoast);
    intakeMotor3.setIdleMode(IdleMode.kCoast);

    // Intake motor 2 will copy all movement of the motor 1
    intakeMotor2.follow(intakeMotor1);
    intakeMotor3.follow(intakeMotor1);

    // Save the configuration changes to the motor
    intakeMotor1.burnFlash();
    intakeMotor2.burnFlash();
    intakeMotor3.burnFlash();
  }

  // The method will be called every 20 ms
  @Override
  public void periodic() {
    // The method will be called once per scheduler run
  }
  public void runFullSpeed() {
    intakeMotor1.set(MotorSetPoints.INTAKE_SPEED_FULL);
  }

  public void runHalfSpeed() {
    intakeMotor1.set(MotorSetPoints.INTAKE_SPEED_HALF);
  }

  public void runReverse() {
    intakeMotor1.set(MotorSetPoints.INTAKE_SPEED_REVERSE);
  }

  public void stop() {
    intakeMotor1.stopMotor();
  }
}robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.MotorSetPoints;

public class intake extends SubsystemBase {

  private CANSparkMax intakeMotor1;
  private CANSparkMax intakeMotor2;
  private CANSparkMax intakeMotor3;

  public void Intake() {
    intakeMotor1 = new CANSparkMax(4, MotorType.kBrushless);
    intakeMotor2 = new CANSparkMax(5, MotorType.kBrushless);
    intakeMotor3 = new CANSparkMax(6, MotorType.kBrushless);

    // Reset motor controller to factory defaults
    intakeMotor1.restoreFactoryDefaults();
    intakeMotor2.restoreFactoryDefaults();
    intakeMotor3.restoreFactoryDefaults();

    intakeMotor1.setIdleMode(IdleMode.kCoast);
    intakeMotor2.setIdleMode(IdleMode.kCoast);
    intakeMotor3.setIdleMode(IdleMode.kCoast);

    // Intake motor 2 will copy all movement of the motor 1
    intakeMotor2.follow(intakeMotor1);
    intakeMotor3.follow(intakeMotor1);

    // Save the configuration changes to the motor
    intakeMotor1.burnFlash();
    intakeMotor2.burnFlash();
    intakeMotor3.burnFlash();
  }

  // The method will be called every 20 ms
  @Override
  public void periodic() {
    // The method will be called once per scheduler run
  }
  public void runFullSpeed() {
    intakeMotor1.set(MotorSetPoints.INTAKE_SPEED_FULL);
  }

  public void runHalfSpeed() {
    intakeMotor1.set(MotorSetPoints.INTAKE_SPEED_HALF);
  }

  public void runReverse() {
    intakeMotor1.set(MotorSetPoints.INTAKE_SPEED_REVERSE);
  }

  public void stop() {
    intakeMotor1.stopMotor();
  }
}