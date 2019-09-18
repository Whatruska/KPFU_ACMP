package Info;

public class FourthTask {
    public static void main(String[] args) {
        int x = 4281567;

        System.out.println(x);

        int firstSign = x / 1000000;
        int thirdSign = x / 10000;
        thirdSign = thirdSign % 10;

        //Меняем первый знак
        int change = firstSign * 1000000;
        x = x - change;
        change = thirdSign * 1000000;
        x = x + change;

        //Меняем второй знак
        change = thirdSign * 10000;
        x = x - change;
        change = firstSign * 10000;
        x = x + change;

        System.out.println(x);
    }
}
