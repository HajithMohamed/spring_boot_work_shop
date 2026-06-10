package Adapter.TypeCToHDMIAdaptor;

public class USBCToHDMIAdapter implements HDMIDevice{
    private USBCLaptop laptop;
    public USBCToHDMIAdapter(USBCLaptop laptop){
        this.laptop = laptop;
    }
    @Override
    public void connectHDMI() {
        laptop.connectToUSBC();
    }
}
