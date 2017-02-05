package homeTask;

import java.util.Scanner;

/**
 * Created by CSD on 2/4/2017.
 */
public class MaxInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String infoStart = "Программа покажет самое большое число которое Вы ввели";
        String infoText = "Введите число";
        String infoExit = "Введите 0 для завершения и получения результа";
        System.out.println(infoStart);
        System.out.println(infoText);
        System.out.println(infoExit);
        int intNumber = scanner.nextInt();
        int max = intNumber;
        while(intNumber != 0){
            if(max < intNumber){
                max = intNumber;
            }
            System.out.println(infoText);
            System.out.println(infoExit);
            intNumber = scanner.nextInt();
        }
        System.out.println("Максимальное число: " + max);
    }
}
