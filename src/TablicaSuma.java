import java.util.Scanner;

public class TablicaSuma {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Podaj liczbę");
        numbers[0] = input.nextInt();
        System.out.println("Podaj liczbę");
        numbers[1] = input.nextInt();
        System.out.println("Podaj liczbę");
        numbers[2] = input.nextInt();
        System.out.println("Podaj liczbę");
        numbers[3] = input.nextInt();
        System.out.println("Podaj liczbę");
        numbers[4] = input.nextInt();
        System.out.println("Suma liczb 1, 3 i 5:");
        System.out.println(numbers[0] +  numbers[2] +  numbers[4]);

    }
}