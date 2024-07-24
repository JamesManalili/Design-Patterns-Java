package CommandPattern;

public class MusicPlayer implements DeviceOnOff {

    private int volume;
    private String playlist;

    public String showPlaylist() {
        return "Playlist set to "+playlist;
    }

    public void setPlaylist(String playlist) {
        this.playlist = playlist;
    }

    public String increaseVolume(){
        return "Volume increase " + volume;
    }

    public String decreaseVolume(){
        return "Volume decrease " + volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String powerOn() {
        return "Music player is switched-on";
    }

    @Override
    public String powerOff() {
        return "Music player is switched-off";
    }


}
