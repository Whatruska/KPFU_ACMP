package acmp.Task_688_SIMPLIFY;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstCords = scanner.nextLine().trim().split(" ");
        String[] secondCords = scanner.nextLine().trim().split(" ");

        int n = Integer.parseInt(scanner.nextLine().trim());

        int susX = Integer.parseInt(firstCords[0]);
        int susY = Integer.parseInt(firstCords[1]);

        int dogX = Integer.parseInt(secondCords[0]);
        int dogY = Integer.parseInt(secondCords[1]);

        int result = 0;
        for (int i = 0; i < n ; i++){
            String[] cords = scanner.nextLine().trim().split(" ");
            int x = Integer.parseInt(cords[0]);
            int y = Integer.parseInt(cords[1]);
            double susTime = Math.sqrt(Math.pow(susX - x, 2) + Math.pow(susY - y, 2));
            double dogTime = Math.sqrt(Math.pow(dogX - x, 2) + Math.pow(dogY - y, 2)) / 2;

            if (dogTime >= susTime){
                result = i + 1;
                break;
            }
        }

        if (result == 0){
            System.out.println("NO");
        } else {
            System.out.println(result);
        }
    }
}
