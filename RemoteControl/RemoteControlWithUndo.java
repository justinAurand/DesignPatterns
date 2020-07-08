public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;
    Integer slotCount = 7;

    public RemoteControlWithUndo() {
        onCommands = new Command[slotCount];
        offCommands = new Command[slotCount];

        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < slotCount; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPressed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control With Undo ------\n");

        for (int i = 0; i < slotCount; i++) {
            stringBuff.append("[slot " + i + "]: " + onCommands[i].getClass().getName()
                + " | " + offCommands[i].getClass().getName() + "\n");
        }

        return stringBuff.toString();
    }
}
