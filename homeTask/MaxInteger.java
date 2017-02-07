package homeTask;

import java.util.Scanner;

/**
 * Created by CSD on 2/4/2017.
 */
public class MaxInteger {

    private static final String INFO_START = "Программа покажет самое большое число которое Вы ввели";
    private static final String INFO_INT = "Введите число";
    private static final String INFO_EXIT = "Введите 0 для завершения и получения результа";
    private static final String INFO_MAX_NUM = "Максимальное число:";
    private static final int EXIT_NUM = 0;

    public static void main(String[] args) {

        int intNumber;
        int max;

        Scanner scanner = new Scanner(System.in);
        System.out.println(INFO_START);
        System.out.println(INFO_INT);
        System.out.println(INFO_EXIT);
        intNumber = scanner.nextInt();
        max = intNumber;
        while(intNumber != EXIT_NUM){
            if(max < intNumber){
                max = intNumber;
            }
            System.out.println(INFO_INT);
            intNumber = scanner.nextInt();
        }
        System.out.println(INFO_MAX_NUM + " " + max);
    }
}
