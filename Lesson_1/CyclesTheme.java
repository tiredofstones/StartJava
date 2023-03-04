public class CyclesTheme {   
    public static void main(String[] args) {


        System.out.println("\nЗадача 1. Подсчет суммы четных и нечетных чисел");
        int firstNumSegment = -10;
        int secondNumSegment = 21;
        int sumEven = 0;
        int sumOdd = 0;
        do { 
            if (firstNumSegment == 0) {
            } else {
                if (firstNumSegment % 2 == 0) {
                    sumEven++;
                } else {
                    sumOdd++;
                }
            }
            firstNumSegment++;
        } while (firstNumSegment <= secondNumSegment);
            System.out.println("В отрезке [-10,21] cумма четных чисел = " + sumEven + 
                    "; сумма нечетных чисел = " + sumOdd);

        System.out.println("\nЗадача 2. Вывод чисел в интервале (min и max) в порядке убывания");
        int firstNumInterval = 10;
        int secondNumInterval = 5;
        int thirdNumInterval = -1;
        int maxNum = 0;
        int minNum = 0;
        if (firstNumInterval > secondNumInterval && secondNumInterval > thirdNumInterval) {
            minNum = thirdNumInterval;
            maxNum = firstNumInterval;
        } else if (firstNumInterval > thirdNumInterval && thirdNumInterval> secondNumInterval) {
            minNum = secondNumInterval;
            maxNum = firstNumInterval;
        } else if (secondNumInterval > firstNumInterval && firstNumInterval >thirdNumInterval) {
            minNum = thirdNumInterval;
            maxNum = secondNumInterval;
        } else if (secondNumInterval > thirdNumInterval && thirdNumInterval > firstNumInterval) {
            minNum = firstNumInterval;
            maxNum = secondNumInterval;
        } else if (thirdNumInterval > firstNumInterval && firstNumInterval >secondNumInterval) { 
            minNum = secondNumInterval;
            maxNum = thirdNumInterval;  
        } else if (thirdNumInterval > secondNumInterval && secondNumInterval > firstNumInterval) {
            minNum = firstNumInterval;
            maxNum = thirdNumInterval;
        }  
            System.out.println(minNum + " " + maxNum);          
        for (int i = maxNum - 1; i > minNum; i--) {  
            System.out.print(i + " ");  
        }
        System.out.println();

        System.out.println("\nЗадача 3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int reversNum = 0;
        int sumReversNum = 0;
        while(num != 0) {
            reversNum = (num % 10);
            sumReversNum = sumReversNum + reversNum;
            num = num / 10;
            System.out.print(reversNum);
        } 
            System.out.println("\nСумма цифр числа - " + sumReversNum);

        System.out.println("\nЗадача 4. Вывод чисел на консоль в несколько строк");
        for (int i = 1; i < 30; i += 2) {
            int j = 0;
            if (i == 11 || i == 21) {
                System.out.println();
            }
            if (i <= 24) {
                System.out.printf("%3d",i);
            } else { 
                System.out.printf("%3d",j);
            }
        }
        System.out.println();

        System.out.println("\nЗадача 5. Проверка количества двоек на четность/нечетность");
        int num2 = 3242592;
        int num3 = num2;
        int sumTwos = 0;
        while (num2 != 0) {
            int i = (num2 % 10);
            num2 = num2 / 10;
             if (i == 2) {
                sumTwos++;
            }  
        }
        if (num2 == 0) {
            num2 = num3; // не смог сообразить, как вернуть num2 исходное значение 
        }
        if (sumTwos % 2 == 0) {
            System.out.println("Число " + num2 + " содержит " + sumTwos + 
                    " (четное) количество двоек");
        } else {
            System.out.println("Число " + num2 + " содержит " + sumTwos + 
                    " (нечетное) количество двоек");
        }
        
        System.out.println("\nЗадача 6. Отображение фигур в консоли");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10 ; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        int octothorpeSignature = 0;
        while ( octothorpeSignature < 5) {
            int i = 5;
            while (i != 0) {
                System.out.print('#');
                i--;
            }
            System.out.println();
            octothorpeSignature++;
            i = 5 - octothorpeSignature;
            }

        int dollarSignature = 0;
        int counter = 5;
        do {
            System.out.println('$');
            do {
                System.out.print('$');
                counter--;
            } while (counter <= 3 && counter > 2);
            dollarSignature++;
        } while (dollarSignature <= 3);
        System.out.println();
          
        System.out.println("\nЗадача 7.Отображение ASCII-символов");
        System.out.printf("%6s%6s%n", "Dec", " Char");
        for (int i = 1; i < 123; i++) {
            if (i % 2 != 0 && i < 48) {
                System.out.printf("%6d%6c",i,i);
                System.out.println();
            }
            if (i %2  == 0 && i > 97 && i < 123) {
                System.out.printf("%6d%6c",i,i);
                System.out.println();
            } 
        }

        System.out.println("\nЗадача 8.Проверка, является ли число палиндромом");
        int num4 = 1234321;
        int counter2 = 0;
        int numPalindrome = num4; 
        while (num4 > 0) {
            counter2 = counter2 * 10 + num4 % 10;
            num4 = num4 / 10;
        }
        if (counter2 == numPalindrome) {   
        System.out.println("Число " + numPalindrome + " является полиндромом");
        }

        System.out.println("\nЗадача 9.Определение, является ли число счастливым");
        int numLucky = 333555;
        int numLucky1 = numLucky;
        int sumFirst = 0;
        int sumSecond = 0;
        int l = 0;
        while (numLucky != 0) {
            
             l++;
            if (l <= 3) {
                sumSecond = sumSecond + (numLucky % 10);
                numLucky = numLucky / 10;                
            } 
            if (l >3 && l < 7) {
                sumFirst = sumFirst + (numLucky % 10);
                numLucky = numLucky / 10;
            }  
        }
        System.out.println("Сумма первых трёх цифр " + " = " + sumFirst + 
                "\nСумма последних трёх цифр " + " = " + sumSecond);
        if (sumFirst == sumSecond) {
                System.out.println("Число " + numLucky1 + " счаcтливое");
        } else { 
                System.out.println("Число " + numLucky1 + " несчаcтливое");
        }
            
        System.out.println("\nЗадача 10.Вывод таблицы умножения Пифагора");
        System.out.printf("%4s%3s%3s%3s%3s%3s%3s%3s%3s","|","2","3","4","5","6","7","8","9");
        System.out.println("\n----------------------------");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%2d%2s",i,"|");
            for (int j = 2; j < 10; j++) {
                int k = i * j;
                System.out.printf("%3d",k);
            }
            System.out.println();
        }
    }
}   


