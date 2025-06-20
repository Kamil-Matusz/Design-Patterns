package bridge.Flasher;

public class Program {
    
	public static void main(String[] args) 
    {
        Flasher anUsbFlasher = new USBFlasher(new USBDevice());
        Flasher aSerialFlasher = new SerialFlasher(new SerialDevice());        
        Flasher aBluetoothFlaher = new BluetoothFlasher(new BluetoothDevice());
        System.out.println("sygnalizacja pracy urzadzenia portu szeregowego");
        aSerialFlasher.connectDevice();
        aSerialFlasher.validateDevice();
        aSerialFlasher.initFlashing();
        aSerialFlasher.communicateViaProtocall();
        if(aSerialFlasher.flashStatus){
            aSerialFlasher.flashDevice();
        }
        aSerialFlasher.eject();        
        System.out.println("\nsygnalizacja pracy urządzenia portu usb");
        anUsbFlasher.connectDevice();
        anUsbFlasher.validateDevice();
        anUsbFlasher.initFlashing();
        anUsbFlasher.communicateViaProtocall();
        if(anUsbFlasher.flashStatus){
            anUsbFlasher.flashDevice();
        }
        anUsbFlasher.eject();
        System.out.println("\nsygnalizacja pracy urządzenia portu Bluetooth");
        aBluetoothFlaher.connectDevice();
        aBluetoothFlaher.validateDevice();
        anUsbFlasher.initFlashing();
        aBluetoothFlaher.communicateViaProtocall();
        if(aBluetoothFlaher.flashStatus){
            aBluetoothFlaher.flashDevice();
        }
        aBluetoothFlaher.eject();
    }
}