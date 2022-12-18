package task1;

public class Wall implements Barrier {
    private double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public String overcome() {
        return "over a " + height + "m wall";
    }
}
