package team.gif.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import team.gif.robot.RobotMap;

public class LimitSwitch {
    private DigitalInput limitSwitch = new DigitalInput(RobotMap.LIMITSWITCH_ID);

    // pressed = true, not pressed = false
    public boolean isOn() {
        return !limitSwitch.get();
    }
}
