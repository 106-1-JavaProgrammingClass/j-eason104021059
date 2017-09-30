import java.util.Scanner;

public class HW5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int tall = scn.nextInt();
        int weight = scn.nextInt();
        System.out.println((double)tall/2.54);
        System.out.println((double)weight/0.454);
    }
}