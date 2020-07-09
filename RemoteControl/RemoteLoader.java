public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan();
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        StereoOnWithCdCommand stereoOnWithCd = new StereoOnWithCdCommand(stereo);

        remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
        remoteControl.setCommand(1, kitchenLight::on, kitchenLight::off);
        remoteControl.setCommand(2, ceilingFan::high, ceilingFan::off);
        remoteControl.setCommand(3, garageDoor::up, garageDoor::down);
        remoteControl.setCommand(4, stereoOnWithCd, stereo::off);

        System.out.println(remoteControl);

        for (int i = 0; i < 5; i++) {
            remoteControl.onButtonWasPressed(i);
            remoteControl.offButtonWasPressed(i);
        }
    }
}
