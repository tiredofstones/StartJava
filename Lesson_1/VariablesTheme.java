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
        boolean backlight = true;
        System.out.println("Наличие подсветки : " + backlight);

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
        byte maxNumByte = 127;
        System.out.println(maxNumByte + " "  + ++maxNumByte + " " + --maxNumByte);
        short maxNumShort = 32767;
        System.out.println(maxNumShort + " " + ++maxNumShort + " " + --maxNumShort);
        int maxNumInt = 2147483647;
        System.out.println(maxNumInt + " " + ++maxNumInt + " " + --maxNumInt);
        long maxNumLong = 9223372036854775807L;
        System.out.println(maxNumLong + " " + ++maxNumLong + " " + --maxNumLong);

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
        char codeHash = '#';
        System.out.println((int) codeHash + "-" + codeHash);
        char codeAmpersand = '&';
        System.out.println((int) codeAmpersand + "-" + codeAmpersand);
        char codeAt = '@';
        System.out.println((int) codeAt + "-" + codeAt);
        char codeCaret = '^';
        System.out.println((int) codeCaret + "-" + codeCaret);
        char codeUnderscore = '_';
        System.out.println((int) codeUnderscore + "-" + codeUnderscore);

        System.out.println("\nЗадача 7: Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char underscore = '_';
        char leftParentheses = '(';
        char rightParentheses = ')';
        System.out.println("\n     " + slash + backSlash);
        System.out.println("    " + slash + "  " + backSlash);
        System.out.println("   " + slash + underscore + leftParentheses + " " + 
        rightParentheses + backSlash);
        System.out.println("  " + slash + "      " + backSlash);
        System.out.println(" " + slash + underscore + underscore + underscore + slash+ backSlash 
                + underscore + underscore + underscore + backSlash);

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
