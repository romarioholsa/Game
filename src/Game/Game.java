package Game;

import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = (int) (Math.random() * 100);
        int y = (1);

        while (y != x) {
            System.out.println("Введи число от 0 до 100:");
            y = scan.nextInt();
            if (y < x)
                System.out.println("Я сам в шоке, но, загаданное число больше, брат");
            else if (y > x)
                System.out.println("Не ожидал от тебя такого. Загаданное число меньше, брат");
            else
                System.out.println(y + " Угадал");

        }
        scan.close();
    }
}