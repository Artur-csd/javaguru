package homeTask;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by CSD on 2/5/2017.
 */
public class Ugadajka {
    public static void main(String[] args) {

        int max = 100; /* Максимально число */
        int min = 1;   /*Минимальное число*/

        Scanner scanner = new Scanner(System.in);

        Random randomGenerator = new Random();
        int rundomNumber = (randomGenerator.nextInt(max - min) + min);

        String infoStart = "Программа угадывает число от " + min + " до " + max + ", а Вы говорите больше ( > ), меньше ( < )или равно ( = ) когда число угадано";
        String infoText = "Введите > , < или = .";
        String infoToExit = "Введите что-то кроме > , < или =  для завершения";
        String infoExit = "Вы закончили игру!";
        String infoWin = "Ура! Это число: ";

        System.out.println(infoStart);
        System.out.println(infoToExit);
        System.out.println(infoText);
        System.out.println(); /* Разделяем ИНФО от начала игры */
        System.out.println(rundomNumber);


        String intStr = scanner.nextLine();
        while ((intStr.equals(">")) || (intStr.equals("<"))) {
            if(intStr.equals(">")){
                min = rundomNumber;
            }
            if(intStr.equals("<")){
                max = rundomNumber;
            }
            rundomNumber = (randomGenerator.nextInt(max - min) + min);
            System.out.println(rundomNumber);
            intStr = scanner.nextLine();
        }
        if (intStr.equals("=")) {
            System.out.println(infoWin + rundomNumber);
        }
        else{
            System.out.println(infoExit);
        }
    }
}
