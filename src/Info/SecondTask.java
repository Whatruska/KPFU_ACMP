package Info;

public class SecondTask {
    public static void main(String[] args) {
        long x = 2, fraction, secondFract, thirdFract;

        fraction = x * x; //2
        fraction = fraction * fraction; //4
        fraction = fraction * fraction; //8
        fraction = fraction * fraction; //16
        fraction = fraction * fraction; //32

        secondFract = fraction; //32

        thirdFract = x * x; //2
        thirdFract = thirdFract * thirdFract; //4
        thirdFract = thirdFract * x; //5

        secondFract = secondFract / thirdFract; //27

        System.out.println(fraction * secondFract);
    }
}
