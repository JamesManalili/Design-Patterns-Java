package CommandPattern;

public class Thermostat implements DeviceOnOff {
    private int temperature;
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String increaseTemperature(){
        return "Temperature increase " + temperature;
    }

    public String decreaseTemperature(){
        return "Temperature decrease " + temperature;
    }


    @Override
    public String powerOn() {
        return "Thermostat is switched-on";
    }

    @Override
    public String powerOff() {
        return "Thermostat is switched-on";
    }
    //Manalili
}
