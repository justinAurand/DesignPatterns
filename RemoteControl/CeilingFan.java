public class CeilingFan {
    public enum Speed {
        HIGH,
        MEDIUM,
        LOW,
        OFF
    }
    Speed speed;

    public CeilingFan() {
        speed = Speed.OFF;
    }

    public void high() {
        speed = Speed.HIGH;
        System.out.println("Ceiling Fan is set to high");
    }

    public void medium() {
        speed = Speed.MEDIUM;
        System.out.println("Ceiling Fan is set to medium");
    }

    public void low() {
        speed = Speed.LOW;
        System.out.println("Ceiling Fan is set to low");
    }

    public void off() {
        speed = Speed.OFF;
        System.out.println("Ceiling Fan is off");
    }

    public Speed getSpeed() {
        return speed;
    }
}
