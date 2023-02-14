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
    int num3 = 7;
    System.out.println("Число : " + num3);
    if (num3 == 0) {
    } else if (num3 % 2 == 0) {
        System.out.println("Четное");
    } else if (num3 % 2 == 1) {
        System.out.println("Нечетное");
    } 
    if (num3 > 0) {
        System.out.println("Положительное");
    } else if (num3 < 0) {
        System.out.println("Отрицательное");
    } 

    System.out.println("\nЗадача 4. Поиск одинаковых цифр в числах");
    int num4 = 101;
    int num5 = 191;
        System.out.println("Первое число : " + num4 + "  Второе число : " + num5);
    int hundredsNum4 = num4 / 100;
    int hundredsNum5 = num5 / 100;
    int tensNum4 = num4 % 100 / 10;
    int tensNum5 = num5 % 100 / 10;
    int unitsNum4 = num4 % 10;
    int unitsNum5 = num5 % 10;
    if (hundredsNum4 != hundredsNum5 & tensNum4 != tensNum5 & unitsNum4 != unitsNum5) {
        System.out.println("Одинаковых цифр нет!");
    } else { 
        if (hundredsNum4 == hundredsNum5) {
            System.out.println("В сотнях одинаковая цифра : " + hundredsNum4);
        }
        if (tensNum4 == tensNum5) { 
            System.out.println("В десятках одинаковая цифра : " + tensNum4);  
        } 
        if (unitsNum4 == unitsNum5) {
            System.out.println("В единицах одинаковая цифра : " + unitsNum5);
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
    System.out.println("Сумма вклада = " + sumDeposit);
    if (sumDeposit < 100000) {
        int income = sumDeposit / 100 * 5;
        int totalSumDeposit = sumDeposit + income;
        System.out.println("Начисленные проценты = " + income + "\nИтого = " + totalSumDeposit);
    } else if (sumDeposit >= 100000 && sumDeposit <= 300000 ) {
        int income = sumDeposit / 100 * 7;
        int totalSumDeposit = sumDeposit + income;
        System.out.println("Начисленные проценты = " + income + "\nИтого = " + totalSumDeposit);
    } else if (sumDeposit > 300000 ) {
        int income = sumDeposit / 100 * 10;
        int totalSumDeposit = sumDeposit + income;
        System.out.println("Начисленные проценты = " + income + "\nИтого = " + totalSumDeposit);
    }

    System.out.println("\nЗадача 7. Определение оценки по предметам");
    double ratingHistory = 0.59;
    double ratingProgramming = 0.91;
    double averageRating = 0;
    double point1 = 0;
    double point2 = 0;
    double gradePoint = 0;
    if (ratingHistory <= 0.6) {
        point1 = 2;
        System.out.println(point1 + " балла по Истории");
    } else if (ratingHistory > 0.60 && ratingHistory <= 0.73) {
        point1 = 3;
        System.out.println(point1 + " балла по Истории");
    } else if (ratingHistory > 0.73 && ratingHistory <= 0.91) {
        point1 = 4;
        System.out.println(point1 + " балла по Истории");
    } else if (ratingHistory > 0.91) {
        point1 = 5;
        System.out.println(point1 + " балла по Истории");
    }
    if (ratingProgramming <= 0.6) {
        point2 = 2;
        System.out.println(point2 + " балла по Программированию");
    } else if (ratingProgramming > 0.60 && ratingProgramming <= 0.73) {
        point2 = 3;
        System.out.println(point2 + " балла по Программированию");
    } else if (ratingProgramming > 0.73 && ratingProgramming <= 0.91) {
        point2 = 4;
        System.out.println(point2 + " балла по Программированию");
    } else if (ratingProgramming > 0.91) {
        point2 = 5;
        System.out.println(point2 + " балла по Программированию");
    }
    gradePoint = ((point1 + point2) / 2);
        System.out.println("Средний балл по предметам = " + gradePoint);
    averageRating = ((ratingProgramming + ratingHistory) / 2);
        System.out.println("Средний рейтинг по предметам = " + averageRating * 100 + "%");
    
    System.out.println("\nЗадача 8. Расчет прибыли за год");
    int rent = 5000;
    int costPrice = 9000;
    int monthlyIncome = 13000;
    int monthlyProfit = monthlyIncome - costPrice - rent;
    int annualProfit = monthlyProfit * 12;
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
        System.out.println("Номиналы банкнот : " + "\n100 - " + banknotes100 + " шт." + "\n10  - "
        + banknotes10 + " шт." + "\n1   - " + banknotes1 + " шт." + "\nИтоговая сумма : "
        + requiredSum);
    }  
    }
}