public class CeilingFanMediumCommand implements Command {
    CeilingFan fan;
    CeilingFan.Speed previousSpeed;

    public CeilingFanMediumCommand(CeilingFan fan) {
        this.fan = fan;
    }

    public void execute() {
        previousSpeed = fan.getSpeed();
        fan.medium();
    }

    public void undo() {
        switch (previousSpeed) {
            case HIGH:
                fan.high();
                break;
            case MEDIUM:
                fan.medium();
                break;
            case LOW:
                fan.low();
                break;
            case OFF:
            default:
                fan.off();
                break;
        }
    }
}
