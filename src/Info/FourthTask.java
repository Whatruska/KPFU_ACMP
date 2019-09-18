package Info;

public class FourthTask {
    public static void main(String[] args) {
        int x = 4281567;

        System.out.println(x);

        int firstSign = x % 10;
        int thirdSign = x % 1000;
        thirdSign = thirdSign / 100;

        //Меняем первый знак
        int change = firstSign;
        x = x - change;
        change = thirdSign;
        x = x + change;

        //Меняем третий знак
        change = thirdSign * 100;
        x = x - change;
        change = firstSign * 100;
        x = x + change;

        System.out.println(x);
    }
}
