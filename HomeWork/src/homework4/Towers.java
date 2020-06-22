package homework4;

import java.util.Scanner;

public class Towers {

    public static final String STAR = "*";

    public static void main(String[] args) {
        //1. Дать возможность указать количество колец, минимальное 3
        //2. Есть два режима игры:
        // 2.1 Ручной. В данном режиме пользователь указывает какой элемент и куда он передвигает
        // 2.2* Автоматический. Пользователь наблюдает за каждым шагом самостоятельной игры компьютера
        //3. Стартовое поле выглядит следующим образом:
        //1**
        //2**
        //3**
        //Где цифра - это кольцо определённого размера, * - это пустое место на стержне

        System.out.println("Welcome to the Tower of Hanoi game. Object of the game is to move all the disks over to Tower 3. But you cannot place a larger disk onto a smaller disk.");

        int mode = 0;
        int disks = 0;
        while (disks == 0 || mode == 0) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Which game mode do you want to choose? Enter \"1\" for manual, \"2\" for automatic");
                mode = scanner.nextInt();
                System.out.println("How many disks do you want to use? Minimum 3 maximum 8");
                disks = scanner.nextInt();
            }
            catch (Exception exception) {
                System.out.println("Invalid input.");
            }
        }


        if (disks < 3 || disks > 8) {
            System.out.println("Minimum number of disks is 3 maximum 8");
            return;
        }


        int[][] gameArray = new int[disks][3];

        for (int i = 0; i < gameArray.length; i++) {
            gameArray[i][0] = i + 1;
        }
        if (mode == 2) {
            autoGame(gameArray);
        } else {
            manualGame(gameArray);
        }
    }

    private static void manualGame(int[][] gameArray){
        printArray(gameArray);

        boolean isFinished = false;

        while (!isFinished) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first pillar number");
            int firstPillar = scanner.nextInt();
            System.out.println("Enter second pillar number");
            int secondPillar = scanner.nextInt();

            exchange(gameArray, firstPillar - 1, secondPillar - 1);

            isFinished = isFinished(gameArray);
        }

        System.out.println("Congrats!");

    }

    private static boolean isFinished(int[][] gameArray) {
        for (int i = 0; i < gameArray.length; i++) {
            if (gameArray[i][2] != i + 1){
                return false;
            }
        }
        return true;
    }

    private static void autoGame(int[][] gameArray) {
        printArray(gameArray);

        int iterations = ((int) Math.pow(2, gameArray.length)) - 1; //кол-во шагов 2^n + 1
        /*
             Source pillar - 0
             Auxiliary pillar - 1
             Destination pillar - 2

          If (n is even)
            Make_move (S, A)
            Make_move (S, D)
            Make_move (A, D)
        Else
            Make_move (S, D)
            Make_move (S, A)
            Make_move (A, D)
         */

        int i = 0;
        while (true) {
            if (gameArray.length % 2 == 0) {
                i = exchangeSourceAndAuxillary(gameArray, i);

                if (i == iterations) {
                    break;
                }

                i = exchangeSourceAndDestination(gameArray, i);

                if (i == iterations) {
                    break;
                }

                i = exchangeAuxiliaryAndDestination(gameArray, i);

                if (i == iterations) {
                    break;
                }

            } else {
                i = exchangeSourceAndDestination(gameArray, i);

                if (i == iterations) {
                    break;
                }

                i = exchangeSourceAndAuxillary(gameArray, i);

                if (i == iterations) {
                    break;
                }

                i = exchangeAuxiliaryAndDestination(gameArray, i);

                if (i == iterations) {
                    break;
                }
            }

        }

    }

    private static int exchangeAuxiliaryAndDestination(int[][] gameArray, int i) {
        exchange(gameArray,  1, 2); // first pillar index 1 - auxiliary, second pillar index 2 - destination
        return ++i;
    }

    private static int exchangeSourceAndAuxillary(int[][] gameArray, int i) {
        exchange(gameArray,  0, 1); // first pillar index 0 - source, second pillar index 1 - auxiliary
        return ++i;
    }

    private static int exchangeSourceAndDestination(int[][] gameArray, int i) {
        exchange(gameArray,  0, 2); // first pillar index 0 - source, second pillar index 2 - destination
        return ++i;
    }

    private static void exchange(int[][] gameArray, int firstPillarIndex, int secondPillarIndex) {
        // elements on the top of pillars
        int firstPillarTop = 0;
        int secondPillarTop = 0;
        // indexes of the elements on the top of pillars
        int firstPillarTopIndex = -1;
        int secondPillarTopIndex = -1;

        for (int j = 0; j < gameArray.length; j++) {
            int[] lines = gameArray[j];
            if (lines[firstPillarIndex] != 0 && firstPillarTop == 0) {
                firstPillarTop = lines[firstPillarIndex];
                firstPillarTopIndex = j;
            }
            if (lines[secondPillarIndex] != 0 && secondPillarTop == 0) {
                secondPillarTop = lines[secondPillarIndex];
                secondPillarTopIndex = j;
            }
        }

        if ((firstPillarTop < secondPillarTop || secondPillarTop == 0) && firstPillarTop != 0) {
            gameArray[firstPillarTopIndex][firstPillarIndex] = 0;
            if (secondPillarTopIndex != -1) {
                gameArray[secondPillarTopIndex - 1][secondPillarIndex] = firstPillarTop;
            } else {
                gameArray[gameArray.length - 1][secondPillarIndex] = firstPillarTop;
            }
        } else {
            gameArray[secondPillarTopIndex][secondPillarIndex] = 0;
            if (firstPillarTopIndex != -1) {
                gameArray[firstPillarTopIndex - 1][firstPillarIndex] = secondPillarTop;
            } else {
                gameArray[gameArray.length - 1][firstPillarIndex] = secondPillarTop;
            }
        }

        System.out.println();
        printArray(gameArray);
    }

    private static void printArray(int[][] gameArray) {
        for (int[] ints : gameArray) {
            for (int anInt : ints) {
                if (anInt > 0) {
                    System.out.print(anInt);
                } else {
                    System.out.print(STAR);
                }
            }
            System.out.println();
        }
    }


}
