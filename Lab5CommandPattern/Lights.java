package CommandPattern;

public class Lights implements DeviceOnOff {

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    private int brightness;

    public String increaseBrightness(){
        return "Light brightness increase " + brightness;
    }
    public String decreaseBrightness(){
        return "Light brightness decrease " + brightness;
    }
    @Override
    public String powerOn() {
        return "Light is switched-on";
    }

    @Override
    public String powerOff() {
        return "Light is switched-off";
    }
    //Manalili
}
