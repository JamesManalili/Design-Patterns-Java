package CommandPattern;
public class ViewerApp {
    public static void main(String[] args) {

        Lights lights = new Lights();
        PowerOn powerOn = new PowerOn(lights);
        RemoteControl rc = new RemoteControl();
        rc.setCommand(powerOn);
        String commandResult = rc.clickButton();
        System.out.println(commandResult);
        lights.setBrightness(20);
        System.out.println(lights.increaseBrightness()+"\n");


        Thermostat thermostat = new Thermostat();
        powerOn = new PowerOn(thermostat);
        rc.setCommand(powerOn);
        commandResult = rc.clickButton();
        System.out.println(commandResult);
        thermostat.setTemperature(50);
        System.out.println(thermostat.decreaseTemperature()+"\n");

        MusicPlayer mp = new MusicPlayer();
        powerOn = new PowerOn(mp);
        rc.setCommand(powerOn);
        commandResult = rc.clickButton();
        System.out.println(commandResult);
        mp.setVolume(20);
        System.out.println(mp.increaseVolume());
        mp.setPlaylist("Playlist 1");
        System.out.println(mp.showPlaylist());
        //Manalili James I.
    }
}
