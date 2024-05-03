package dio.javabootcamp.sintaxe;

public class SmartTV {
    boolean turnOn=false;
    int channel=1;
    int volume=25;

    @Override
    public String toString() {
        return "SmartTV{" +
                "turnOn=" + turnOn +
                ", channel=" + channel +
                ", volume=" + volume +
                '}';
    }
}
