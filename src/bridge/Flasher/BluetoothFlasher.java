package bridge.Flasher;

public class BluetoothFlasher extends Flasher {

    public BluetoothFlasher(Device aDevice) {
        super(aDevice);
    }

    @Override
    public void communicateViaProtocall() {
        System.out.println("system komunikuje sie z urzadzeniem portu Bluetooth");
    }

    @Override
    public void flashDevice() {
        System.out.println("urzadzenie "+myDevice.getType()+" portu Bluetooth sygnalizuje prace");
    }
}
