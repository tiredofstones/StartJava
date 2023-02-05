public class VariablesTheme {   
    public static void main(String[] args) {
        System.out.println("Задача 1: Вывод значений переменных на консоль");
        System.out.println("Характеристики ноутбука:");
        byte ram = 32; 
        System.out.println("Оперативная память " + ram + "ГБ");
        short screen = 2560; 
        short screen1 = 1440;
        System.out.println("Разрешение экрана " + screen + "x" + screen1);
        int sizeHdd = 2000;
        System.out.println("Объем жесткого диска " + sizeHdd + "ГБ");
        long cpu = 12800;
        System.out.println("Модель процессора " + "i7-" + cpu);
        double diagonal = 3.1;
        System.out.println("Диагональ экрана " + diagonal);
        float cpuFrequency = 2900;
        System.out.println("Частота процессора " + cpuFrequency + "Гц");
        char companyManufacturer = 'M';
        System.out.println("Фирма производитель : " + companyManufacturer + "SI");

        System.out.println("\nЗадача 2: Расчет стоимости товара со скидкой");
        double pricePen = 100, priceBook = 200;
        double discount = 0.11;
        double sumDiscount = (pricePen + priceBook) * discount;
        double discountPrice = (pricePen  + priceBook) * (1 - discount);
        System.out.println("Сумма скидки:" + sumDiscount);
        System.out.println("Сумма товаров со скидкой:" + discountPrice);   

        System.out.println("\nЗадача 3: Вывод слова JAVA");
        System.out.println("\n   J    a  v     v  a       ");
        System.out.println("   J   a a  v   v  a a     ");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\nЗадача 4: Вывод min и max значений целых числовых типов");
        byte maxValueByte = 127;
        System.out.println(maxValueByte + " "  + maxValueByte++ + " " + maxValueByte--);
        short maxValueShort = 32767;
        System.out.println(maxValueShort + " " + maxValueShort++ + " " + maxValueShort--);
        int maxValueInt = 2147483647;
        System.out.println(maxValueInt + " " + maxValueInt++ + " " + maxValueInt--);
        long maxValueLong = 9223372036854775807L;
        System.out.println(maxValueLong + " " + maxValueLong++ + " " + maxValueLong);

        System.out.println("\nЗадача 5: Перестановка значений переменных");

        System.out.println("\n5.1 Способ введения третьей переменной");
        int num1 = 2;
        int num2 = 5;
        System.out.println("a = " + num1 + " " + "b = " + num2);
        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("a = " + num1 + " " + "b = " + num2);

        System.out.println("\n5.2 Способ арифметических операций");
        System.out.println("a = " + num1 + " " + "b = " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("a = " + num1 + " " + "b = " + num2);

        System.out.println("\n5.3 Способ побитовой операции");
        System.out.println("a = " + num1 + " " + "b = " + num2);
        num1 ^= num2;
        num2 = num1 ^ num3;
        num1 ^= num2;
        System.out.println("a = " + num1 + " " + "b = " + num2);

        System.out.println("\nЗадача 6: Вывод символов и их кодов");
        int codeHash = 35;
        System.out.println(codeHash + "-" + (char)codeHash);
        int codeAmpersand = 38;
        System.out.println(codeAmpersand + "-" + (char)codeAmpersand);
        int codeAt = 64;
        System.out.println(codeAt + "-" + (char)codeAt);
        int codeCaret = 94;
        System.out.println(codeCaret + "-" + (char)codeCaret);
        int codeUnderscore = 95;
        System.out.println(codeUnderscore + "-" + (char)codeUnderscore);

        System.out.println("\nЗадача 7: Вывод в консоль ASCII-арт Дюка");
        char forwardSlash = (char)'/';
        char backwardSlash = (char) '\';
        char underscore = (char)'_';
        char leftParentheses = (char)'(';
        char rightParentheses = (char)')';
        System.out.println("\n     " + forwardSlash + backwardSlash);
        System.out.println("    " + forwardSlash + "  " + backwardSlash);
        System.out.println("   " + forwardSlash + underscore + leftParentheses + " " + 
        rightParentheses + backwardSlash);
        System.out.println("  " + forwardSlash + "      " + backwardSlash);
        System.out.println(" " + forwardSlash + underscore + underscore + underscore + forwardSlash
         + backwardSlash + underscore + underscore + underscore + backwardSlash);

        System.out.println("\nЗадача 8: Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int hundreds = num / 100;
        int tens = num % 100 / 10;
        int one = num % 10;
        System.out.println("Число " + num + " содержит:");
        System.out.println(hundreds + " сотню");
        System.out.println(tens + " десятка");
        System.out.println(one + " единицы");
        System.out.println("Сумма его цифр = " + (hundreds + tens + one));
        System.out.println("Произведение его цифр = " + hundreds * tens * one);

        System.out.println("\nЗадача 9: Вывод времени");
        int time = 86399;
        int hour = time / 3600;
        int minute = time / 60 % 60;
        int second = time % 60;
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
