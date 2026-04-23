public class MainHub {
    public static void main(String[] args) {

        // Upcasting: SmartLamp disimpan dalam wadah SmartDevice
        SmartDevice device = new SmartLamp("192.168.1.10");

        device.turnOn();

        // Downcasting: mengembalikan akses ke fitur Connectable
        // Lampu awalnya "disembunyikan" dalam wadah SmartDevice,
        // jadi kita harus membuka kembali akses aslinya
        Connectable lamp = (Connectable) device;
        lamp.connectWifi();
    }
}