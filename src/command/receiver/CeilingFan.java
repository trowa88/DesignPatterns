package command.receiver;

public class CeilingFan {
    private String desc;
    private String speed;

    public CeilingFan(String desc) {
        this.desc = desc;
        this.high();
    }

    public void on() {
        System.out.println(this.desc + "ceiling fan is on" + this.speed);
    }

    public void high() {
        speed = "HIGH";
    }

    public void medium() {
        speed = "MEDIUM";
    }

    public void low() {
        speed = "LOW";
    }

    public void off() {
        System.out.println(this.desc + "ceiling fan is off");
    }

    public String getDesc() {
        return desc;
    }
}
