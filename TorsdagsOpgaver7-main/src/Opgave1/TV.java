package Opgave1;

public class TV {
    public boolean isOn;
    public int channel;
    public int volume;

    public TV() {
        /*this.isOn = true;
        this.channel = 1;
        this.volume = 10;*/
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }


    public void setChannel(int channel) {
        if (this.isOn) {
            this.channel = channel;
        }
    }

    public void channelUp() {
        if (this.isOn) {
            this.channel++;
        }
    }

    public void channelDown() {
        if (this.isOn) {
            this.channel--;
        }
    }

    public void setVolume(int volume) {
        if (this.isOn) {
            this.volume = volume;
        }
    }

    public void volumeUp() {
        if (this.isOn) {
            this.volume++;
        }
    }

    public void volumeDown() {
        if (this.isOn) {
            this.volume--;
        }
    }
}
