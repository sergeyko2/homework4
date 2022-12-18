package task1;

public class RunningTrack implements Barrier {
    private double length;

    public RunningTrack(double length) {
        this.length = length;
    }

    @Override
    public String name() {
        return "treadmill";
    }

    @Override
    public String overcome() {
        return length + "m on the treadmill";
    }
}
