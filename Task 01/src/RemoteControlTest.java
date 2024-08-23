public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new LivingRoomLight();
        Light kitchenLight = new KitchenRoomLight();

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        LightDimCommand kitchenLightdim = new LightDimCommand(kitchenLight , 50);

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightDimCommand livingRoomLightdim = new LightDimCommand(kitchenLight , 30);

        remoteControl.setCommand(0, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(1, livingRoomLightOn, livingRoomLightOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed(1);

        kitchenLightdim.execute();
        kitchenLightdim.undo();

        livingRoomLightdim.execute();
        livingRoomLightdim.undo();
    }
}
