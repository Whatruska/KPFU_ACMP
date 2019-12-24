package OOP;

public class Intern extends Worker{
    public Intern() {
        skill = 1;
    }

    @Override
    public void study(int hours) {
        skill += hours;
    }
}
