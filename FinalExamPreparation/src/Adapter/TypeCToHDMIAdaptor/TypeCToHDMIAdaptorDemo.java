package Adapter.TypeCToHDMIAdaptor;

public class TypeCToHDMIAdaptorDemo {
    public static void main(String[] args) {
        USBCLaptop laptop = new USBCLaptop();
        HDMIDevice adapter = new USBCToHDMIAdapter(laptop);

        adapter.connectHDMI();

    }
}
