package bridge.Flasher;

public class BluetoothDevice extends Device {

    public BluetoothDevice() {
        type="Bluetooth";
        deviceConnectionStatus=true;
    }

    @Override
    public boolean validateDevice() {
        System.out.println("system zatwierdzil urzadzenie bluetooth");
        return true;
    }
}
