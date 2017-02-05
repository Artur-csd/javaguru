package homeTask;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by CSD on 2/5/2017.
 */
public class Zagadajka {
    public static void main(String[] args) {

        int max = 100;
        int min = 1;

        Scanner scanner = new Scanner(System.in);

        Random randomGenerator = new Random();
        int rundomNumber = (randomGenerator.nextInt(max - min) + min);
        rundomNumber++;

        String infoStart = "Программа загадывает число от " + min + " до " + max + " и говорит больше или меньше, пока число не будет угадано";
        String infoText = "Введите число";
        String infoToExit = "Введите " + (max + 1) + " для завершения";
        String infoExit = "Вы закончили игру! Это было число: ";
        String infoMore = "Больше";
        String infoLess = "Меньше";
        String infoWin = "Ура! Вы угадали, это число: ";

        System.out.println(infoStart);
        System.out.println(infoToExit);
        System.out.println(infoText);

        int intNumber = scanner.nextInt();
        while ((rundomNumber != intNumber) && (intNumber != ( max + 1 ))) {
            if(rundomNumber > intNumber){
                System.out.println(infoMore);
            }
            if(rundomNumber < intNumber){
                System.out.println(infoLess);
            }
            intNumber = scanner.nextInt();
        }
        if (intNumber != ( max + 1 )) {
            System.out.println(infoWin + rundomNumber);
        }
        else{
            System.out.println(infoExit + rundomNumber);
        }
    }
}
