package org.strongback.hardware;

import static org.junit.Assert.*;
import com.ctre.phoenix.motorcontrol.can.*;
import com.ctre.phoenix.motorcontrol.*;
import static org.mockito.Mockito.*;
import static org.mockito.Matchers.*;
import static org.junit.Assert.*;

public class PhoenixTalonAdapterTest {
    TalonSRX talon = mock(com.ctre.phoenix.motorcontrol.can.TalonSRX.class);
    SensorCollection sensorCollection = mock(SensorCollection.class);
    PhoenixTalonAdapter underTest = new PhoenixTalonAdapter(talon);

    @org.junit.Before
    public void setup() {
        when(talon.getSensorCollection()).thenReturn(sensorCollection);
    }

    @org.junit.Test
    public void isFwdLimitSwitchClosed() {
        when(sensorCollection.isFwdLimitSwitchClosed()).thenReturn(true);
        assert (underTest.isFwdLimitSwitchClosed());
    }

    @org.junit.Test
    public void isRevLimitSwitchClosed() {
        when(sensorCollection.isRevLimitSwitchClosed()).thenReturn(true);
        assert (underTest.isRevLimitSwitchClosed());
    }

    @org.junit.Test
    public void getDeviceID() {
        when(talon.getDeviceID()).thenReturn(123);
        assert (underTest.getDeviceID() == 123);
    }

    @org.junit.Test
    public void getOutputCurrent() {
        assert (false);
    }

    @org.junit.Test
    public void getOutputVoltage() {
        assert (false);
    }

    @org.junit.Test
    public void getBusVoltage() {
        assert (false);
    }

    @org.junit.Test
    public void getTemperature() {
        assert (false);
    }

    @org.junit.Test
    public void getEncPosition() {
        assert (false);
    }

    @org.junit.Test
    public void getEncVelocity() {
        assert (false);
    }

    @org.junit.Test
    public void getAnalogInPosition() {
        assert (false);
    }

    @org.junit.Test
    public void getAnalogInVelocity() {
        assert (false);
    }

    @org.junit.Test
    public void getPosition() {
        assert (false);
    }

    @org.junit.Test
    public void getSpeed() {
        assert (false);
    }

    @org.junit.Test
    public void getFaultForLim() {
        assert (false);
    }

    @org.junit.Test
    public void getFaultRevLim() {
        assert (false);
    }

    @org.junit.Test
    public void getFaultForSoftLim() {
        assert (false);
    }

    @org.junit.Test
    public void getFaultRevSoftLim() {
        assert (false);
    }

    @org.junit.Test
    public void getFaultHardwareFailure() {
        assert (false);
    }

    @org.junit.Test
    public void getFaultOverTemp() {
        assert (false);
    }

    @org.junit.Test
    public void getFaultUnderVoltage() {
        assert (false);
    }

    @org.junit.Test
    public void getStickyFaultForLim() {
        assert (false);
    }


    @org.junit.Test
    public void getStickyFaultRevLim() {
        assert (false);
    }

    @org.junit.Test
    public void getStickyFaultForSoftLim() {
        assert (false);
    }

    @org.junit.Test
    public void getStickyFaultRevSoftLim() {
        assert (false);
    }

    @org.junit.Test
    public void getStickyFaultOverTemp() {
        assert (false);
    }

    @org.junit.Test
    public void getStickyFaultUnderVoltage() {
        assert (false);
    }

    @org.junit.Test
    public void changeControlMode() {
        assert (false);
    }

    @org.junit.Test
    public void enableBrakeMode() {
        assert (false);
    }

    @org.junit.Test
    public void reverseSensor() {
        assert (false);
    }

    @org.junit.Test
    public void setFeedbackDevice() {
        assert (false);
    }

    @org.junit.Test
    public void setStatusFrameRateMs() {
        assert (false);
    }

    @org.junit.Test
    public void setForwardSoftLimit() {
        assert (false);
    }

    @org.junit.Test
    public void setReverseSoftLimit() {
        assert (false);
    }

    @org.junit.Test
    public void enableForwardSoftLimit() {
        assert (false);
    }

    @org.junit.Test
    public void enableReverseSoftLimit() {
        assert (false);
    }

    @org.junit.Test
    public void enableLimitSwitch() {
        assert (false);
    }

    @org.junit.Test
    public void enableBrakeMode1() {
        assert (false);
    }

    @org.junit.Test
    public void configFwdLimitSwitchNormallyOpen() {
        assert (false);
    }

    @org.junit.Test
    public void configRevLimitSwitchNormallyOpen() {
        assert (false);
    }

    @org.junit.Test
    public void setVoltageRampRate() {
        assert (false);
    }

    @org.junit.Test
    public void getFirmwareVersion() {
        assert (false);
    }

    @org.junit.Test
    public void isSafetyEnabled() {
        assert (false);
    }

    @org.junit.Test
    public void setSafetyEnabled() {
        assert (false);
    }

    @org.junit.Test
    public void getExpiration() {
        assert (false);
    }

    @org.junit.Test
    public void setExpiration() {
        assert (false);
    }

    @org.junit.Test
    public void isAlive() {
        assert (false);
    }

    @org.junit.Test
    public void setFeedbackDevice1() {
        assert (false);
    }

    @org.junit.Test
    public void clearStickyFaults() {
        assert (false);
    }

    @org.junit.Test
    public void disable() {
        assert (false);
    }

    @org.junit.Test
    public void enableControl() {
        assert (false);
    }

    @org.junit.Test
    public void isControlEnabled() {
        assert (false);
    }

    @org.junit.Test
    public void setSpeed() {
        assert (false);
    }

    @org.junit.Test
    public void get() {
        assert (false);
    }

    @org.junit.Test
    public void set() {
        assert (false);
    }

    @org.junit.Test
    public void getSetpoint() {
        assert (false);
    }

    @org.junit.Test
    public void clearIaccum() {
        assert (false);
    }

    @org.junit.Test
    public void reverseOutput() {
        assert (false);
    }

    @org.junit.Test
    public void setPID() {
        assert (false);
    }

    @org.junit.Test
    public void setPID1() {
        assert (false);
    }

    @org.junit.Test
    public void getP() {
        assert (false);
    }

    @org.junit.Test
    public void getI() {
        assert (false);
    }

    @org.junit.Test
    public void getD() {
        assert (false);
    }

    @org.junit.Test
    public void getF() {
        assert (false);
    }

    @org.junit.Test
    public void getIZone() {
        assert (false);
    }

    @org.junit.Test
    public void getCloseLoopRampRate() {
        assert (false);
    }

    @org.junit.Test
    public void setProfile() {
        assert (false);
    }

    @org.junit.Test
    public void getControlMode() {
        assert (false);
    }

    @org.junit.Test
    public void changeControlMode1() {
        assert (false);
    }

    @org.junit.Test
    public void setF() {
        assert (false);
    }

    @org.junit.Test
    public void setIZone() {
        assert (false);
    }

    @org.junit.Test
    public void setCloseLoopRampRate() {
        assert (false);
    }
}