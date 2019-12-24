package OOP;

public class Developer extends Worker implements Workable{
    public Developer() {
        skill = 100;
    }

    @Override
    public void study(int hours) {
        skill += hours * 3;
    }

    @Override
    public int work(int hours) {
        return hours * 200;
    }
}
