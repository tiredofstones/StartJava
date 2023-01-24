public class VariablesTheme {   
    public static void main(String[] args) {
        System.out.println("\nЗадача 1: Вывод значений переменных на консоль");
            System.out.println("\nХарактеристики ноутбука:");
            byte q = 32; 
            System.out.println("\nОперативная память " + q + "ГБ");
            short j = 2560; 
            short k = 1440;
            System.out.println("\nРазрешение экрана " + j + "x" + k);
            int l = 2000;
            System.out.println("\nОбъем жесткого диска " + l + "ГБ");
            long s = 12800;
            System.out.println("\nМодель процессора " + "i7-" + s);
            double g = 3.1;
            System.out.println("\nДиагональ экрана " + g);
            float d = 2900;
            System.out.println("\nЧастота процессора " + d + "Гц");

        System.out.println("\nЗадача 2: Расчет стоимости товара со скидкой");
            double pen = 100, book = 200;
            double disc = 0.11;
            double sumDisc = (pen+book)*disc;
            double sumTotal = (pen+book)*(1-disc);

            System.out.println("\nСумма скидки:" + sumDisc);
            System.out.println("\nСумма товаров со скидкой:" + sumTotal);   

        System.out.println("\nЗадача 3: Вывод слова JAVA");
            System.out.println("\n   J    a  v     v  a       ");
            System.out.println("   J   a a  v   v  a a     ");
            System.out.println("J  J  aaaaa  V V  aaaaa");
            System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\nЗадача 4: Вывод min и max значений целых числовых типов");
            byte by = 127;
            System.out.println("\n"+ by);
            by++;
            System.out.println(by);
            by--;
            System.out.println(by);

            short sh = 32767;
            System.out.println("\n" + sh);
            sh++; 
            System.out.println(sh);
            sh--;
            System.out.println(sh);
            
            int in = 2147483647;
            System.out.println("\n" + in);
            in++;
            System.out.println(in);
            in--;
            System.out.println(in);

            long lo = 9223372036854775807L;
            System.out.println("\n" + lo);
            lo++;
            System.out.println(lo);
            lo--;
            System.out.println(lo);

        System.out.println("\nЗадача 5: Перестановка значений переменных");

            System.out.println("\n5.1 Способ введения третьей переменной");
            int a = 2; 
            int b = 5;
            int c = 0;
            System.out.println("a = " + a + " " + "b = " + b);
            c = a;
            a = b;
            b = c;
            System.out.println("a = " + a + " " + "b = " + b);

            System.out.println("\n5.2 Способ арифметических операций");
            System.out.println("a = " + a + " " + "b = " + b);
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("a = " + a + " " + "b = " + b);

            System.out.println("\n5.3 Способ побитовой операции");
            System.out.println("a = " + a + " " + "b = " + b);
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;
            System.out.println("a = " + a + " " + "b = " + b);

        System.out.println("\nЗадача 6: Вывод символов и их кодов");
            int zx = 35;
            char zxx = (char)zx;
            System.out.println(zx + " " +zxx);
            int zc = 38;
            char zcc = (char)zc;
            System.out.println(zc + " " +zcc);
            int zv = 64;
            char zvv = (char)zv;
            System.out.println(zv + " " +zvv);
            int zb = 94;
            char zbb = (char)zb;
            System.out.println(zb + " " +zbb);
            int zz = 95;
            char zzz = (char)zz;
            System.out.println(zz + " " +zzz);

        System.out.println("\nЗадача 7: Вывод в консоль ASCII-арт Дюка");
            char art1 = (char)47;
            char art2 = (char)92;
            char art3 = (char)95;
            char art4 = (char)40;
            char art5 = (char)41;
            System.out.println("\n     " + art1 + art2);
            System.out.println("    " + art1 + "  " + art2);
            System.out.println("   " + art1 + art3 + art4 + " " +art5 + art2);
            System.out.println("  " + art1 + "      " + art2);
            System.out.println(" " + art1 + art3 + art3 + art3 + art1 + art2 + art3 + art3 + art3 + 
                art2);

        System.out.println("\nЗадача 8: Вывод количества сотен, десятков и единиц числа");
            int num = 123;
            int hun = num/100;
            int ten = num%100/10;
            int one = num%100%10;
            int sum = hun+ten+one;
            System.out.println("\nЧисло" + " " + num + " " + "содержит:" );
            System.out.println(hun + " " + "сотню");
            System.out.println(ten + " " + "десятка");
            System.out.println(one + " " + "единицы");
            System.out.println("\nСумма его цифр =" + " " + sum);
            System.out.println("Произведение его цифр =" + " " + hun * ten * one);

        System.out.println("\nЗадача 9: Вывод времени");
            int time = 86399;
            int hour = time/3600;
            int min = time/60%60;
            int sec = time%60;
            System.out.println("\n" + hour + ":" + min + ":" + sec);
        
        System.out.print("Написано однажды, ");
        System.out.println("работает везде и всегда!");

    }
}
