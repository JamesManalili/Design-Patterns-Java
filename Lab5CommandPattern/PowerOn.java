package CommandPattern;

public class PowerOn implements Command{

    private DeviceOnOff deviceOnOff;
    public PowerOn(DeviceOnOff deviceOnOff){
        this.deviceOnOff = deviceOnOff;
    }
    @Override
    public String execute() {
        return deviceOnOff.powerOn();
    }
    //Manalili
}
