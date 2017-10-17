package command.receiver;

public class Stereo {
    private String desc;
    private int volume;

    public Stereo(String desc) {
        this.desc = desc;
    }

    public void on() {
        System.out.println(this.desc + " is on");
    }

    public void off() {
        System.out.println(this.desc + " is off");
    }

    public void setCd() {
        System.out.println(this.desc + " is set for CD input");
    }

    public void setDvd() {

    }

    public void setRadio() {

    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(this.desc + " volume set to " + this.volume);
    }
}
