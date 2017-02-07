package homeTask;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by CSD on 2/5/2017.
 */
public class Zagadajka {

    private static final int MAX_NUM = 100; /* Максимально число */
    private static final int MIN_NUM = 1;   /*Минимальное число*/
    private static final int EXIT_GAME_NUM = MAX_NUM +1;

    private static final String INFO_START = "Программа загадывает число от " + MIN_NUM + " до " + MAX_NUM + " и говорит больше или меньше, пока число не будет угадано";
    private static final String INFO_TEXT = "Введите число";
    private static final String INFO_TO_EXIT = "Введите " + (EXIT_GAME_NUM) + " для завершения";
    private static final String INFO_EXIT = "Вы закончили игру! Это было число: ";
    private static final String INFO_MORE = "Больше";
    private static final String INFO_LESS = "Меньше";
    private static final String INFO_WIN = "Ура! Вы угадали, это число: ";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random randomGenerator = new Random();
        int rundomNumber = (randomGenerator.nextInt(MAX_NUM - MIN_NUM) + MIN_NUM + 1);
        System.out.println(INFO_START);
        System.out.println(INFO_TO_EXIT);
        System.out.println(INFO_TEXT);

        int intNumber = scanner.nextInt();
        while ((rundomNumber != intNumber) && (intNumber != ( EXIT_GAME_NUM ))) {
            if(rundomNumber > intNumber){
                System.out.println(INFO_MORE);
            }
            if(rundomNumber < intNumber){
                System.out.println(INFO_LESS);
            }
            intNumber = scanner.nextInt();
        }
        if (intNumber != ( EXIT_GAME_NUM )) {
            System.out.println(INFO_WIN + rundomNumber);
        }
        else{
            System.out.println(INFO_EXIT + rundomNumber);
        }
    }
}
