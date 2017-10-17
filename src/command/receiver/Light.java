package command.receiver;

public class Light {
    private String desc;

    public Light(String desc) {
        this.desc = desc;
    }

    public void on() {
        System.out.println(this.desc + "Light is On");
    }

    public void off() {
        System.out.println(this.desc + "Light is Off");
    }
}
