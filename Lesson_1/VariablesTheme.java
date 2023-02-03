public class VariablesTheme {   
    public static void main(String[] args) {
        System.out.println("\nЗадача 1: Вывод значений переменных на консоль");
        System.out.println("\nХарактеристики ноутбука:");
        byte ram = 32; 
        System.out.println("\nОперативная память " + ram + "ГБ");
        short screen = 2560; 
        short screen1 = 1440;
        System.out.println("\nРазрешение экрана " + screen + "x" + screen1);
        int sizeHdd = 2000;
        System.out.println("\nОбъем жесткого диска " + sizeHdd + "ГБ");
        long cpu = 12800;
        System.out.println("\nМодель процессора " + "i7-" + cpu);
        double diagonal = 3.1;
        System.out.println("\nДиагональ экрана " + diagonal);
        float cpuFrequency = 2900;
        System.out.println("\nЧастота процессора " + cpuFrequency + "Гц");

        System.out.println("\nЗадача 2: Расчет стоимости товара со скидкой");
        double pen = 100, book = 200;
        double discount = 0.11;
        double sumDiscount = (pen + book) * discount;
        double sumTotal = (pen  + book) * (1 - discount);

        System.out.println("\nСумма скидки:" + sumDiscount);
        System.out.println("\nСумма товаров со скидкой:" + sumTotal);   

        System.out.println("\nЗадача 3: Вывод слова JAVA");
        System.out.println("\n   J    a  v     v  a       ");
        System.out.println("   J   a a  v   v  a a     ");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\nЗадача 4: Вывод min и max значений целых числовых типов");
        byte value1 = 127;
        System.out.println("\n" + value1);
        value1++;
        System.out.println(value1);
        value1--;
        System.out.println(value1);

        short value2 = 32767;
        System.out.println("\n" + value2);
        value2++; 
        System.out.println(value2);
        value2--;
        System.out.println(value2);
        
        int value3 = 2147483647;
        System.out.println("\n" + value3);
        value3++;
        System.out.println(value3);
        value3--;
        System.out.println(value3);

        long value4 = 9223372036854775807L;
        System.out.println("\n" + value4);
        value4++;
        System.out.println(value4);
        value4--;
        System.out.println(value4);

        System.out.println("\nЗадача 5: Перестановка значений переменных");

        System.out.println("\n5.1 Способ введения третьей переменной");
        int num1 = 2; 
        int num2 = 5;
        int num3 = 0;
        System.out.println("a = " + num1 + " " + "b = " + num2);
        num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("a = " + num1 + " " + "b = " + num2);

        System.out.println("\n5.2 Способ арифметических операций");
        System.out.println("a = " + num1 + " " + "b = " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("a = " + num1 + " " + "b = " + num2);

        System.out.println("\n5.3 Способ побитовой операции");
        System.out.println("a = " + num1 + " " + "b = " + num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num3;
        num1 = num1 ^ num2;
        System.out.println("a = " + num1 + " " + "b = " + num2);

        System.out.println("\nЗадача 6: Вывод символов и их кодов");
        int symbol1 = 35;
        char codeSymbol = (char) symbol1;
        System.out.println(symbol1 + " " + codeSymbol);
        int symbol2 = 38;
        char codeSymbol2 = (char) symbol2;
        System.out.println(symbol2 + " " + codeSymbol2);
        int symbol3 = 64;
        char codeSymbol3 = (char) symbol3;
        System.out.println(symbol3 + " " + codeSymbol3);
        int symbol4 = 94;
        char codeSymbol4 = (char) symbol4;
        System.out.println(symbol4 + " " + codeSymbol4);
        int symbol5 = 95;
        char codeSymbol5 = (char) symbol5;
        System.out.println(symbol5 + " " + codeSymbol5);

        System.out.println("\nЗадача 7: Вывод в консоль ASCII-арт Дюка");
        char art1 = (char) 47;
        char art2 = (char) 92;
        char art3 = (char) 95;
        char art4 = (char) 40;
        char art5 = (char) 41;
        System.out.println("\n     " + art1 + art2);
        System.out.println("    " + art1 + "  " + art2);
        System.out.println("   " + art1 + art3 + art4 + " " + art5 + art2);
        System.out.println("  " + art1 + "      " + art2);
        System.out.println(" " + art1 + art3 + art3 + art3 + art1 + art2 + art3 + art3 + art3 + 
        art2);

        System.out.println("\nЗадача 8: Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int hundred = num / 100;
        int ten = num % 100 / 10;
        int one = num % 100 % 10;
        int sum = hundred + ten + one;
        System.out.println("\nЧисло" + " " + num + " " + "содержит:");
        System.out.println(hundred + " " + "сотню");
        System.out.println(ten + " " + "десятка");
        System.out.println(one + " " + "единицы");
        System.out.println("\nСумма его цифр =" + " " + sum);
        System.out.println("Произведение его цифр =" + " " + hundred * ten * one);

        System.out.println("\nЗадача 9: Вывод времени");
        int time = 86399;
        int hour = time / 3600;
        int minute = time / 60 % 60;
        int second = time % 60;
        System.out.println("\n" + hour + ":" + minute + ":" + second);
        
        System.out.print("Написано однажды, ");
        System.out.println("работает везде ");

    }
}
