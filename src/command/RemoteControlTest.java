package command;

import command.concreteCommand.GarageDoorOpenCommand;
import command.concreteCommand.LightOnCommand;
import command.invoker.SimpleRemoteControl;
import command.receiver.GarageDoor;
import command.receiver.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light("Light");
        GarageDoor garageDoor = new GarageDoor("GarageDoor");
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remoteControl.setCommand(lightOn);
        remoteControl.buttonWasPressed();
        remoteControl.setCommand(garageOpen);
        remoteControl.buttonWasPressed();
    }
}
