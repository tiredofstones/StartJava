public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1. ПЕРЕВОД ПСЕВДОКОДА НА ЯЗЫК JAVA");
        boolean isMale = true;
        if(!isMale) {
            System.out.println("Человек - женщина");
        } else {
            System.out.println("Человек - мужчина");
        }
        int age = 0;
        if(age > 18) {
            System.out.println("\nЧеловек совершеннолетний");
        } else {
            System.out.println("\nЧеловек не совершеннолетний");
        }
        double height = 0;
        if(height < 1.8) {
            System.out.println("\nЧеловек не высокий");
        } else {
            System.out.println("\nЧеловек высокий");
        }
        char nameFirstLetter = "Denis".charAt(0);
        if(nameFirstLetter == 'M') {
            System.out.println("\nВаше имя начинается с буквы M");
        } else if (nameFirstLetter == 'I') {
            System.out.println("\nВаше имя начинается с буквы I");
        } else {
            System.out.println("\nВаше имя начинается с другой буквы");
        }

        System.out.println("\n2. ПОИСК БОЛЬШЕГО ЧИСЛА");
        int num1 = 11;
        int num2 = 11;
        if (num1 > num2) {
            System.out.println("\n" + num1 + " > " + num2);
        } else if (num2 > num1) {
            System.out.println("\n" + num2 + " > " + num1);
        } else if (num1 == num2) {
            System.out.println("\n" + num1 + " = " + num2);
        }

        System.out.println("\n3. ПРОВЕРКА ЧИСЛА");
        int num3 = -9;
        if (num3 != 0) {
            System.out.print("\n" + num3 + " является ");
            if (num3 > 0) {
                System.out.print("положительным ");
            } else {
                System.out.print("отрицательным ");
            }
            if (num3 % 2 == 0) {
                System.out.println("и четным");
            } else {
                System.out.println("и нечетным");
            }
        } else {
            System.out.println("\nЧисло равно " + num3);
        }
           /* if (num3 % 2 == 0) {
                if (num3 > 0) {
                    System.out.println(num3 + " является положительным и четным");
                } else {
                    System.out.println(num3 + " является отрицательным и четным");
                }
            } else {
                if (num3 > 0) {
                    System.out.println(num3 + " является положительным и нечетным");
                } else {
                    System.out.println(num3 + " является отрицательным и нечетным");
                }
            } 
        } else {
            System.out.println("Число равно " + num3);
        } */


        System.out.println("\n4. ПОИСК ОДИНАКОВЫХ ЦИФР В ЧИСЛАХ");
        System.out.println("\n5. ОПРЕДЕЛЕНИЕ СИМВОЛА ПО ЕГО КОДУ");
        System.out.println("\n6. ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %");
        System.out.println("\n7. ОПРЕДЕЛЕНИЕ ОЦЕНКИ ПО ПРЕДМЕТАМ");
        System.out.println("\n8. РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ");
        System.out.println("\n9. РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ");
        System.out.println("\n9. *РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ");
        System.out.println("\n10. *ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %");
    }
}