public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Integer slotCount = 7;

    public RemoteControl() {
        onCommands = new Command[slotCount];
        offCommands = new Command[slotCount];

        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < slotCount; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control ------\n");

        for (int i = 0; i < slotCount; i++) {
            stringBuff.append("[slot " + i + "]: " + onCommands[i].getClass().getName()
                + " | " + offCommands[i].getClass().getName() + "\n");
        }

        return stringBuff.toString();
    }
}
