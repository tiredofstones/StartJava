import java.math.BigDecimal;
import java.math.RoundingMode;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Вывод характеристик компьютера");
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

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        double penCost = 105.5;
        double bookCost = 235.83;
        double discount = 0.11;
        System.out.println("Стоимость товаров без скидки - " + (penCost + bookCost));
        System.out.println("Сумма скидки - " + (penCost + bookCost) * discount);
        System.out.println("Стоимость товаров со скидкой - " + ((penCost - (penCost * discount)) + 
                (bookCost - (bookCost * discount))));

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   j    a  v     v  a");
        System.out.println("   j   a a  v   v  a  a");
        System.out.println("j  j  aaaaa  v v  aaaaaa");
        System.out.println(" jj  a     a  v  a      a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte byteValue = 127;
        System.out.println(byteValue + " " + ++byteValue + " " + --byteValue);
        short shortValue = 32767;
        System.out.println(shortValue + " " + ++shortValue + " " + --shortValue);
        int intValue = 2147483647;
        System.out.println(intValue + " " + ++intValue + " " + --intValue);
        long longValue = 9223372036854775807L;
        System.out.println(longValue + " " + ++longValue + " " + --longValue);
        char charValue = 65535;
        System.out.println((int) charValue + " " + (int) ++charValue + " " + (int) --charValue);

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;

        System.out.println("\n5.1 Способ введения третье переменной");
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
        num2 = num1 ^ num2;
        num1 = num1 ^= num2;
        System.out.println("a = " + num1 + " " + "b = " + num2);

        System.out.println("\n6. Вывод символов и их кодов");
        char dollarSymbol = '$';
        char asteriskSymbol = '*';
        char atSymbol = '@';
        char caretSymbol = '^';
        char tildeSymbol = '~';
        System.out.println((int) dollarSymbol + "   " + dollarSymbol + 
                "\n" + (int) asteriskSymbol + "   " + asteriskSymbol + 
                "\n" + (int) atSymbol + "   " + atSymbol + 
                "\n" + (int) caretSymbol + "   " + caretSymbol + 
                "\n" + (int) tildeSymbol + "  " + tildeSymbol);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slashSymbol = '/';
        char backSlashSymbol = '\\';
        char underscoreSymbol = '_';
        char leftParenthesesSymbol = '(';
        char rightParenthesesSymbol = ')';
        System.out.println("     " + slashSymbol + backSlashSymbol + "     " + 
                "\n" + "    " + slashSymbol + "  " + backSlashSymbol + "\n   " + 
                slashSymbol + underscoreSymbol + leftParenthesesSymbol + " " + 
                rightParenthesesSymbol + backSlashSymbol + "\n  " + slashSymbol + "      " + 
                backSlashSymbol + "\n " + slashSymbol + underscoreSymbol + underscoreSymbol + 
                underscoreSymbol + underscoreSymbol + slashSymbol + backSlashSymbol + 
                underscoreSymbol + underscoreSymbol + backSlashSymbol);

        System.out.println("\n8. Манипуляции с сотнями, десятками и единицами числа");
        int num = 123;
        int hundreds = num / 100;
        int tens = num % 100 / 10;
        int units = num % 10;
        System.out.println("Число 123 содержит:" + 
                "\n  сотен - " + hundreds + 
                "\n  десятков - " + tens + 
                "\n  единиц - " + units + 
                "\nСумма разрядов = " + (hundreds + tens + units) + 
                "\nПроизведение разрядов = " + (hundreds * tens * units));

        System.out.println("\n9. Перевод секунд в часы, минуты и секунды");
        int time = 86399;
        int hours = time / 3600;
        int minutes = time / 60 % 60;
        int seconds = time % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);

        System.out.println("\n10. Расчет стоимости товара со скидкой");
        BigDecimal penCost1 = new BigDecimal("105.5");
        BigDecimal bookCost1 = new BigDecimal("235.83");
        BigDecimal discount1 = new BigDecimal("0.11");
        System.out.println("Стоимость товаров без скидки - " + penCost1.add(bookCost1)
                .setScale(2, RoundingMode.HALF_UP));
        System.out.println("Сумма скидки - " + (penCost1.add(bookCost1)).multiply(discount1)
                .setScale(2, RoundingMode.HALF_UP));
        System.out.println("Стоимость товаров со скидкой - " + 
                ((bookCost1.subtract(bookCost1.multiply(discount1)))
                .add(penCost1.subtract(penCost1.multiply(discount1)))
                .setScale(2, RoundingMode.HALF_UP)));
    }
}