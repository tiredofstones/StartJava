public class CyclesTheme {   
    public static void main(String[] args) {
        System.out.println("\nЗадача 1. Подсчет суммы четных и нечетных чисел");
        int startRange = -10;
        int endRange = 21;
        int sumEven = 0;
        int sumOdd = 0;
        do { 
            if (startRange % 2 == 0) {
                sumEven += startRange;
            } else {
                sumOdd += startRange;
            }
            startRange++;
        } while (startRange <= endRange);
            System.out.println("В отрезке [-10,21] cумма четных чисел = " + sumEven + 
                    "; сумма нечетных чисел = " + sumOdd);

        System.out.println("\nЗадача 2. Вывод чисел в интервале (min и max) в порядке убывания");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int max = number1;
        int min = number3;
        if (number1 > number2 && number1 > number3) {
            if (number2 > number3) {
                System.out.println(max + " " + min);
            } else {
                System.out.println(max + " " + min);
            }
        } else if (number2 > number3) {
            System.out.println(max + " " + min);
        } else {
            System.out.println(max + " " + min);
        }
        for (int i = max - 1; i > min; i--) {  
            System.out.print(i + " ");  
        }
        System.out.println();

        System.out.println("\nЗадача 3. Вывод реверсивного числа и суммы его цифр");
        int number4 = 1234;
        int sumReversNumber4 = 0;
        while(number4 > 0) {
            sumReversNumber4 += (number4 % 10);
            System.out.print(number4 % 10);
            number4 /= 10;
        } 
        System.out.println("\nСумма цифр числа  " + sumReversNumber4);

        System.out.println("\nЗадача 4. Вывод чисел на консоль в несколько строк");
        int startInerval = 1;
        int endInterval = 24;
        int numbersPerLine = 0;
        for (int i = startInerval; i < endInterval;) {
            for (int k = 0; k < 5; k++) {
                if (i < endInterval) {
                    System.out.printf("%3d", i);
                } else {
                    System.out.printf("%3d", 0);
                }
            i += 2;
            }
            System.out.println();
            }

        System.out.println("\nЗадача 5. Проверка количества двоек на четность/нечетность");
        int number5 = 3242592;
        int copyNumber5 = number5;
        int sumTwos = 0;
        while (number5 > 0) {
            if ((number5 % 10) == 2) {
                sumTwos++;
            }
            number5 /= 10;  
        }
        if (number5 == 0) {
            number5 = copyNumber5;
        }
        if (sumTwos % 2 == 0) {
            System.out.println("Число " + number5 + " содержит " + sumTwos + 
                " (четное) количество двоек");
        } else {
            System.out.println("Число " + number5 + " содержит " + sumTwos + 
                " (нечетное) количество двоек");
        }
        
        System.out.println("\nЗадача 6. Отображение фигур в консоли");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        int number6 = 0;
        int counter = 5;
        while ( number6 < 5) {
            while (counter > 0) {
                System.out.print('#');
                counter--;
            }
            System.out.println();
            number6++;
            counter = 5 - number6;
        }
        System.out.println();

        int number7 = 0;
        int counter1 = 5;
        do {
            System.out.println('$');
            do {
                System.out.print('$');
                counter1--;
            } while (counter1 == 3);
            number7++;
        } while (number7 <= 3);
        System.out.println();
          
        System.out.println("\nЗадача 7.Отображение ASCII-символов");
        System.out.printf("%6s%6s%n", "Dec", " Char");
        for (int i = 1; i < 123; i++) {
            if (i % 2 > 0 && i < 48) {
                System.out.printf("%6d%6c",i,i);
                System.out.println();
            }
            if (i % 2  == 0 && i > 97 && i < 123) {
                System.out.printf("%6d%6c",i,i);
                System.out.println();
            } 
        }

        System.out.println("\nЗадача 8.Проверка, является ли число палиндромом");
        int number8 = 1234321;
        int counter2 = 0;
        int copyNumber8 = number8; 
        while (number8 > 0) {
            counter2 = counter2 * 10 + number8 % 10;
            number8 /= 10;
        }
        if (counter2 == copyNumber8) {   
            System.out.println("Число " + copyNumber8 + " является полиндромом");
        }

        System.out.println("\nЗадача 9.Определение, является ли число счастливым");
        int numLucky = 333555;
        int copyNumLucky = numLucky;
        int sumFirst = 0;
        int sumSecond = 0;
        int counter3 = 0;
        while (numLucky > 0) {
            counter3++;
            if (counter3 <= 3) {
                sumSecond += (numLucky % 10);
                numLucky /= 10;
            } 
            if (counter3 > 3 && counter3 < 7) {
                sumFirst += (numLucky % 10);
                numLucky /= 10;
            }  
        }
        System.out.println("Сумма первых трёх цифр " + " = " + sumFirst + 
                "\nСумма последних трёх цифр " + " = " + sumSecond);
        if (sumFirst == sumSecond) {
            System.out.println("Число " + copyNumLucky + " счаcтливое");
        } else { 
            System.out.println("Число " + copyNumLucky + " несчаcтливое");
        }
            
        System.out.println("\nЗадача 10.Вывод таблицы умножения Пифагора");
        System.out.printf("%4s%3s%3s%3s%3s%3s%3s%3s%3s","|","2","3","4","5","6","7","8","9");
        System.out.println("\n----------------------------");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%2d%2s", i, "|");
            for (int j = 2; j < 10; j++) {
                int k = i * j;
                System.out.printf("%3d", k);
            }
            System.out.println();
        }
    }
}   


