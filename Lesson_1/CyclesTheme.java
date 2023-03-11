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
            System.out.println("В отрезке [-10,21] сумма четных чисел = " + sumEven + 
                    "; сумма нечетных чисел = " + sumOdd);

        System.out.println("\nЗадача 2. Вывод чисел в интервале (min и max) в порядке убывания");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int min = number1;
        int max = number2;
        if (number2 < min) {
            min = number2;
        } 
        if (number3 < min) {
            min = number3;
        }
        if (number3 > max) {
            max = number3;
        } 
        if (number1 > max){
            max = number1;
        }
            System.out.println(min + " " + max);
        for (int i = max - 1; i > min; i--) {  
            System.out.print(i + " ");  
        }

        System.out.println("\n\nЗадача 3. Вывод реверсивного числа и суммы его цифр");
        int number4 = 1234;
        int sumDigits = 0;
        int copyNumber4 = number4;
        while(number4 > 0) {
            System.out.print(number4 % 10); 
            number4 /= 10;
        } 
        System.out.println("\nСумма цифр числа  " + (((copyNumber4 % 10)+((copyNumber4 / 10) % 10) 
                + ((copyNumber4 / 100) % 10)) + ((copyNumber4 / 1000))));

        System.out.println("\nЗадача 4. Вывод чисел на консоль в несколько строк");
        int startInerval = 1;
        int endInterval = 24;
        int numbersPerLine = 0;
        for (int i = startInerval; i < endInterval;) {
            for (int j = 0; j < 5; j++) {
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
        if (sumTwos % 2 == 0) {
            System.out.println("Число " + copyNumber5 + " содержит " + sumTwos + 
                " (четное) количество двоек");
        } else {
            System.out.println("Число " + copyNumber5 + " содержит " + sumTwos + 
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

        int symbolInLine = 0;
        int numberOfLines = 5;
        while (symbolInLine < 5) {
            while (numberOfLines > 0) {
                System.out.print('#');
                numberOfLines--;
            }
            System.out.println();
            symbolInLine++;
            numberOfLines = 5 - symbolInLine;
        }
        System.out.println();

        symbolInLine = 0;
        numberOfLines = 5;
        do {
            System.out.println('$');
            do {
                System.out.print('$');
                numberOfLines--;
            } while (numberOfLines == 3);
            symbolInLine++;
        } while (symbolInLine <= 3);
        System.out.println();
          
        System.out.println("\nЗадача 7.Отображение ASCII-символов");
        System.out.printf("%6s%6s%n", "Dec", " Char");
        for (int i = 1; i < 123; i++) {
            if (i % 2 > 0 && i < 48) {
                System.out.printf("%6d%6c%n",i,i);
            }
            if (i % 2  == 0 && i > 97 && i < 123) {
                System.out.printf("%6d%6c%n",i,i);
            } 
        }

        System.out.println("\nЗадача 8.Проверка, является ли число палиндромом");
        int number8 = 1234321;
        int reversedNumbers = 0;
        int copyNumber8 = number8; 
        while (number8 > 0) {
            reversedNumbers = reversedNumbers * 10 + number8 % 10;
            number8 /= 10;
        }
        if (reversedNumbers == copyNumber8) {   
            System.out.println("Число " + copyNumber8 + " является палиндромом");
        }

        System.out.println("\nЗадача 9.Определение, является ли число счастливым");
        int numberLucky = 333555;
        int copyNumberLucky = numberLucky;
        int sumFirst = 0;
        int sumSecond = 0;
        int counter3 = 0;
        while (numberLucky > 0) { 
            counter3++;
            if (counter3 <= 3) {
                sumSecond += (numberLucky % 10);
            } else {
                sumFirst += (numberLucky % 10);
            }
            numberLucky /= 10;      
        }
        System.out.println("Сумма первых трёх цифр " + " = " + sumFirst + 
                "\nСумма последних трёх цифр " + " = " + sumSecond);
        if (sumFirst == sumSecond) {
            System.out.println("Число " + copyNumberLucky + " счастливое");
        } else { 
            System.out.println("Число " + copyNumberLucky + " несчастливое");
        }
            
        System.out.println("\nЗадача 10.Вывод таблицы умножения Пифагора");
        System.out.printf("%4s%3s%3s%3s%3s%3s%3s%3s%3s","|","2","3","4","5","6","7","8","9");
        System.out.println("\n----------------------------");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%2d%2s", i, "|");
            for (int j = 2; j < 10; j++) {
                int result = i * j;
                System.out.printf("%3d", result);
            }
            System.out.println();
        }
    }
}   


