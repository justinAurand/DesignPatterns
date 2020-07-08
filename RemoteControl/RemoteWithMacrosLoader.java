public class RemoteWithMacrosLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light light = new Light("Living Room");
        Tv tv = new Tv();
        Stereo stereo = new Stereo();
        HotTub hotTub = new HotTub();

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        TvOnCommand tvOn = new TvOnCommand(tv);
        TvOffCommand tvOff = new TvOffCommand(tv);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        HotTubOnCommand hotTubOn = new HotTubOnCommand(hotTub);
        HotTubOffCommand hotTubOff = new HotTubOffCommand(hotTub);

        Command[] partyOn = { lightOn, stereoOn, tvOn, hotTubOn };
        Command[] partyOff = { hotTubOff, tvOff, stereoOff, lightOff };

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);

        System.out.println();

        remoteControl.undoButtonWasPressed();
    }
}
