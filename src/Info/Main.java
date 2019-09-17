package Info;

public class Main {
    public static void main(String[] args) {
        int N = 6875;
        int total;
        int num;
        int value;

        num = N/5000;
        total = num;
        value = 5000*num;
        N = N - value;

        num = N/1000;
        total = total + num;
        value = 1000*num;
        N = N - value;

        num = N/500;
        total =total + num;
        value = 500*num;
        N = N - value;

        num = N/100;
        total = total + num;
        value = 100*num;
        N = N - value;

        num = N/50;
        total = total + num;

        System.out.println(total);
    }
}
