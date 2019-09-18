package Info;

public class ThirdTask {
    public static void main(String[] args) {
        int u = 50,v = 10;
        double z;

        //Высчитываем верхнюю часть
        int up = u;
        int a = 5 * v;
        a = a - 7;
        int b = u + 7;
        int c = v * 2;

        int max = b;
        if (c > b){
            max = c;
        }

        int d = a/max;

        up = up + d;

        //Высчитываем нижнюю часть
        int down = 33;
        a = u - 7;
        b = v * 3;

        int min = a;
        if (b < a){
            min = b;
        }

        down = down - min;

        //Высчитываем результат
        z = up / down;
        System.out.println(z);
    }
}
