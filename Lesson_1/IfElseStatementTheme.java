public class IfElseStatementTheme {   
    public static void main(String[] args) {
        System.out.println("\nЗадача 1. Перевод псевдокода на язык Java");
        int age = 20; 
        if (age > 20) {
            System.out.println("Ты уже взрослый");
        } else {
            System.out.println("Еще молоко на губах не обсохло");
        }

        boolean male = false; 
        if (!male) {
            System.out.println("Женщина");
        } else {
            System.out.println("Мужчина");
        }

        double height = 1.80; 
        if (height < 1.80) {
            System.out.println("Не возьмут в баскетбол");
        } else {
            System.out.println("Возьмут в баскетбол");
        }

        char firstLetterName = "Sergey".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Michail");
        } else if (firstLetterName == 'I') {
            System.out.println("Ignat");
        } else {
            System.out.println(firstLetterName);
        }
            
        System.out.println("\nЗадача 2. Поиск max и min числа");
        int num1 = 30;
        int num2 = 80;
        if (num1 > num2) {
            System.out.println("Максимальное число :" + num1 + "\nМинимальное число :" + num2);
        } else if (num1 < num2) {
            System.out.println("Максимальное число :" + num2 + "\nМинимальное число :" + num1);
        } else {
            System.out.println("Числа равны");
        }
        
        System.out.println("\nЗадача 3. Проверка числа");
        int num3 = 8;
        System.out.println("Число : " + num3);
        if (num3 == 0) {
            System.out.println("Число равно 0");
        } else {
            if (num3 % 2 == 0) {
                System.out.println("Четное");
            } else {
                System.out.println("Нечетное");
            }    
            if (num3 > 0) {
                System.out.println("Положительное");
            } else {
                System.out.println("Отрицательное");
            } 
        }

        System.out.println("\nЗадача 4. Поиск одинаковых цифр в числах");
        int num4 = 101;
        int num5 = 191;
        System.out.println("Первое число : " + num4 + "\nВторое число : " + num5);
        int hundredsNum4 = num4 / 100;
        int hundredsNum5 = num5 / 100;
        int tensNum4 = num4 % 100 / 10;
        int tensNum5 = num5 % 100 / 10;
        int onesNum4 = num4 % 10;
        int onesNum5 = num5 % 10;
        if (hundredsNum4 != hundredsNum5 && tensNum4 != tensNum5 && onesNum4 != onesNum5) {
            System.out.println("Одинаковых цифр нет!");
        } else { 
            if (hundredsNum4 == hundredsNum5) {
                System.out.println("В сотнях одинаковая цифра : " + hundredsNum4);
            }
            if (tensNum4 == tensNum5) { 
                System.out.println("В десятках одинаковая цифра : " + tensNum4);  
            } 
            if (onesNum4 == onesNum5) {
                System.out.println("В единицах одинаковая цифра : " + onesNum5);
            }    
        }

        System.out.println("\nЗадача 5.Определение символа по его коду");
        char symbol = '\u0057';
        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println(symbol + " - это маленькая буква");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println(symbol + " - это большая буква");   
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println(symbol + " - это число");
        } else {
            System.out.println(symbol + " - это не буква и не число");
        }

        System.out.println("\nЗадача 6.Подсчет суммы вклада и начисленных банком %");
        int sumDeposit = 300000;
        int income = sumDeposit / 100 * 7;
        if (sumDeposit < 100000) {
            income = sumDeposit / 100 * 5;
        }  else if (sumDeposit > 300000 ) {
            income = sumDeposit / 100 * 10;
        }
        System.out.println("Сумма вклада = " + sumDeposit + "\nНачисленные проценты = " + income + 
                "\nИтого = " + (sumDeposit + income));

        System.out.println("\nЗадача 7. Определение оценки по предметам");
        double ratingHistory = 0.59;
        double ratingProgramming = 0.91;
        double gradeHistory = 2;
        double gradeProgramming = 2;
        if (ratingHistory > 0.60 && ratingHistory <= 0.73) {
            gradeHistory = 3;
        } else if (ratingHistory > 0.73 && ratingHistory <= 0.91) {
            gradeHistory = 4;
        } else if (ratingHistory > 0.91) {
            gradeHistory = 5;
        }
        if (ratingProgramming > 0.60 && ratingProgramming <= 0.73) {
            gradeProgramming = 3;
        } else if (ratingProgramming > 0.73 && ratingProgramming <= 0.91) {
            gradeProgramming = 4;
        } else if (ratingProgramming > 0.91) {
            gradeProgramming = 5;
        }
        double averageGrade = ((gradeHistory + gradeProgramming) / 2);
        double averageRating = ((ratingProgramming + ratingHistory) / 2);
        System.out.println(gradeHistory + " балла по Истории\n" + gradeProgramming + " балла по Программированию" + 
                "\nСредний балл по предметам = " + averageGrade + "\nСредний рейтинг по предметам = " 
                + averageRating * 100 + "%");
        
        System.out.println("\nЗадача 8. Расчет прибыли за год");
        int rent = 5000;
        int costPrice = 9000;
        int monthlyIncome = 13000;
        int annualProfit = (monthlyIncome - costPrice - rent) * 12;
        if (annualProfit > 0) {
            System.out.println("Годовая прибыль = +" + annualProfit);
        } else {
            System.out.println("Годовая прибыль = " + annualProfit);
        }
        
        System.out.println("\nЗадача 9. Подсчет количества банкнот");
        int requiredSum = 567;
        int denominationBanknotes1 = 50;  
        int denominationBanknotes10 = 5;
        int denominationBanknotes100 = 10;
        int balanceOfBanknotes = (denominationBanknotes1 + (denominationBanknotes10 * 10) + 
                (denominationBanknotes100 * 100));
        int banknotes1 = requiredSum % 10; 
        int banknotes10 = requiredSum % 100 / 10;
        int banknotes100 = requiredSum / 100;
        if (requiredSum > balanceOfBanknotes || denominationBanknotes1 < banknotes1) {
            System.out.println("Невозможно совершить операцию, попробуйте изменить сумму");
        } else {
            if (denominationBanknotes100 < banknotes100) {
                banknotes10 += (banknotes100 - denominationBanknotes100) * 10;
                banknotes100 = denominationBanknotes100;
            } else if (denominationBanknotes10 < banknotes10) {
                banknotes1 += (banknotes10 - denominationBanknotes10) * 10;
                banknotes10 = denominationBanknotes10;
            }
            System.out.println("Номиналы банкнот : " + "\n100 - " + banknotes100 + " шт." + 
                    "\n10  - "+ banknotes10 + " шт." + "\n1   - " + banknotes1 + " шт." + 
                    "\nИтоговая сумма : " + requiredSum);
        }  
    }
}