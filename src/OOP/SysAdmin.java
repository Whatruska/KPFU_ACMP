package OOP;

public class SysAdmin implements Workable {
    @Override
    public int work(int hours) {
        return hours * 500;
    }
}
