package homeTask;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by CSD on 2/5/2017.
 */
public class IgraChetireRjad {
    public static void main(String[] args) {

        int height = 6;
        int width = 7;
        int count = height*width;
        int playerStart = 1;

        Scanner scanner = new Scanner(System.in);
        int intNumber = 1;
        int iCol;

        boolean turnDone;



        String infoStart = "Игра 4 в ряд. Высота поля" + height + " и ширина поля " + width;
        String infoText = "Введите номер колонки: ";
        String infoToExit = "Введите 0 для завершения";
        String infoExit = "Вы закончили игру!";
        String infoWin = "Ура! Победил - ";
        String noWiner = "Победила дружба";
        String infoFull = "Тут нет места";
        String wrongNum = "Мимо, это за пределами поля";
        String player1 = "Игрок 1";
        String player2 = "Игрок 2";
        String p1Symbol = " X ";
        String p2Symbol = " O ";
        String emSymbol = " + ";
        String symb = p1Symbol;
        String player = player1;
        String[][] arr = new String[height][width];

        /*Делает пустое поле*/
        for(int iHeight=0; iHeight<height; iHeight++)
        {
            for(int iWidth=0; iWidth<width; iWidth++){
                arr[iHeight][iWidth] = emSymbol;
            }
        }



        while(count!=0 && intNumber !=0){

            /*Вывод номеров*/
            for(int i=0; i<width; i++){
                System.out.print(" " + (i + 1) + " ");
            }
            System.out.println("\n");
            /*Вывод поля*/
            for(int iHeight2 = (height-1); iHeight2>=0; iHeight2--){
                for(int iWidth2 = 0; iWidth2 < width; iWidth2++){
                    if(iWidth2 != (width-1)){
                        System.out.print(arr[iHeight2][iWidth2]);
                    }
                    else{
                        System.out.println(arr[iHeight2][iWidth2]);
                    }
                }
            }


            System.out.println();
            System.out.print(player + " " + infoText);
            intNumber = scanner.nextInt();
            System.out.println();

            if((intNumber > 0) && (intNumber < width)){
                turnDone = false;
                iCol = 0;
                while(!turnDone && iCol < height){
                    if(arr[iCol][intNumber-1].equals(emSymbol)) {
                        arr[iCol][intNumber-1] = symb;
                        turnDone = true;
                        if(playerStart == 1){
                            player = player2;
                            symb = p2Symbol;
                            playerStart = 2;
                        }
                        else{
                            player = player1;
                            symb = p1Symbol;
                            playerStart = 1;
                        }
                        count--;
                    }
                    else{
                        iCol++;
                    }
                }
                if(iCol >= height){
                    System.out.println(infoFull);
                }

            }
            else{
                System.out.println(wrongNum);
            }

        }
        if (intNumber == 0){
            System.out.println(infoExit);
        }
        if (count == 0){
            System.out.println(noWiner);
        }

    }
}
