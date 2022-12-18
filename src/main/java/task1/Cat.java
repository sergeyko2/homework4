package task1;

public class Cat implements Participant {
    private String personalName;

    public Cat(String personalName) {
        this.personalName = personalName;
    }

    @Override
    public String run() {
        return "Cat " + personalName + " ran ";
    }

    @Override
    public String jump() {
        return "Cat " + personalName + " jumped ";
    }

    @Override
    public String action(Barrier barrier) {
        if (barrier.name() == "treadmill") return this.run();
        else return this.jump();
    }
}
