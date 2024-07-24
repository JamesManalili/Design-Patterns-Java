package CommandPattern;

public class PowerOff implements Command{

    private DeviceOnOff deviceOnOff;
    public PowerOff(DeviceOnOff deviceOnOff){
        this.deviceOnOff = deviceOnOff;
    }
    @Override
    public String execute() {
        return deviceOnOff.powerOff();
    }
    //Manalili
}
