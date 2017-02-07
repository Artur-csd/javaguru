package homeTask;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by CSD on 2/5/2017.
 */
public class Ugadajka {

    private static final int MAX_NUM = 100; /* Максимально число */
    private static final int MIN_NUM = 1;   /*Минимальное число*/

    private static final String INFO_START = "Программа угадывает число от " + MIN_NUM + " до " + MAX_NUM + ", а Вы говорите больше ( > ), меньше ( < )или равно ( = ) когда число угадано";
    private static final String INFO_RULE = "Введите > , < или = .";
    private static final String INFO_TO_EXIT = "Введите что-то кроме > , < или =  для завершения";
    private static final String INFO_EXIT = "Вы закончили игру!";
    private static final String INFO_WIN = "Ура! Это число:";

    public static void main(String[] args) {

        int max = MAX_NUM;
        int min = MIN_NUM;

        Scanner scanner = new Scanner(System.in);

        Random randomGenerator = new Random();
        int rundomNumber = (randomGenerator.nextInt(max - min) + min + 1);

        System.out.println(INFO_START);
        System.out.println(INFO_TO_EXIT);
        System.out.println(INFO_RULE);
        System.out.println(); /* Разделяем ИНФО от начала игры */
        System.out.println(rundomNumber);


        String intStr = scanner.nextLine();
        while ((intStr.equals(">")) || (intStr.equals("<"))) {
            if(intStr.equals(">")){
                min = rundomNumber;
            } else if(intStr.equals("<")){
                max = rundomNumber;
            }
            rundomNumber = (randomGenerator.nextInt(max - min) + min + 1);
            System.out.println(rundomNumber);
            intStr = scanner.nextLine();
        }
        if (intStr.equals("=")) {
            System.out.println(INFO_WIN + " " + rundomNumber);
        } else {
            System.out.println(INFO_TO_EXIT);
        }
    }
}
