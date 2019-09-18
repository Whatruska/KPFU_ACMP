package Info;

public class FirstTask {
    public static void main(String[] args) {

        int x = 2,y = 0;

        y = x * x; //x^2
        y = 5 * y;//5x^2
        y = y + 7;//5x^2+7
        y = y * x;//5x^3+7x
        y = y + 6;//5x^3+7x+6
        y = y * x;//5x^4+7x^2+6x
        y = y + 3;//5x^4+7x^2+6x+3
        y = y * x;//5x^5+7x^3+6x^2+3x
        y = y + 8;//5x^5+7x^3+6x^2+3x+8

        System.out.println(y);
    }
}
